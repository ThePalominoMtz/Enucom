package com.mx.week1.day5.polymorphismActivity.entity;

public class Zombie extends Mob {

    private boolean canPickALoot;

    @Override
    public String showData() {
        return """
                Zombie Mob
                Name: %s
                Color: %s
                Spawn Level: %d
                Can Pick a Loot: %s
                """.formatted(name, color, spawnLevel, canPickALoot);
    }

    public Zombie() {
    }

    public Zombie(String name, String color, int spawnLevel, boolean canPickALoot) {
        super(name, color, spawnLevel);
        this.canPickALoot = canPickALoot;
    }

    public boolean isCanPickALoot() {
        return canPickALoot;
    }

    public void setCanPickALoot(boolean canPickALoot) {
        this.canPickALoot = canPickALoot;
    }

    @Override
    public String toString() {
        return "Zombie{" +
               "canPickALoot=" + canPickALoot +
               ", name='" + name + '\'' +
               ", color='" + color + '\'' +
               ", spawnLevel=" + spawnLevel +
               '}';
    }
}
