package com.mx.week1.day4.InheritanceActivity;

public class normalUser extends User {

    private String normalActivities;
    private String normalRoom;

    public normalUser(int id, String name, String lastname, int age, boolean isOnline, String normalActivities, String normalRoom) {
        super(id, name, lastname, age, isOnline);
        this.normalActivities = normalActivities;
        this.normalRoom = normalRoom;
    }

    public String getNormalActivities() {
        return normalActivities;
    }

    public void setNormalActivities(String normalActivities) {
        this.normalActivities = normalActivities;
    }

    public String getNormalRoom() {
        return normalRoom;
    }

    public void setNormalRoom(String normalRoom) {
        this.normalRoom = normalRoom;
    }

    @Override
    public String toString() {
        return "normalUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", isOnline=" + isOnline +
                ", normalActivities='" + normalActivities + '\'' +
                ", normalRoom='" + normalRoom + '\'' +
                '}';
    }
}
