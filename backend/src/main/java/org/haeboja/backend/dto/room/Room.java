package org.haeboja.backend.dto.room;

import org.springframework.stereotype.Component;



@Component
public class Room {
    private long id;
    private long houseId;
    private String name;
    private String style;
    private DayStay dayStay;
    private NightStay nightStay;
    private byte[] photos;
    private String info;

    public Room() {}

    public Room(long id, long houseId, String name, String style, DayStay dayStay, byte[] photos, String info) {
        this.id = id;
        this.houseId = houseId;
        this.name = name;
        this.style = style;
        this.photos = photos;
        this.info = info;
        this.dayStay = dayStay;
        this.nightStay = null;
    }

    public Room(long id, long houseId, String name, String style, NightStay nightStay, byte[] photos, String info) {
        this.id = id;
        this.houseId = houseId;
        this.name = name;
        this.style = style;
        this.photos = photos;
        this.info = info;
        this.dayStay = null;
        this.nightStay = nightStay;
    }

    public Room(long id, long houseId, String name, String style, DayStay dayStay, NightStay nightStay, byte[] photos, String info) {
        this.id = id;
        this.houseId = houseId;
        this.name = name;
        this.style = style;
        this.dayStay = dayStay;
        this.nightStay = nightStay;
        this.photos = photos;
        this.info = info;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getHouseId() {
        return houseId;
    }

    public void setHouseId(long houseId) {
        this.houseId = houseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
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

    public byte[] getPhotos() {
        return photos;
    }

    public void setPhotos(byte[] photos) {
        this.photos = photos;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
