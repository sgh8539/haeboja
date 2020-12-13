package org.haeboja.backend.dao.reservation;

import org.haeboja.backend.dto.reservation.Reservation;

import java.util.List;

public interface ReservationRepository {
    long save(Reservation reservation);

    List<Reservation> getReservationsByHouseIdAndRoomId(long houseId, long roomId);
}
