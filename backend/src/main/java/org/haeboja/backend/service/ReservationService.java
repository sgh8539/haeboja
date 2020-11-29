package org.haeboja.backend.service;

import org.haeboja.backend.dao.reservation.ReservationRepository;
import org.haeboja.backend.dto.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    @Autowired
    ReservationRepository reservationRepository;

    public List<Reservation> getReservationCountByHouseIdAndRoomId(long houseId, long roomId) {
        return reservationRepository.getReservationCountByHouseIdAndRoomId(houseId, roomId);
    }
}
