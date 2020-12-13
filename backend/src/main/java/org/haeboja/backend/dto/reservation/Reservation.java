package org.haeboja.backend.dto.reservation;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Reservation {
    private long id;
    private long userId;
    private long houseId;
    private long roomId;
    private DayStay dayStay;
    private NightStay nightStay;
    private int price;

    public Reservation() {}

    public Reservation(long id, long userId, long houseId, long roomId, DayStay dayStay, int price){
        this.id = id;
        this.userId = userId;
        this.houseId = houseId;
        this.roomId = roomId;
        this.dayStay = dayStay;
        this.nightStay = null;
        this.price = price;
    }

    public Reservation(long id, long userId, long houseId, long roomId, NightStay nightStay, int price){
        this.id = id;
        this.userId = userId;
        this.houseId = houseId;
        this.roomId = roomId;
        this.dayStay = null;
        this.nightStay = nightStay;
        this.price = price;
    }

    public Reservation(long id, long userId, long houseId, long roomId, DayStay dayStay, NightStay nightStay, int price){
        this.id = id;
        this.userId = userId;
        this.houseId = houseId;
        this.roomId = roomId;
        this.dayStay = dayStay;
        this.nightStay = nightStay;
        this.price = price;
    }

    public long getId(){
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId(){
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getHouseId() {
        return houseId;
    }

    public void setHouseId(long houseId) {
        this.houseId = houseId;
    }

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public DayStay getDayStay() {
        return dayStay;
    }

    public void setDayStay(DayStay dayStay) {
        this.dayStay = dayStay;
    }

    public NightStay getNightStay() {
        return nightStay;
    }

    public void setNightStay(NightStay nightStay) {
        this.nightStay = nightStay;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

}
