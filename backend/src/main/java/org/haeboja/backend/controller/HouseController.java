package org.haeboja.backend.controller;

import org.haeboja.backend.dto.*;
import org.haeboja.backend.dto.house.House;
import org.haeboja.backend.dto.house.HouseDetail;
import org.haeboja.backend.dto.house.SimpleHouse;
import org.haeboja.backend.dto.room.Room;
import org.haeboja.backend.dto.room.RoomDetail;
import org.haeboja.backend.service.HouseService;
import org.haeboja.backend.service.EventService;
import org.haeboja.backend.service.ReviewService;
import org.haeboja.backend.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/product")
public class HouseController {

    @Autowired
    private HouseService houseService;

    @Autowired
    private RoomService roomService;

    @Autowired
    private EventService eventService;

    @Autowired
    private ReviewService reviewService;

    @GetMapping("/search/")
    List<SimpleHouse> getMotels() {
        return houseService.getSimpleHousesByType("motel");
    }

    @GetMapping("/search/2")
    List<SimpleHouse> getHotels() {
        return houseService.getSimpleHousesByType("hotel");
    }

    @GetMapping("/search/3")
    List<SimpleHouse> getPensions() {
        return houseService.getSimpleHousesByType("pension");
    }

    @GetMapping("/search/4")
    List<SimpleHouse> getResorts() {
        return houseService.getSimpleHousesByType("resort");
    }

    @GetMapping("/search/5")
    List<SimpleHouse> getCampings() {
        return houseService.getSimpleHousesByType("camping");
    }


    @GetMapping("/search/6")
    List<SimpleHouse> getGuestHouses() {
        return houseService.getSimpleHousesByType("guestHouse");
    }

    @GetMapping("/search/7")
    List<SimpleHouse> getHanoks() {
        return houseService.getSimpleHousesByType("hanok");
    }

    @GetMapping("/detail")
    HouseDetail getHouseDetail(@RequestParam("ano") long houseId,
                               @RequestParam("adcno") String houseType,
                               @RequestParam("sel_date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date from,
                               @RequestParam("sel_date2") @DateTimeFormat(pattern = "yyyy-MM-dd") Date to) {
        House house = houseService.getHousesById(houseId);
        List<Event> events = eventService.getEventsByHouseId(houseId);
        List<RoomDetail> rooms = roomService.getAvailableRoomsByHouseId(houseId, from, to);
        List<Review> reviews = reviewService.getReviewsByHouseId(houseId);

        HouseDetail houseDetail = new HouseDetail(house, events, rooms, reviews);

        return houseDetail;
    }
}
