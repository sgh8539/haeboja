package org.haeboja.backend.controller;

import org.haeboja.backend.dao.accommodation.AccommodationRepository;
import org.haeboja.backend.dto.Accommodation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/product/search")
public class AccommodationController {

    @Autowired
    private AccommodationRepository accommodationRepo;

    @GetMapping("/")
    List<Accommodation> getMotels() {
        return accommodationRepo.findByType("motel");
    }

    @GetMapping("/2")
    List<Accommodation> getHotels() {
        return accommodationRepo.findByType("hotel");
    }

    @GetMapping("/3")
    List<Accommodation> getPensions() {
        return accommodationRepo.findByType("pension");
    }

    @GetMapping("/4")
    List<Accommodation> getResorts() {
        return accommodationRepo.findByType("resort");
    }

    @GetMapping("/5")
    List<Accommodation> getCampings() {
        return accommodationRepo.findByType("camping");
    }

    @GetMapping("/6")
    List<Accommodation> getGuestHouses() {
        return accommodationRepo.findByType("guestHouse");
    }

    @GetMapping("/7")
    List<Accommodation> getHanoks() {
        return accommodationRepo.findByType("hanok");
    }

}
