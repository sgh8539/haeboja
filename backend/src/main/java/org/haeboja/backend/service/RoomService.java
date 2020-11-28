package org.haeboja.backend.service;

import org.haeboja.backend.dao.room.RoomRepository;
import org.haeboja.backend.dto.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RoomService {

    @Autowired
    RoomRepository roomRepository;

    @Autowired
    Room room;

    public List<Room> getRoomsByHouseId(long houseId, Date selDate, Date selDate2) {
        /*List<Room> rooms = roomRepository.getRoomsByHouseId(houseId);
        Map<String, String> returnValue = new HashMap<String, String>();

        for(Room room : rooms){
            returnValue.put("roomName", room.getName()); // 방 이름
            returnValue.put("checkInTime", room.getCheckInTime()); // 입실시간
            returnValue.put("checkOutTime", room.getCheckOutTime()); // 퇴실시간
            returnValue.put("nightStayPrice", room.getNightStayPrice()); // 숙박가격
            returnValue.put("nightStayFlag", "true"); // 숙박 가능 여부 - 추후 조건 추가
            if(room.getStyle().equals("")) { // style이 대실/숙박 정보가 맞는지..?
                returnValue.put("closeTime", room.getCloseTime()); // 마감시간
                returnValue.put("usageDuration", room.getUsageDuration()); // 이용시간
                returnValue.put("dayStayPrice", room.getDayStayPrice()); // 대실가격
                returnValue.put("dayStayFlag", "true"); // 대실 가능 여부 - 추후 조건 추가
            }
            returnValue.put("roomInfo", room.getInfo()); // 객실이용안내
        }*/

        List<Room> rooms = new ArrayList<Room>();

        // 대실, 숙박 가능 여부 추가 - 예약 Service 만든 후 수정
        for(Room room: roomRepository.getRoomsByHouseId(houseId)) {
            room.setDayStayFlag(true);
            if(room.getStyle().equals(""))
                room.setNightStayFlag(true);
            rooms.add(room);
        }

        return rooms;
    }
}
