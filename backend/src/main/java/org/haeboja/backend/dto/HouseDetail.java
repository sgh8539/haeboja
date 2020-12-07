package org.haeboja.backend.dto;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HouseDetail {
    House house;
    List<Event> events;
    List<Room> rooms;

    public HouseDetail() {}

    public HouseDetail(House house, List<Event> events, List<Room> rooms){
        this.house = house;
        this.events = events;
        this.rooms = rooms;
    }
}
