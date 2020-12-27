package org.haeboja.backend.service;

import org.haeboja.backend.dao.room.RoomRepository;
import org.haeboja.backend.dto.room.Room;
import org.haeboja.backend.dto.room.RoomDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RoomService {

    @Autowired
    RoomRepository roomRepository;

    @Autowired
    ReservationService reservationService;

    public List<Room> getRoomsByHouseId(long houseId, Date from, Date to) {
        return roomRepository.getRoomsByHouseId(houseId);
    }

    private int calculateAvailableNightStayRooms(int roomCount, long houseId, long roomId, Date from, Date to) {
        int availableNightStayRooms = roomCount;
        int reservedNightStayRooms = reservationService.getNumberOfNightStayReservations(houseId, roomId, from, to);
        int reservedDayStayRooms = reservationService.getNumberOfDayStayReservationsForMultipleDates(houseId, roomId, from, to);

        availableNightStayRooms -= (reservedDayStayRooms + reservedNightStayRooms);
        if (availableNightStayRooms <= 0) {
            return 0;
        }

        return availableNightStayRooms;
    }

    private int[] calculateAvailableDayStayTimes(int roomCount, int roomCloseTime, long houseId, long roomId, Date date) {
        int[] availableDayStayTimes = new int[roomCloseTime + 1];

        int reservedNightStayRooms = reservationService.getNumberOfNightStayReservations(houseId, roomId, date, date);

        for (int time = 1; time < availableDayStayTimes.length; time++) {
            availableDayStayTimes[time] = roomCount - reservedNightStayRooms;
        }

        int[] reservedDayStayTimes = reservationService.getDayStayReservedTimes(houseId, roomId, date);
        for (int time = 1; time < availableDayStayTimes.length; time++) {
            availableDayStayTimes[time] -= reservedDayStayTimes[time];
        }
        return availableDayStayTimes;
    }

    public List<RoomDetail> getAvailableRoomsByHouseId(long houseId, Date from, Date to) {
        List<Room> rooms = getRoomsByHouseId(houseId, from, to);

        List<RoomDetail> roomDetails = new ArrayList<>();

        for (Room room : rooms) {
            RoomDetail roomDetail = new RoomDetail(room);

            int availableNightStayRooms = calculateAvailableNightStayRooms(room.getCount(), houseId, room.getId(), from, to);
            roomDetail.setAvailableNightStayRooms(availableNightStayRooms);

            if (room.getType() == room.TYPE_DAY_STAY_AND_NIGHT_STAY) {
                int[] availableDayStayRoomsByTime = calculateAvailableDayStayTimes(room.getCount(), room.getDayStay().getCloseTime(), houseId, room.getId(), from);
                roomDetail.setAvailableDayStayTimes(availableDayStayRoomsByTime);
            }

            roomDetails.add(roomDetail);
        }

        return roomDetails;
    }
}
