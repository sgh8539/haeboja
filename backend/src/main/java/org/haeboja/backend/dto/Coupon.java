package org.haeboja.backend.dto;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Coupon {
    private long id;
    private String userId;
    private String name;
    private int discount;
    private Date fromDate;
    private Date toDate;
    private String usableHouses;

    public Coupon() {}

    public Coupon(long id, String userId, String name, int discount, Date fromDate, Date toDate, String usableHouses) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.discount = discount;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.usableHouses = usableHouses;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String userId() { return userId; }

    public void setUserId() { this.userId = userId; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getUsableHouses() {
        return usableHouses;
    }

    public void setUsableHouses(String usableHouses) {
        this.usableHouses = usableHouses;
    }
}
