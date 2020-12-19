package org.haeboja.backend.dto.room;

public class NightStay {
    private int checkInTime;
    private int checkOutTime;
    private int price;

    public NightStay(int checkInTime, int checkOutTime, int price) {
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
        this.price = price;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
