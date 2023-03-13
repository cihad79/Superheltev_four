package dto;

public class HeroDTO {
    private int hero_id;
    private String superheroName;
    private String realName;
    private int createdYear;
    private String isHuman;
    private int strength;

    public HeroDTO(int hero_id, String superheroName, String realName,
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
        this.superheroName = superheroName;
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

    public String getIsHuman() {
        return isHuman;
    }

    public void setIsHuman(String isHuman) {
        this.isHuman = isHuman;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "HeroDTO:" +
                "hero_id:" + hero_id +
                "superheroName:" + superheroName + '\'' +
                "realName:" + realName + '\'' +
                "createdYear:" + createdYear +
                "isHuman:" + isHuman + '\'' +
                "strength:" + strength;
    }
}
