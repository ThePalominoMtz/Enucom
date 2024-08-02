package com.mx.week1.day5.polymorphismActivity.entity;

public class Skeleton extends Mob {

    private int enchantedBowLevel;

    @Override
    public String showData() {
        return """
                Skeleton Mob
                Name: %s
                Color: %s
                Spawn Level: %d
                Enchanted Bow Level: %s
                """.formatted(name, color, spawnLevel, enchantedBowLevel);
    }

    public Skeleton() {
    }

    public Skeleton(String name, String color, int spawnLevel, int enchantedBowLevel) {
        super(name, color, spawnLevel);
        this.enchantedBowLevel = enchantedBowLevel;
    }

    public int getEnchantedBowLevel() {
        return enchantedBowLevel;
    }

    public void setEnchantedBowLevel(int enchantedBowLevel) {
        this.enchantedBowLevel = enchantedBowLevel;
    }

    @Override
    public String toString() {
        return "Skeleton{" +
               "enchantedBowLevel=" + enchantedBowLevel +
               ", name='" + name + '\'' +
               ", color='" + color + '\'' +
               ", spawnLevel=" + spawnLevel +
               '}';
    }
}
