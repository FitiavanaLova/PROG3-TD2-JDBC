package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private int id;
    private String name;
    private Continent_enum continent;
    private List<Player> players;

    public Team(){
        this.players=new ArrayList<>();
    }

    public Team(int id, String name, Continent_enum continent, List<Player> players) {
        this.id = id;
        this.name = name;
        this.continent = continent;
        this.players = players;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Continent_enum getContinent() {
        return continent;
    }

    public void setContinent(Continent_enum continent) {
        this.continent = continent;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
