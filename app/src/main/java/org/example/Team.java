package org.example;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private String country;
    private List<Player> players;
    private List<CoachingStaff> coachingStaff;

    public Team(String name, String country) {
        this.name = name;
        this.country = country;
        this.players = new ArrayList<>();
        this.coachingStaff = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void addCoachingStaff(CoachingStaff coachingStaff) {
        this.coachingStaff.add(coachingStaff);
    }

    // Getters and setters
}
