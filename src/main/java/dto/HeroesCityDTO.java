package dto;

public class HeroesCityDTO {
    private String superheroName;
    private String cityName;
    private int city_id;

    public HeroesCityDTO(String superheroName, String cityName, int city_id) {
        this.superheroName = superheroName;
        this.cityName = cityName;
        this.city_id = city_id;
    }

    public String getSuperheroName() {
        return superheroName;
    }

    public void setSuperheroName(String superheroName) {
        this.superheroName = superheroName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    @Override
    public String toString() {
        return "HeroesCityDTO" +
                "superheroName:" + superheroName + '\'' +
                ", cityName:" + cityName + '\'' +
                ", city_id:" + city_id;
    }
}
