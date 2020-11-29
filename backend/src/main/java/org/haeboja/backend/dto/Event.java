package org.haeboja.backend.dto;

public class Event {
    long id;
    long houseId;
    String name;
    String info;

    public Event() {}

    public Event(long id, long houseId, String name, String info) {
        this.id = id;
        this.houseId = houseId;
        this.name = name;
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

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
