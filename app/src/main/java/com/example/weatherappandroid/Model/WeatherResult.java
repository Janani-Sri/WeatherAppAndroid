package com.example.weatherappandroid.Model;

import com.firebase.client.Firebase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;

public class WeatherResult {
    private Coord coord ;
    private List<Weather> weather;
    private String base;
    private Main main;
    private int visibility;
    private Wind wind;
    private Clouds clouds;
    private int dt;
    private Sys sys;
    private int timezone;
    private int id;
    private String name;
    private int cod;

//    DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference();
//    WeatherResult city_name = new WeatherResult();

    public WeatherResult() {
    }



    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
//        city_name.coord=coord;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
//        city_name.base=base;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
//        city_name.wind=wind;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
//        this.clouds = clouds;
    }

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
//        city_name.dt=dt;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public int getTimezone() {
        return timezone;
    }

    public void setTimezone(int timezone) {
        this.timezone = timezone;
//        city_name.timezone = timezone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
//        city_name.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
//        city_name.name=name;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
//        city_name.weather=weather;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
//        city_name.cod = cod;
//        rootRef.child(this.name).setValue(this.name,this.coord);
    }






}
