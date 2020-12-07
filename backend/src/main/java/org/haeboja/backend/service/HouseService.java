package org.haeboja.backend.service;

import org.haeboja.backend.dao.house.HouseRepository;
import org.haeboja.backend.dao.room.RoomRepository;
import org.haeboja.backend.dto.House;
import org.haeboja.backend.dto.SimpleHouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HouseService {

    @Autowired
    HouseRepository houseRepository;

    @Autowired
    RoomRepository roomRepository;

    public List<House> getHousesByType(String type) {
        return houseRepository.findByType(type);
    }

    public List<SimpleHouse> getSimpleHousesByType(String type) {
        List<SimpleHouse> simpleHouses = new ArrayList<>();

        List<House> houses = getHousesByType(type);

        for (House house : houses) {
            SimpleHouse simpleHouse = new SimpleHouse();
            simpleHouse.setId(house.getId());
            simpleHouse.setName(house.getName());
            simpleHouse.setAddress(house.getAddress());
            simpleHouse.setScore(house.getScore());

            int lowestPrice = roomRepository.getLowestRoomPriceByHouseId(house.getId());
            simpleHouse.setLowestPrice(lowestPrice);

            simpleHouses.add(simpleHouse);
        }

        return simpleHouses;
    }

    public House getHousesById(long id) {
        return houseRepository.findById(id);
    }
}
