package repositories;


import models.Superhero;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SuperheroRepository {

  private ArrayList<Superhero> superheroes = new ArrayList<>();

  public Superhero createSuperhero(Superhero superhero) {
    superheroes.add(superhero);
    return superhero;
  }

  public ArrayList<Superhero> getSuperheroes() {
    return superheroes;
  }

  public List<Superhero> searchSuperhero(String superheroName) {
    return superheroes.stream()
            .filter(s -> s.getSuperheroName().toLowerCase().startsWith(superheroName.toLowerCase()))
            .collect(Collectors.toList());
  }



  public Superhero editSuperhero(Superhero superhero) {
    for (Superhero hero : superheroes) {
      if (hero.getSuperheroName().equals(superhero.getSuperheroName())) {
        int index = superheroes.indexOf(hero);
        superheroes.set(index, superhero);
        return superhero;
      }
    }
    return null;
  }



  public List<Superhero> deleteSuperhero(Superhero superhero) {
    List<Superhero> heroesToDelete = searchSuperhero(superhero.getSuperheroName());
    superheroes = (ArrayList<Superhero>) superheroes.stream()
            .filter(hero -> !heroesToDelete.contains(hero))
            .collect(Collectors.toList());
    return heroesToDelete;
  }


}

