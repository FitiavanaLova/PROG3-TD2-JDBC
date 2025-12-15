package org.example.models;

public class Player {
    private int id;
    private String name;
    private Position_enum position;

    public Player(int id, String name, Position_enum position) {
        this.id = id;
        this.name = name;
        this.position = position;
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

    public Position_enum getPosition() {
        return position;
    }

    public void setPosition(Position_enum position) {
        this.position = position;
    }
}
