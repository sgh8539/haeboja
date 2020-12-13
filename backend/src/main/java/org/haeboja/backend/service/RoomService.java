package org.haeboja.backend.service;

import org.haeboja.backend.dao.room.RoomRepository;
import org.haeboja.backend.dto.room.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RoomService {

    @Autowired
    RoomRepository roomRepository;

    public List<Room> getRoomsByHouseId(long houseId, Date from, Date to){
        List<Room> rooms = roomRepository.getRoomsByHouseId(houseId);
        for (Room room: rooms) {

        }

        return null;
    }
}
