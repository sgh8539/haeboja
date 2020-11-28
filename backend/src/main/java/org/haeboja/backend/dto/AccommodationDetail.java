package org.haeboja.backend.dto;

import java.util.List;

public class AccommodationDetail {
    Accommodation accommodation;
    //List<Event> events;
    List<Room> rooms;

    public AccommodationDetail(Accommodation accommodation, List<Room> rooms){
        this.accommodation = accommodation;
        this.rooms = rooms;
    }
}
