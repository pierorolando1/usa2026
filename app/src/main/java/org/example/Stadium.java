package org.example;

public class Stadium {
    private String name;
    private int capacity;
    private String city;
    private boolean hasRoof;

    public Stadium(String name, int capacity, String city, boolean hasRoof) {
        this.name = name;
        this.capacity = capacity;
        this.city = city;
        this.hasRoof = hasRoof;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isHasRoof() {
        return hasRoof;
    }

    public void setHasRoof(boolean hasRoof) {
        this.hasRoof = hasRoof;
    }
}
