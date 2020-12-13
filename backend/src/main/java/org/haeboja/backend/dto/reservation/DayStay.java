package org.haeboja.backend.dto.reservation;

import java.util.Date;

public class DayStay {
    private Date date;
    private int checkInTime;

    public DayStay(Date checkInDate, int checkInTime) {
        this.checkInTime = checkInTime;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(int checkInTime) {
        this.checkInTime = checkInTime;
    }
}
