package org.example;

import java.util.Date;

public class CoachingStaff {
    private String name;
    private Date birthDate;
    private String birthPlace;
    private String position;
    private Team team;

    public CoachingStaff(String name, Date birthDate, String birthPlace, String position, Team team) {
        this.name = name;
        this.birthDate = birthDate;
        this.birthPlace = birthPlace;
        this.position = position;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
