package org.haeboja.backend.dao.room;

import org.haeboja.backend.dto.room.Room;

import java.util.List;

public interface RoomRepository {
    long save(Room room);

    List<Room> getRoomsByHouseId(long houseId);

    int getDayStayLowestPriceByHouseId(long houseId);

    int getNightStayLowestPriceByHouseId(long houseId);
}
