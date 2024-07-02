package org.example;

public class Card {
    private int minute;
    private Player player;
    private String type; // Yellow or Red
    private Match match;

    public Card(int minute, Player player, String type, Match match) {
        this.minute = minute;
        this.player = player;
        this.type = type;
        this.match = match;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }
}
