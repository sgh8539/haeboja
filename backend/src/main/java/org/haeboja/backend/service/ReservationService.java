package org.haeboja.backend.service;

import org.haeboja.backend.dao.reservation.ReservationRepository;
import org.haeboja.backend.dto.reservation.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReservationService {

    @Autowired
    ReservationRepository reservationRepository;

    public List<Reservation> getReservationsByHouseIdAndRoomId(long houseId, long roomId) {
        return reservationRepository.getReservationsByHouseIdAndRoomId(houseId, roomId);
    }

    public int getNumberOfNightStayReservations(long houseId,
                                                long roomId,
                                                Date from,
                                                Date to) {
        return reservationRepository.getNumberOfNightStayReservations(houseId, roomId, from, to);
    }

    public int getNumberOfDayStayReservations(long houseId, long roomId, Date date) {
        return reservationRepository.getNumberOfDayStayReservations(houseId, roomId, date);
    }

    public int getNumberOfDayStayReservationsForMultipleDates(long houseId, long roomId, Date from, Date to) {
        return reservationRepository.getNumberOfDayStayReservationsForMultipleDates(houseId, roomId, from, to);
    }

    public int[] getDayStayReservedTimes(long houseId, long roomId, Date date) {
        return reservationRepository.getDayStayReservedTimes(houseId, roomId, date);
    }

}
