package org.haeboja.backend.dto.house;

import org.haeboja.backend.dto.Event;
import org.haeboja.backend.dto.Review;
import org.haeboja.backend.dto.room.Room;
import org.haeboja.backend.dto.room.RoomDetail;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HouseDetail {
    House house;
    List<Event> events;
    List<RoomDetail> rooms;
    List<Review> reviews;

    public HouseDetail() {}

    public HouseDetail(House house, List<Event> events, List<RoomDetail> rooms, List<Review> reviews){
        this.house = house;
        this.events = events;
        this.rooms = rooms;
        this.reviews = reviews;
    }
}
