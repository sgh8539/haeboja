package org.haeboja.backend.dao.reservation;

import org.haeboja.backend.dto.reservation.Reservation;

import java.util.Date;
import java.util.List;

public interface ReservationRepository {
    long save(Reservation reservation);

    List<Reservation> getReservationsByHouseIdAndRoomId(long houseId, long roomId);

    int getNumberOfNightStayReservations(long houseId, long roomId, Date from, Date to);

    int getNumberOfDayStayReservations(long houseId, long roomId, Date date);

    int getNumberOfDayStayReservationsForMultipleDates(long houseId, long roomId, Date from, Date to);

    int[] getDayStayReservedTimes(long houseId, long roomId, Date date);
}
