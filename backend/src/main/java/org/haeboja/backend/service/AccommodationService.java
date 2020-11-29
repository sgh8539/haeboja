package org.haeboja.backend.service;

import org.haeboja.backend.dao.accommodation.AccommodationRepository;
import org.haeboja.backend.dao.room.RoomRepository;
import org.haeboja.backend.dto.Accommodation;
import org.haeboja.backend.dto.SimpleAccommodation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccommodationService {

    @Autowired
    AccommodationRepository accommodationRepository;

    @Autowired
    RoomRepository roomRepository;

    public List<Accommodation> getAccommodationsByType(String type) {
        return accommodationRepository.findByType(type);
    }

    public List<SimpleAccommodation> getSimpleAccommodationsByType(String type) {
        List<SimpleAccommodation> simpleAccommodations = new ArrayList<>();

        List<Accommodation> accommodations = getAccommodationsByType(type);

        for (Accommodation accommodation: accommodations) {
            SimpleAccommodation simpleAccommodation = new SimpleAccommodation();
            simpleAccommodation.setId(accommodation.getId());
            simpleAccommodation.setName(accommodation.getName());
            simpleAccommodation.setAddress(accommodation.getAddress());
            simpleAccommodation.setScore(accommodation.getScore());

            int lowestPrice = roomRepository.getLowestRoomPriceByHouseId(accommodation.getId());
            simpleAccommodation.setLowestPrice(lowestPrice);

            simpleAccommodations.add(simpleAccommodation);
        }

        return simpleAccommodations;
    }

    public Accommodation getAccommodationsById(long id) {
        return accommodationRepository.findById(id);
    }
}
