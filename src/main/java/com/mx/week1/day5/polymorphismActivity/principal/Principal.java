package com.mx.week1.day5.polymorphismActivity.principal;

import com.mx.week1.day5.polymorphismActivity.entity.Creeper;
import com.mx.week1.day5.polymorphismActivity.entity.Mob;
import com.mx.week1.day5.polymorphismActivity.entity.Skeleton;
import com.mx.week1.day5.polymorphismActivity.entity.Zombie;

public class Principal {


    public static void main(String[] args) {

        Mob[] mobs = new Mob[4];
        mobs[0] = new Mob("Blaze", "Orange", 0);
        mobs[1] = new Zombie("Zombie", "Blue", 4, true);
        mobs[2] = new Skeleton("Skeleton", "White", 2, 3);
        mobs[3] = new Creeper("Creeper", "Green", 5, 3);

        for (Mob mob : mobs) {
            System.out.println(mob.showData());
        }
    }

}
