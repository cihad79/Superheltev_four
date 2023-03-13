package services;

import dto.HeroPowerDTO;
import dto.HeroesCityDTO;
import models.Superhero;
import org.springframework.stereotype.Service;
import repositories.SuperheroRepository_DB;

import java.util.List;

@Service
public
class SuperheroServices {

    private SuperheroRepository_DB superheroRepository_db;

    public SuperheroServices(SuperheroRepository_DB superheroRepository_db) {
        this.superheroRepository_db = superheroRepository_db;
    }

    public  List<Superhero> getSuperhero() {
        return superheroRepository_db.getSuperhero();
    }

    public Superhero searchForSuperhero(String superheroName) {
        return superheroRepository_db.searchForSuperhero(superheroName);
    }

    public List<HeroPowerDTO> getSuperheroPowerCount() {
        return superheroRepository_db.getSuperheroesWithPower();
    }


    public List<HeroesCityDTO> getSuperheroCity(String superheroName, String CityName, int city_id ) {
        return superheroRepository_db.getSuperheroesWithCity(superheroName, CityName, city_id);
    }


}
