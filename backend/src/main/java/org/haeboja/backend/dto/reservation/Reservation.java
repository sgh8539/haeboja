package org.haeboja.backend.dto.reservation;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Reservation {
    private long id;
    private long userId;
    private long houseId;
    private long roomId;
    private int type;
    private Date checkInDate;
    private Date checkOutDate;
    private int checkInTime;
    private int checkOutTime;
    private int price;

    public static final int NIGHT_STAY = 1;
    public static final int DAY_STAY = 2; // motel

    public Reservation() {}

    public Reservation(long id, long userId, long houseId, long roomId, int type, Date checkInDate, Date checkOutDate, int checkInTime, int checkOutTime, int price) {
        this.id = id;
        this.userId = userId;
        this.houseId = houseId;
        this.roomId = roomId;
        this.type = type;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public int getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(int checkInTime) {
        this.checkInTime = checkInTime;
    }

    public int getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(int checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

}
