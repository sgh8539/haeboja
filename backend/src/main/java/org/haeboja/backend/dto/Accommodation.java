package org.haeboja.backend.dto;

public class Accommodation {
    private long id;
    private String type;
    private String style;
    private String name;
    private String address;
    private double score;
    private String ownerWords;
    private byte[] photos;
    private String info;

    public Accommodation(long id,
                         String type,
                         String style,
                         String name,
                         String address,
                         double score,
                         String ownerWords,
                         byte[] photos,
                         String info) {
        this.id = id;
        this.type = type;
        this.style = style;
        this.name = name;
        this.address = address;
        this.score = score;
        this.ownerWords = ownerWords;
        this.photos = photos;
        this.info = info;
    }

    public long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getStyle() {
        return style;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getScore() {
        return score;
    }

    public String getOwnerWords() {
        return ownerWords;
    }

    public byte[] getPhotos() {
        return photos;
    }

    public String getInfo() {
        return info;
    }
}

