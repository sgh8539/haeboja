package org.haeboja.backend.dto.room;

public class DayStay {
    private int closeTime;
    private int usageDuration;
    private int price;

    public DayStay(int closeTime, int usageDuration, int price) {
        this.closeTime = closeTime;
        this.usageDuration = usageDuration;
        this.price = price;
    }

    public int getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(int closeTime) {
        this.closeTime = closeTime;
    }

    public int getUsageDuration() {
        return usageDuration;
    }

    public void setUsageDuration(int usageDuration) {
        this.usageDuration = usageDuration;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
