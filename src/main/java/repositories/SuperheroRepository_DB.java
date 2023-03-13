package repositories;

import dto.HeroPowerDTO;
import dto.HeroesCityDTO;
import models.Superhero;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SuperheroRepository_DB {

    public List<Superhero> getSuperhero() {
        List<Superhero> superheroList = new ArrayList<>();
        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306")) {
            String sql = "select * from SUPERHERO;";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int hero_id = resultSet.getInt("hero_id");
                String superheroName = resultSet.getString("superheroName");
                String realName = resultSet.getString("realName");
                int createdYear = resultSet.getInt("createdYear");
                String isHuman = resultSet.getString("isHuman");
                int strength = resultSet.getInt("strength");
                superheroList.add(new Superhero(hero_id, superheroName, realName, createdYear, isHuman, strength));
            }
            return superheroList;

        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }


    public Superhero searchForSuperhero(String superheroName) {
        Superhero superheroSearchName = null;

        try  (
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306")) {
            String SQL = "select * from superhero where superheroName = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, superheroName);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                int hero_id = resultSet.getInt("hero_id");
                String superheroNameColumn = resultSet.getString("superheroName");
                String realName = resultSet.getString("realName");
                int createdYear = resultSet.getInt("discoveryYear");
                String isHuman = resultSet.getString("isHuman");
                int strength = resultSet.getInt("strength");
                superheroSearchName = new Superhero(hero_id, superheroNameColumn, realName,
                        createdYear, isHuman, strength);

            }
            return superheroSearchName;

        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }



    public List<HeroesCityDTO> getSuperheroesWithCity(String superheroName, String cityName, int city_id) {
        List<HeroesCityDTO> superheroes = new ArrayList<>();
        String sql = "SELECT s.superheroname, c.cityname " +
                "FROM superhero s " +
                "LEFT JOIN city c ON s.cityid = c.cityid " +
                "GROUP BY s.superheroname";
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/superheroes");
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                resultSet.getString("superheroName");
                 resultSet.getString("cityName");
                 resultSet.getInt("city_id");
                superheroes.add(new HeroesCityDTO(superheroName, cityName, city_id));
            }
            return superheroes;
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    public List<HeroPowerDTO> getSuperheroesWithPower() {
        List<HeroPowerDTO> superheroes = new ArrayList<>();
        String sql = "select superhero.*, superpower.*\n" +
                "from  superhero inner join superpower\n" +
                "on superhero.superheroName = superpower.superpower";
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/superheroes", "root", "Qhr96wmr2k");
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                String superheroName = resultSet.getString("superheroName");
                String superheroAbilities = resultSet.getString("superheroAbilities");
                int power_id = resultSet.getInt("power_id");
                superheroes.add(new HeroPowerDTO(superheroName,superheroAbilities, power_id));
            }
            return superheroes;

        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }



}


