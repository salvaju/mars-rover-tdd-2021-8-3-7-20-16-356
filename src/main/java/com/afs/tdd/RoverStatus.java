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

    public int getLocationY() {
        return this.locationY;
    }
}
