package org.haeboja.backend.dao.reservation;

import org.haeboja.backend.dto.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@Repository
public class JdbcReservationRepository implements ReservationRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Reservation> getReservationCountByHouseIdAndRoomId(long houseId, long roomId){
        /*return jdbcTemplate.query(
                "select count(*) from reservation where houseId = ? and roomId = ?"
        );*/
    }
}
