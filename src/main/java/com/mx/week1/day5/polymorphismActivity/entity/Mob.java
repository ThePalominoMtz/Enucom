package com.mx.week1.day5.polymorphismActivity.entity;

public class Mob {

    protected String name;
    protected String color;
    protected int spawnLevel;

    public String showData() {
        return """
                Generic Mob
                Name: %s
                Color: %s
                Spawn Level: %d
                """.formatted(name, color, spawnLevel);
    }

    public Mob() {
    }

    public Mob(String name, String color, int spawnLevel) {
        this.name = name;
        this.color = color;
        this.spawnLevel = spawnLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpawnLevel() {
        return spawnLevel;
    }

    public void setSpawnLevel(int spawnLevel) {
        this.spawnLevel = spawnLevel;
    }
}
