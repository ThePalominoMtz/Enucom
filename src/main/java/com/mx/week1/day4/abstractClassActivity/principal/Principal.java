package com.mx.week1.day4.abstractClassActivity.principal;

import com.mx.week1.day4.abstractClassActivity.entity.Keyboard;
import com.mx.week1.day4.abstractClassActivity.entity.Mouse;

public class Principal {
    public static void main(String[] args) {

        // Keyboard Instance
        Keyboard keyboard = new Keyboard("Black Widow", "Black", "Razer", 100, false, "US", true);
        keyboard.purpose();
        keyboard.information(keyboard.getColor(), keyboard.getSize());

        // Separator
        System.out.println();

        // Mouse Instance
        Mouse mouse = new Mouse("G502HERO", "Black", "Logitech", 50, true, 2000, true);
        mouse.purpose();
        mouse.information(mouse.getColor(), mouse.getSize());
    }
}
