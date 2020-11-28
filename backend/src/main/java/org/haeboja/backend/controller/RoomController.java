package org.haeboja.backend.controller;

import org.haeboja.backend.dto.Room;
import org.haeboja.backend.service.RoomService;
import org.springframework.web.bind.annotation.*;
import org.haeboja.backend.dto.Accommodation;
import org.haeboja.backend.service.AccommodationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

class AccommodationDetailInfo {
    Accommodation accommodation;
    //List<Event> events;
    List<Room> rooms;
}

@RestController
@RequestMapping(value = "/product/detail")
public class RoomController {

    @Autowired
    private AccommodationService accommodationService;

    @Autowired
    private RoomService roomService;

    @GetMapping()
    AccommodationDetailInfo getRoomDetail(@RequestParam("ano") long accommodationId, @RequestParam("adcno") String accommodationType, @RequestParam("sel_date") Date selDate, @RequestParam("sel_date2") Date selDate2) {
        AccommodationDetailInfo accommodationDetailInfo = new AccommodationDetailInfo();

        // 숙소 정보 가져오기
        accommodationDetailInfo.accommodation = accommodationService.getAccommodationsById(accommodationId);
        // 숙소 이벤트 가져오기
        //accommodationDetailInfo.event = eventService.getEventByHouseId();
        // 객실 리스트 가져오기
        accommodationDetailInfo.rooms = roomService.getRoomsByHouseId(String.valueOf(accommodationId), selDate, selDate2);

        return accommodationDetailInfo;
    }
}
