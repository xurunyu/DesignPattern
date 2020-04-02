package com.ps.builder;

public enum Profession {

    WARRIOR, THIEF, MEGA, PRIEST;

    @Override
    public String toString(){
        return name().toLowerCase();
    }
}
