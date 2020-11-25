package org.haeboja.backend.dao.room;

import org.haeboja.backend.dto.Accommodation;
import org.haeboja.backend.dto.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcRoomRepository implements RoomRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;


//    private long id;
//    private long houseId;
//    private String name;
//    private String style;
//    private int checkInTime;
//    private int checkOutTime;
//    private int nightStayPrice;
//    private int closeTime;
//    private int usageDuration;
//    private int dayStayPrice;
//    private String info;
//    private int count;
    @Override
    public long save(Room room) {
        return jdbcTemplate.update(
                "insert into room (id, houseId, name, style, checkInTime, checkOutTime, nightStayPrice, closeTime, usageDuration, datyStayPrice, photos, info, count) values (?,?,?,?,?,?,?,?,?,?,?,?,?)",
                room.getId(),
                room.getHouseId(),
                room.getName(),
                room.getStyle(),
                room.getCheckInTime(),
                room.getCheckOutTime(),
                room.getNightStayPrice(),
                room.getCloseTime(),
                room.getUsageDuration(),
                room.getDayStayPrice(),
                room.getPhotos(),
                room.getInfo(),
                room.getCount()
        );
    }

    @Override
    public List<Room> getRoomsByHouseId(String houseId) {
        return jdbcTemplate.query(
                "select * from room where houseId = ?",
                new Object[]{houseId},
                (rs, rowNum) ->
                        new Room(
                                rs.getLong("id"),
                                rs.getLong("houseId"),
                                rs.getString("name"),
                                rs.getString("style"),
                                rs.getInt("checkInTime"),
                                rs.getInt("checkOutTime"),
                                rs.getInt("nightStayPrice"),
                                rs.getInt("closeTime"),
                                rs.getInt("usageDuration"),
                                rs.getInt("dayStayPrice"),
                                rs.getBytes("photos"),
                                rs.getString("info"),
                                rs.getInt("count")
                        )

        );
    }
}
