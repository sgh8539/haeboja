package org.haeboja.backend.dto;

import java.util.List;

public class AccommodationDetail {
    Accommodation accommodation;
    List<Event> events;
    List<Room> rooms;

    public AccommodationDetail() {}

    public AccommodationDetail(Accommodation accommodation, List<Event> events, List<Room> rooms){
        this.accommodation = accommodation;
        this.events = events;
        this.rooms = rooms;
    }
}
