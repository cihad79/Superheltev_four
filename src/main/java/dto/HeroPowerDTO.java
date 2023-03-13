package dto;

import models.Superhero;

public class HeroPowerDTO {

    private String superheroAbilities;
    private int power_id;
    private String superheroName;

    public HeroPowerDTO(String superheroAbilities,  String superheroName, int power_id) {
        this.superheroAbilities = superheroAbilities;
        this.power_id = power_id;
        this.superheroName = superheroName;
    }

    public String getSuperheroAbilities() {
        return superheroAbilities;
    }

    public void setSuperheroAbilities(String superheroAbilities) {
        this.superheroAbilities = superheroAbilities;
    }

    public int getPower_id() {
        return power_id;
    }

    public void setPower_id(int power_id) {
        this.power_id = power_id;
    }

    public String getSuperheroName() {
        return superheroName;
    }

    public void setSuperheroName(String superheroName) {
        this.superheroName = superheroName;
    }

    @Override
    public String toString() {
        return "HeroPowerDTO{" +
                " superhero:" + superheroName + '\'' +
                "superheroAbilitites:" + superheroAbilities + '\'' +
                "power_id:" + power_id;

    }
}
