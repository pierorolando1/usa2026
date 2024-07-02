package org.example;

import java.util.Date;

public class Player {
    private String name;
    private Date birthDate;
    private String birthPlace;
    private String position;
    private Team team;

    public Player(String name, Date birthDate, String birthPlace, String position, Team team) {
        this.name = name;
        this.birthDate = birthDate;
        this.birthPlace = birthPlace;
        this.position = position;
        this.team = team;
    }

    // Getters and setters
}
