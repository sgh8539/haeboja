package org.haeboja.backend.dto;

import org.springframework.stereotype.Component;

@Component
public class Review {
    private long id;
    private String author;
    private long houseId;
    private String roomName;
    private double score;
    private String title;
    private String contents;

    public Review() {}

    public Review(long id, String author, long houseId, String roomName, double score, String title, String contents) {
        this.id = id;
        this.author = author;
        this.houseId = houseId;
        this.roomName = roomName;
        this.score = score;
        this.title = title;
        this.contents = contents;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getHouseId() {
        return houseId;
    }

    public void setHouseId(long houseId) {
        this.houseId = houseId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
