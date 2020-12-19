package org.haeboja.backend.dto.room;

import org.springframework.stereotype.Component;

@Component
public class Room {
    private long id;
    private long houseId;
    private String name;
    private int type;
    private DayStay dayStay;
    private NightStay nightStay;
    private byte[] photos;
    private String info;
    private int count;

    public static final int ONLY_NIGHT_STAY = 1;
    public static final int DAY_AND_NIGHT_STAY = 2; // motel

    public Room() {}

    public Room(long id, long houseId, String name, int type, DayStay dayStay, byte[] photos, String info, int count) {
        this.id = id;
        this.houseId = houseId;
        this.name = name;
        this.type = type;
        this.photos = photos;
        this.info = info;
        this.dayStay = dayStay;
        this.nightStay = null;
        this.count = count;

    }

    public Room(long id, long houseId, String name, int type, NightStay nightStay, byte[] photos, String info, int count) {
        this.id = id;
        this.houseId = houseId;
        this.name = name;
        this.type = type;
        this.photos = photos;
        this.info = info;
        this.dayStay = null;
        this.nightStay = nightStay;
        this.count = count;

    }

    public Room(long id, long houseId, String name, int type, DayStay dayStay, NightStay nightStay, byte[] photos, String info, int count) {
        this.id = id;
        this.houseId = houseId;
        this.name = name;
        this.type = type;
        this.dayStay = dayStay;
        this.nightStay = nightStay;
        this.photos = photos;
        this.info = info;
        this.count = count;
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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
