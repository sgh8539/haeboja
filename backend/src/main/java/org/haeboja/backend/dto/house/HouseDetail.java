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

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public List<RoomDetail> getRooms() {
        return rooms;
    }

    public void setRooms(List<RoomDetail> rooms) {
        this.rooms = rooms;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
}
