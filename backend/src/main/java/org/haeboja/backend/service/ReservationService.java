package org.haeboja.backend.service;

import org.haeboja.backend.dao.reservation.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    @Autowired
    ReservationRepository reservationRepository;

    public Integer getReservationCountByHouseIdAndRoomId(long houseId, long roomId) {
        return reservationRepository.getReservationCountByHouseIdAndRoomId(houseId, roomId);
    }
}
