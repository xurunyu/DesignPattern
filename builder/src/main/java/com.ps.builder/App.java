package com.ps.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        Hero thief = new Hero.Builder("KID", Profession.THIEF)
            .withWeapon(Weapon.KNIFE)
            .build();

        LOGGER.info(thief.toString());
    }
}
