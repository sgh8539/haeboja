package org.haeboja.backend.dao.reservation;

import org.haeboja.backend.dto.Reservation;

import java.util.List;

public interface ReservationRepository {
    List<Reservation> getReservationCountByHouseIdAndRoomId(long houseId, long roomId);
}
