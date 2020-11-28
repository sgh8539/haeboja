package org.haeboja.backend.dao.reservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;`

@Repository
public class JdbcReservationRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Reservation> getReservationCountByHouseIdAndRoomId(long houseId, long roomId){
        return jdbcTemplate.query(
                "select count(*) from reservation where houseId = ? and roomId = ?"
        );
    }
}
