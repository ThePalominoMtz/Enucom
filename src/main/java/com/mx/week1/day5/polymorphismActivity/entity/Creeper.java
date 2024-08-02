package com.mx.week1.day5.polymorphismActivity.entity;

public class Creeper extends Mob {

    private int fuseTimer;

    @Override
    public String showData() {
        return """
                Creeper Mob
                Name: %s
                Color: %s
                Spawn Level: %d
                Fuse Timer: %d
                """.formatted(name, color, spawnLevel, fuseTimer);
    }

    public Creeper() {
    }

    public Creeper(String name, String color, int spawnLevel, int fuseTimer) {
        super(name, color, spawnLevel);
        this.fuseTimer = fuseTimer;
    }

    public int getFuseTimer() {
        return fuseTimer;
    }

    public void setFuseTimer(int fuseTimer) {
        this.fuseTimer = fuseTimer;
    }

    @Override
    public String toString() {
        return "Creeper{" +
               "fuseTimer=" + fuseTimer +
               ", name='" + name + '\'' +
               ", color='" + color + '\'' +
               ", spawnLevel=" + spawnLevel +
               '}';
    }
}
