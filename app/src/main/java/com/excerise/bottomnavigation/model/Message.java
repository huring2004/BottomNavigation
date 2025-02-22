package com.excerise.bottomnavigation.model;

public class Message {
    private int id_image;
    private String name, title, hour;

    public Message(int id_image, String name, String title, String hour) {
        this.id_image = id_image;
        this.name = name;
        this.title = title;
        this.hour = hour;
    }

    public int getId_image() {
        return id_image;
    }

    public void setId_image(int id_image) {
        this.id_image = id_image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }
}
