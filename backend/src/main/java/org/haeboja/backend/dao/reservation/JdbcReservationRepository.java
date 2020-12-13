package org.haeboja.backend.dao.reservation;

import org.haeboja.backend.dto.reservation.DayStay;
import org.haeboja.backend.dto.reservation.NightStay;
import org.haeboja.backend.dto.reservation.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcReservationRepository implements ReservationRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;

//    private long id;
//    private long userId;
//    private long houseId;
//    private long roomId;
//    private DayStay dayStay;
//    private NightStay nightStay;
//    private int price;

    public long save(Reservation reservation) {
        if (reservation.getDayStay() != null) {
            return jdbcTemplate.update("insert into house (id, userId, houseId, roomId, date, checkInTime, price)" +
                            "values (?,?,?,?,?,?,?)",
                    reservation.getId(),
                    reservation.getUserId(),
                    reservation.getHouseId(),
                    reservation.getRoomId(),
                    reservation.getDayStay().getDate(),
                    reservation.getDayStay().getCheckInTime(),
                    reservation.getPrice()
            );
        } else {
            return jdbcTemplate.update("insert into house (id, userId, houseId, roomId, checkInDate, checkOutDate, price)" +
                            "values (?,?,?,?,?,?,?)",
                    reservation.getId(),
                    reservation.getUserId(),
                    reservation.getHouseId(),
                    reservation.getRoomId(),
                    reservation.getNightStay().getCheckInDate(),
                    reservation.getNightStay().getCheckOutDate(),
                    reservation.getPrice()
            );
        }

    }

    @Override
    public List<Reservation> getReservationsByHouseIdAndRoomId(long houseId, long roomId) {
        return jdbcTemplate.query(
                "select * from room where houseId = ? and roomId = ?",
                new Object[]{houseId, roomId},
                (rs, rowNum) ->

                        new Reservation(
                                rs.getLong("id"),
                                rs.getLong("userId"),
                                rs.getLong("houseId"),
                                rs.getLong("roomId"),
                                new DayStay(
                                        rs.getDate("date"),
                                        rs.getInt("checkInTime")
                                ),
                                new NightStay(
                                        rs.getDate("checkInDate"),
                                        rs.getDate("checkOutDate")
                                ),
                                rs.getInt("price")
                        )

                );
    }

}
