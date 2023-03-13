package models;

public class Superhero {
    private int hero_id;
    private String superheroName;
    private String realName;
    private int createdYear;
    private String isHuman;
    private int strength;

    public Superhero(int hero_id, String superheroName, String realName,
                     int createdYear, String isHuman, int strength) {
        this.hero_id = hero_id;
        this.superheroName = superheroName;
        this.realName = realName;
        this.createdYear = createdYear;
        this.isHuman = isHuman;
        this.strength = strength;
    }


    public int getHero_id() {
        return hero_id;
    }

    public void setHero_id(int hero_id) {
        this.hero_id = hero_id;
    }

    public String getSuperheroName() {
        return superheroName;
    }

    public void setSuperheroName(String superheroName) {
        superheroName = superheroName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }


    public int getCreatedYear() {
        return createdYear;
    }

    public void setCreatedYear(int createdYear) {
        this.createdYear = createdYear;
    }

    public String isHuman() {
        return isHuman;
    }

    public void setHuman(String human) {
        isHuman = human;
    }

    @Override
    public String toString() {
        return "Superhero" +
                "hero_id:" + hero_id +
                "SuperheroName:" + superheroName + '\'' +
                "realName:" + realName + '\'' +
                "createdYear:" + createdYear +
                "isHuman:" + isHuman +
                "strength:" + strength;
    }
}