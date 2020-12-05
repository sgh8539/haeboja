package org.haeboja.backend.dto;

import org.springframework.stereotype.Component;

@Component
public class Customer {
    private long id;
    private String name;
    private String nickname;
    private String phoneNumber;

    public Customer() {}

    public Customer(String name, String nickname, String phoneNumber) {
        this.name = name;
        this.nickname = nickname;
        this.phoneNumber = phoneNumber;
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
