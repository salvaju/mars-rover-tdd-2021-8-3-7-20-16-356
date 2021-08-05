package com.afs.tdd;

public class MarsRover {

    public static final String MOVE = "M";
    public static final String LEFT = "L";
    public static final String NORTH = "N";
    public static final String WEST = "W";
    public static final String EAST = "E";
    public static final String SOUTH = "S";

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
        if (SOUTH.equals(roverStatus.getDirection())) {
            roverStatus.decrementLocationY();
        } else if (NORTH.equals(roverStatus.getDirection())) {
            roverStatus.increaseLocationY();
        } else if (EAST.equals(roverStatus.getDirection())) {
            roverStatus.incrementLocationX();
        }
    }

    private void turnLeft() {
        if (NORTH.equals(roverStatus.getDirection())) {
            roverStatus.setDirection(WEST);
        } else if (SOUTH.equals(roverStatus.getDirection())) {
            roverStatus.setDirection(EAST);
        }
    }

    private void turnRight() {
        if (NORTH.equals(roverStatus.getDirection())) {
            roverStatus.setDirection(EAST);
        } else if (SOUTH.equals(roverStatus.getDirection())) {
            roverStatus.setDirection(WEST);
        }
    }

    public RoverStatus getRoverStatus() {
        return this.roverStatus;
    }
}
