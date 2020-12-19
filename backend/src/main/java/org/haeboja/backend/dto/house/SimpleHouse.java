package org.haeboja.backend.dto.house;

import org.springframework.stereotype.Component;

@Component
public class SimpleHouse {
    private long id;
    private String name;
    private String address;
    private double score;
    private int dayStayLowestPrice;
    private int nightStayLowestPrice;

    public SimpleHouse() {}

    public SimpleHouse(long id, String name, String address, double score, int lowerPrice, int nightStayLowestPrice) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.score = score;
        this.dayStayLowestPrice = lowerPrice;
        this.nightStayLowestPrice = nightStayLowestPrice;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getDayStayLowestPrice() {
        return dayStayLowestPrice;
    }

    public void setDayStayLowestPrice(int dayStayLowestPrice) {
        this.dayStayLowestPrice = dayStayLowestPrice;
    }

    public int getNightStayLowestPrice() {
        return nightStayLowestPrice;
    }

    public void setNightStayLowestPrice(int nightStayLowestPrice) {
        this.nightStayLowestPrice = nightStayLowestPrice;
    }
}
