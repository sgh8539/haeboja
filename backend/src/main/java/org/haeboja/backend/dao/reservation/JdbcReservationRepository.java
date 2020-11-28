package org.haeboja.backend.dao.reservation;

import org.haeboja.backend.dto.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@Repository
<<<<<<< HEAD
public class JdbcReservationRepository implements ReservationRepository{
=======
public class JdbcReservationRepository implements ReservationRepository {
>>>>>>> e42f4d9638a6c6622b2cb7ffbceb3a9e7ff0acbe

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public List<Reservation> getReservationCountByHouseIdAndRoomId(long houseId, long roomId){
<<<<<<< HEAD
//        return jdbcTemplate.query(
//                "select count(*) from reservation where houseId = ? and roomId = ?"
//        );
        return null;
=======
        /*return jdbcTemplate.query(
                "select count(*) from reservation where houseId = ? and roomId = ?"
        );*/
>>>>>>> e42f4d9638a6c6622b2cb7ffbceb3a9e7ff0acbe
    }

}
