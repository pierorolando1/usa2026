package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Match {
    private Date date;
    private Stadium stadium;
    private String stage;
    private int attendance;
    private List<Goal> goals;
    private List<Card> cards;
    private List<Referee> referees;

    public Match(Date date, Stadium stadium, String stage, int attendance, List<Referee> referees) {
        this.date = date;
        this.stadium = stadium;
        this.stage = stage;
        this.attendance = attendance;
        this.goals = new ArrayList<>();
        this.cards = new ArrayList<>();
        this.referees = referees;
    }

    public void addGoal(Goal goal) {
        goals.add(goal);
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public List<Goal> getGoals() {
        return goals;
    }

    public void setGoals(List<Goal> goals) {
        this.goals = goals;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public List<Referee> getReferees() {
        return referees;
    }

    public void setReferees(List<Referee> referees) {
        this.referees = referees;
    }
}
