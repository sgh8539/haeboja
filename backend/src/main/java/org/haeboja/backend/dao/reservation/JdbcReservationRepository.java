package org.haeboja.backend.dao.reservation;

import org.haeboja.backend.dto.reservation.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Types;
import java.util.*;

@Repository
public class JdbcReservationRepository implements ReservationRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private long id;
    private long userId;
    private long houseId;
    private long roomId;
    private int type;
    private Date checkInDate;
    private Date checkOutDate;
    private int checkInTime;
    private int checkOutTime;
    private int price;

    public long save(Reservation reservation) {
        return jdbcTemplate.update("insert into house (id, userId, houseId, roomId, type, checkInDate, checkOutDate, checkInTime, checkOutTime, price)" +
                        "values (?,?,?,?,?,?,?)",
                reservation.getId(),
                reservation.getUserId(),
                reservation.getHouseId(),
                reservation.getRoomId(),
                reservation.getType(),
                reservation.getCheckInDate(),
                reservation.getCheckOutDate(),
                reservation.getCheckInTime(),
                reservation.getCheckOutTime(),
                reservation.getPrice()
        );

    }

    @Override
    public List<Reservation> getReservationsByHouseIdAndRoomId(long houseId, long roomId) {
        return jdbcTemplate.query(
                "select * from room where house_id = ? and room_id = ?",
                new Object[]{houseId, roomId},
                (rs, rowNum) ->
                        new Reservation(
                                rs.getLong("id"),
                                rs.getLong("userId"),
                                rs.getLong("houseId"),
                                rs.getLong("roomId"),
                                rs.getInt("type"),
                                rs.getDate("check_in_date"),
                                rs.getDate("check_out_date"),
                                rs.getInt("check_in_time"),
                                rs.getInt("check_out_time"),
                                rs.getInt("price")
                        )

        );
    }

    @Override
    public int getNumberOfNightStayReservations(long houseId,
                                                long roomId,
                                                Date checkInDate,
                                                Date checkOutDate) {

        Date nextDayOfCheckOut = checkOutDate;
        Calendar c = Calendar.getInstance();
        c.setTime(nextDayOfCheckOut);
        c.add(Calendar.DATE, 1);
        nextDayOfCheckOut = c.getTime();

        String sql = "select count(*) from reservation " +
                "where house_id = ? and room_id = ? and check_in_date <= ? and check_out_date > ? and type = ?";
        Object[] args = new Object[]{houseId, roomId, checkInDate, nextDayOfCheckOut, Reservation.NIGHT_STAY};
        int[] argTypes = new int[]{Types.BIGINT, Types.BIGINT, Types.DATE, Types.DATE, Types.INTEGER};

        int reservationCount = 0;

        Integer count = jdbcTemplate.queryForObject(sql, args, argTypes, Integer.class);
        if (count != null) {
            reservationCount += count;
        }

        sql = "select count(*) from reservation " +
                "where house_id = ? and room_id = ? and check_in_date > ? and check_in_date < ? and type = ?";
        args = new Object[]{houseId, roomId, checkInDate, checkInDate, Reservation.NIGHT_STAY};
        count = jdbcTemplate.queryForObject(sql, args, argTypes, Integer.class);
        if (count != null) {
            reservationCount += count;
        }

        return reservationCount;

    }

    @Override
    public int getNumberOfDayStayReservations(long houseId, long roomId, Date date) {
        String sql = "select count(*) from reservation " +
                "where house_id = ? and room_id = ? and check_in_date = ? and type = ?";
        Object[] args = new Object[]{houseId, roomId, checkInDate, Reservation.NIGHT_STAY};
        int[] argTypes = new int[]{Types.BIGINT, Types.BIGINT, Types.DATE, Types.INTEGER};

        Integer count = jdbcTemplate.queryForObject(sql, args, argTypes, Integer.class);
        if (count == null) {
            return 0;
        }
        return count;
    }

    @Override
    public int getNumberOfDayStayReservationsForMultipleDates(long houseId, long roomId, Date from, Date to) {
        Date date = from;

        Calendar c = Calendar.getInstance();
        c.setTime(date);

        int maxReservationCount = 0;

        while (!date.equals(to)) {
            int count = getNumberOfDayStayReservations(houseId, roomId, date);
            if (maxReservationCount < count) {
                maxReservationCount = count;
            }
            c.add(Calendar.DATE, 1);
            date = c.getTime();
        }

        return maxReservationCount;
    }

    @Override
    public int[] getDayStayReservedTimes(long houseId, long roomId, Date date) {
        int[] reservedTimes = new int[25];

        for (int i=0; i<reservedTimes.length; i++) {
            reservedTimes[i] = 0;
        }

        String sql = "select check_in_time, check_out_time from reservation where house_id = ? and room_id = ? and check_in_date = ? and type = ?";

        Object[] args = new Object[]{houseId, roomId, date, Reservation.DAY_STAY};
        int[] argTypes = new int[]{Types.BIGINT, Types.BIGINT, Types.DATE, Types.INTEGER};
        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql, args, argTypes);

        for (Map<String, Object> row : rows) {
            int checkInTime = (Integer) row.get("check_in_time");
            int checkOutTime = (Integer) row.get("check_out_time");
            for (int time = checkInTime; time < checkOutTime; time++) {
                reservedTimes[time]++;
            }
        }
        return reservedTimes;

    }



}
