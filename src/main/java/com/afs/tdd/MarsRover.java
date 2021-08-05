package com.afs.tdd;

public class MarsRover {

    public static final String MOVE = "M";
    public static final String LEFT = "L";
    public static final String NORTH = "N";
    public static final String WEST = "W";
    public static final String EAST = "E";

    private RoverStatus roverStatus;

    public MarsRover(RoverStatus roverStatus) {
        this.roverStatus = roverStatus;
    }

    public void executeCommand(String command) {
        
        if (MOVE.equals(command)) {
            move();
        } else if (LEFT.equals(command)) {
            turnLeft();
        } else {
            turnRight();
        }

    }

    private void move() {
        if ("S".equals(roverStatus.getDirection())) {
            roverStatus.decrementLocationY();
        } else if (NORTH.equals(roverStatus.getDirection())) {
            roverStatus.increaseLocationY();
        }
    }

    private void turnLeft() {
        if (NORTH.equals(roverStatus.getDirection())) {
            roverStatus.setDirection(WEST);
        }
    }

    private void turnRight() {
        if (NORTH.equals(roverStatus.getDirection())) {
            roverStatus.setDirection(EAST);
        }
    }

    public RoverStatus getRoverStatus() {
        return this.roverStatus;
    }
}
