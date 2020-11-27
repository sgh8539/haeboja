package org.haeboja.backend.controller;

import org.haeboja.backend.dao.accommodation.AccommodationRepository;
import org.haeboja.backend.dto.Accommodation;
import org.haeboja.backend.service.AccommodationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/product/search")
public class AccommodationController {

    @Autowired
    private AccommodationService accommodationService;

    @GetMapping("/")
    List<Accommodation> getMotels() {
        return accommodationService.getAccommodationsByType("motel");
    }

    @GetMapping("/2")
    List<Accommodation> getHotels() {
        return accommodationService.getAccommodationsByType("hotel");
    }

    @GetMapping("/3")
    List<Accommodation> getPensions() {
        return accommodationService.getAccommodationsByType("pension");
    }

    @GetMapping("/4")
    List<Accommodation> getResorts() {
        return accommodationService.getAccommodationsByType("resort");
    }

    @GetMapping("/5")
    List<Accommodation> getCampings() {
        return accommodationService.getAccommodationsByType("camping");
    }

    @GetMapping("/6")
    List<Accommodation> getGuestHouses() {
        return accommodationService.getAccommodationsByType("guestHouse");
    }

    @GetMapping("/7")
    List<Accommodation> getHanoks() {
        return accommodationService.getAccommodationsByType("hanok");
    }

}
