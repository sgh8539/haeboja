package org.haeboja.backend.dto;

import org.springframework.stereotype.Component;

@Component
public class SimpleAccommodation {
    private long id;
    private String name;
    private String address;
    private double score;
    private int lowestPrice;

    public SimpleAccommodation() {}

    public SimpleAccommodation(long id, String name, String address, double score, int lowerPrice) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.score = score;
        this.lowestPrice = lowerPrice;
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

    public int getLowestPrice() {
        return lowestPrice;
    }

    public void setLowestPrice(int lowestPrice) {
        this.lowestPrice = lowestPrice;
    }
}
