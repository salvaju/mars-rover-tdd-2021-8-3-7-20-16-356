package com.afs.tdd;

public class RoverStatus {

    int locationX;
    int locationY;
    String direction;

    public RoverStatus(int locationX, int locationY, String direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public int getLocationX() {
        return locationX;
    }

    public String getDirection() {
        return direction;
    }

    public int getLocationY() {
        return this.locationY;
    }

    public void increaseLocationY() {
        this.locationY++;
    }

    public void decrementLocationY() {
        this.locationY--;
    }

    public void incrementLocationX() {
        this.locationX++;
    }

    public void decrementLocationX() {
        this.locationX--;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
