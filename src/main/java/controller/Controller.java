package controller;

import dto.HeroDTO;
import dto.HeroPowerDTO;
import dto.HeroesCityDTO;
import models.Superhero;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import services.SuperheroServices;

import java.util.List;

@org.springframework.stereotype.Controller
@RequestMapping("superhero")
public class Controller {

    private SuperheroServices superheroServices;

    public Controller(SuperheroServices superheroServices) {
        this.superheroServices = superheroServices;
    }

   /* @GetMapping("/")
    public ResponseEntity<Superhero> getListOfSuperheroes() {
        Superhero superheroList = (Superhero) SuperheroServices.getSuperhero();
        return new ResponseEntity<Superhero>(superheroList, HttpStatus.OK);
    }*/ //todo = make this

    @GetMapping("/{superheroName}")
    public ResponseEntity<Superhero> getSuperhero(@PathVariable String superheroName) {
        Superhero superhero = superheroServices.searchForSuperhero(superheroName);
        return new ResponseEntity<>(superhero, HttpStatus.OK);
    }

    @GetMapping("/city/{cityName}")
    public ResponseEntity<List<HeroesCityDTO>> getSuperheroCity(@PathVariable String superheroName, String cityName, int city_id) {
        List<HeroesCityDTO> superheroCity = superheroServices.getSuperheroCity(superheroName, cityName, city_id);
        return new ResponseEntity<>(superheroCity, HttpStatus.OK);
    }








}
