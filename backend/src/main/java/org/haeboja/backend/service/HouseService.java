package org.haeboja.backend.service;

import org.haeboja.backend.dao.house.HouseRepository;
import org.haeboja.backend.dao.room.RoomRepository;
import org.haeboja.backend.dto.house.House;
import org.haeboja.backend.dto.house.SimpleHouse;
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
            long houseId = house.getId();

            int dayStayLowestPrice = roomRepository.getDayStayLowestPriceByHouseId(houseId);
            int nightStayLowestPrice = roomRepository.getNightStayLowestPriceByHouseId(houseId);

            simpleHouse.setId(houseId);
            simpleHouse.setName(house.getName());
            simpleHouse.setAddress(house.getAddress());
            simpleHouse.setScore(house.getScore());
            simpleHouse.setDayStayLowestPrice(dayStayLowestPrice);
            simpleHouse.setNightStayLowestPrice(nightStayLowestPrice);

            simpleHouses.add(simpleHouse);
        }

        return simpleHouses;
    }

    public House getHousesById(long id) {
        return houseRepository.findById(id);
    }
}
