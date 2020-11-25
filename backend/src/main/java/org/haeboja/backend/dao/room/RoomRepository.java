package org.haeboja.backend.dao.room;

import org.haeboja.backend.dto.Room;

import java.util.List;

public interface RoomRepository {
    long save(Room room);

    List<Room> getRoomsByHouseId(String houseId);
}
