package org.haeboja.backend.dto;

import java.util.Date;

public class Room {
    private long id;
    private long houseId;
    private String name;
    private String style;
    private int checkInTime;
    private int checkOutTime;
    private int nightStayPrice;
    private int closeTime;
    private int usageDuration;
    private int dayStayPrice;
    private byte[] photos;
    private String info;
    private int count;

    public Room(long id, long houseId, String name, String style, int checkInTime, int checkOutTime, int nightStayPrice, int closeTime, int usageDuration, int dayStayPrice, byte[] photos, String info, int count) {
        this.id = id;
        this.houseId = houseId;
        this.name = name;
        this.style = style;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
        this.nightStayPrice = nightStayPrice;
        this.usageDuration = usageDuration;
        this.dayStayPrice = dayStayPrice;
        this.photos = photos;
        this.info = info;
        this.count = count;
    }

    public long getId() {
        return id;
    }

    public long getHouseId() {
        return houseId;
    }

    public String getName() {
        return name;
    }

    public String getStyle() {
        return style;
    }

    public int getCheckInTime() {
        return checkInTime;
    }

    public int getCheckOutTime() {
        return checkOutTime;
    }

    public int getNightStayPrice() {
        return nightStayPrice;
    }

    public int getCloseTime() {
        return closeTime;
    }

    public int getUsageDuration() {
        return usageDuration;
    }

    public int getDayStayPrice() {
        return dayStayPrice;
    }

    public byte[] getPhotos() {
        return photos;
    }

    public String getInfo() {
        return info;
    }

    public int getCount() {
        return count;
    }
}
