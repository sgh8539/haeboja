package org.haeboja.backend.controller;

import org.haeboja.backend.dao.accommodation.AccommodationRepository;
import org.haeboja.backend.dto.Accommodation;
import org.haeboja.backend.dto.AccommodationDetail;
import org.haeboja.backend.dto.Room;
import org.haeboja.backend.service.AccommodationService;
import org.haeboja.backend.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/product")
public class AccommodationController {

    @Autowired
    private AccommodationService accommodationService;

    @Autowired
    private RoomService roomService;

    @GetMapping("/search/")
    List<Accommodation> getMotels() {
        return accommodationService.getAccommodationsByType("motel");
    }

    @GetMapping("/search/2")
    List<Accommodation> getHotels() {
        return accommodationService.getAccommodationsByType("hotel");
    }

    @GetMapping("/search/3")
    List<Accommodation> getPensions() {
        return accommodationService.getAccommodationsByType("pension");
    }

    @GetMapping("/search/4")
    List<Accommodation> getResorts() {
        return accommodationService.getAccommodationsByType("resort");
    }

    @GetMapping("/search/5")
    List<Accommodation> getCampings() {
        return accommodationService.getAccommodationsByType("camping");
    }

    @GetMapping("/search/6")
    List<Accommodation> getGuestHouses() {
        return accommodationService.getAccommodationsByType("guestHouse");
    }

    @GetMapping("/search/7")
    List<Accommodation> getHanoks() {
        return accommodationService.getAccommodationsByType("hanok");
    }

    @GetMapping("/detail")
    AccommodationDetail getRoomDetail(@RequestParam("ano") long accommodationId, @RequestParam("adcno") String accommodationType, @RequestParam("sel_date") Date selDate, @RequestParam("sel_date2") Date selDate2) {


        // 숙소 정보 가져오기
        Accommodation accommodation = accommodationService.getAccommodationsById(accommodationId);
        // 숙소 이벤트 가져오기
        //accommodationDetailInfo.event = eventService.getEventByHouseId();
        // 객실 리스트 가져오기
        List<Room> rooms = roomService.getRoomsByHouseId(String.valueOf(accommodationId), selDate, selDate2);

        AccommodationDetail accommodationDetailInfo = new AccommodationDetail(accommodation, rooms);

        return accommodationDetailInfo;
    }
}
