package org.haeboja.backend.dto;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
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
