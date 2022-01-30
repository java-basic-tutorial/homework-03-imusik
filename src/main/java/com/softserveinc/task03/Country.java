package com.softserveinc.task03;

import com.softserveinc.task02.City;

import java.util.ArrayList;
import java.util.List;

public class Country {
    private String name;
    private String continent;
    private String code;
    private City capital;
    private List<City> cities;

    public Country() {
    }

    public Country(String name, String continent, String code, City capital) {
        this.name = name;
        this.continent = continent;
        this.code = code;
        this.capital = capital;
        this.cities = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public String toString() {
        return this.name + ", " + this.continent + ", " + this.code
                + ", Capital: " + this.capital.getName()
                + ", Cities: " + this.cities;
    }

    public void addCity(City city) {
        this.cities.add(city);
    }

    public int getInhabitants() {
        int count = 0;
        for (City city : this.cities) {
            count = count + city.getInhabitants();
        }
        return count;
    }
}
