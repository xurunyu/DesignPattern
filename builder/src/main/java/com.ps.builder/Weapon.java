package com.ps.builder;

public enum Weapon {

    SWORD, AXE, HAMMER, KNIFE;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
