package com.ps.builder;


public class Hero {

    private Weapon weapon;
    private Profession profession;
    private String name;

    public Hero(Builder builder) {
        this.name = builder.name;
        this.profession = builder.profession;
        this.weapon = builder.weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Profession getProfession() {
        return profession;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("This is a ")
            .append(profession)
            .append(", named ")
            .append(name);
        if (weapon != null) {
            sb.append(" wielding a ")
                .append(weapon);
        }
        return sb.toString();
    }

    public static class Builder{
        private String name;
        private Profession profession;
        private Weapon weapon;

        public Builder(String name, Profession profession) {
            if (name == null || profession == null) {
                throw new IllegalArgumentException("name and prefession can not be null");
            }
            this.name = name;
            this.profession = profession;
        }


        public Builder withWeapon(Weapon weapon) {
            this.weapon = weapon;
            return this;
        }

        public Hero build() {
            return new Hero(this);
        }
    }

}

