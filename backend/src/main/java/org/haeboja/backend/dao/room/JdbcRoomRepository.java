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
                "insert into room (id, houseId, name, style, closeTime, usageDuration, dayStayPrice, dayStayCount, checkInTime, checkOutTime, nightStayPrice, nightStayCount, photos, info) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
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
                "select * from room where houseId = ?",
                new Object[]{houseId},
                (rs, rowNum) ->
                        new Room(
                                rs.getLong("id"),
                                rs.getLong("houseId"),
                                rs.getString("name"),
                                rs.getString("style"),
                                new DayStay(
                                        rs.getInt("closeTime"),
                                        rs.getInt("usageDuration"),
                                        rs.getInt("dayStayPrice"),
                                        rs.getInt("dayStayCount")
                                ),
                                new NightStay(
                                        rs.getInt("checkInTime"),
                                        rs.getInt("checkOutTime"),
                                        rs.getInt("nightStayPrice"),
                                        rs.getInt("nightStayCount")
                                ),
                                rs.getBytes("photos"),
                                rs.getString("info")
                        )

        );
    }

    public int getDayStayLowestPriceByHouseId(long houseId) {
        List<Integer> dayStayPriceList = new ArrayList<>();
        jdbcTemplate.query(
                "select DAY_STAY_PRICE from ROOM where houseId = ?",
                new Object[]{houseId},
                (rs, rowNum) ->
                        dayStayPriceList.add(rs.getInt("DAY_STAY_PRICE"))
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
                "select NIGHT_STAY_PRICE from ROOM where houseId = ?",
                new Object[]{houseId},
                (rs, rowNum) ->
                        nightStayPriceList.add(rs.getInt("NIGHT_STAY_PRICE"))
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
