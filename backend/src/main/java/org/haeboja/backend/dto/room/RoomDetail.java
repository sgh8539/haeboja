package org.haeboja.backend.dto.room;

import java.util.List;

public class RoomDetail {
    private Room room;
    private int[] availableDayStayTimes;
    private int availableNightStayRooms;

    public RoomDetail() {
    }

    public RoomDetail(Room room) {
        this.room = room;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int[] getAvailableDayStayTimes() {
        return availableDayStayTimes;
    }

    public void setAvailableDayStayTimes(int[] availableDayStayTimes) {
        this.availableDayStayTimes = availableDayStayTimes;
    }

    public int getAvailableNightStayRooms() {
        return availableNightStayRooms;
    }

    public void setAvailableNightStayRooms(int availableNightStayRooms) {
        this.availableNightStayRooms = availableNightStayRooms;
    }
}
