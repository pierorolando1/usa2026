package org.example;

public class Goal {
    private int minute;
    private Player player;
    private Match match;

    public Goal(int minute, Player player, Match match) {
        this.minute = minute;
        this.player = player;
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

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }
}
