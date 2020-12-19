package org.haeboja.backend.dao.room;

import org.haeboja.backend.dto.room.DayStay;
import org.haeboja.backend.dto.room.NightStay;
import org.haeboja.backend.dto.room.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JdbcRoomRepository implements RoomRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public long save(Room room) {
        return jdbcTemplate.update(
                "insert into room (id, house_id, name, style, close_time, usage_duration, day_stay_price, day_stay_count, check_in_time, check_out_time, night_stay_price, night_stay_count, photos, info) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
                room.getId(),
                room.getHouseId(),
                room.getName(),
                room.getStyle(),
                room.getDayStay().getCloseTime(),
                room.getDayStay().getUsageDuration(),
                room.getDayStay().getPrice(),
                room.getDayStay().getCount(),
                room.getNightStay().getCheckInTime(),
                room.getNightStay().getCheckOutTime(),
                room.getNightStay().getPrice(),
                room.getNightStay().getCount(),
                room.getPhotos(),
                room.getInfo()
        );
    }

    @Override
    public List<Room> getRoomsByHouseId(long houseId) {
        return jdbcTemplate.query(
                "select * from room where house_id = ?",
                new Object[]{houseId},
                (rs, rowNum) ->
                        new Room(
                                rs.getLong("id"),
                                rs.getLong("house_id"),
                                rs.getString("name"),
                                rs.getString("style"),
                                new DayStay(
                                        rs.getInt("close_time"),
                                        rs.getInt("usage_duration"),
                                        rs.getInt("day_stay_price"),
                                        rs.getInt("day_stay_count")
                                ),
                                new NightStay(
                                        rs.getInt("check_in_time"),
                                        rs.getInt("check_out_time"),
                                        rs.getInt("night_stay_price"),
                                        rs.getInt("night_stay_count")
                                ),
                                rs.getBytes("photos"),
                                rs.getString("info")
                        )

        );
    }

    public int getDayStayLowestPriceByHouseId(long houseId) {
        List<Integer> dayStayPriceList = new ArrayList<>();
        jdbcTemplate.query(
                "select day_stay_price from room where house_id = ?",
                new Object[]{houseId},
                (rs, rowNum) ->
                        dayStayPriceList.add(rs.getInt("day_stay_price"))
        );

        int lowestPrice = Integer.MAX_VALUE;
        for (int dayStayPrice: dayStayPriceList) {
            if (dayStayPrice < lowestPrice) {
                lowestPrice = dayStayPrice;
            }
        }

        return lowestPrice;
    }

    public int getNightStayLowestPriceByHouseId(long houseId) {
        List<Integer> nightStayPriceList = new ArrayList<>();
        jdbcTemplate.query(
                "select night_stay_price from room where house_id = ?",
                new Object[]{houseId},
                (rs, rowNum) ->
                        nightStayPriceList.add(rs.getInt("night_stay_price"))
        );

        int lowestPrice = Integer.MAX_VALUE;
        for (int nightStayPrice: nightStayPriceList) {
            if (nightStayPrice < lowestPrice) {
                lowestPrice = nightStayPrice;
            }
        }

        return lowestPrice;
    }
}
