package com.afs.tdd;

public class MarsRover {

    public static final String MOVE = "M";
    public static final String LEFT = "L";
    public static final String NORTH = "N";
    public static final String WEST = "W";

    private RoverStatus roverStatus;

    public MarsRover(RoverStatus roverStatus) {
        this.roverStatus = roverStatus;
    }

    public void executeCommand(String command) {
        
        if (MOVE.equals(command)) {
            move();
        } else if (LEFT.equals(command)) {
            turnLeft();
        }

    }

    private void move() {
        roverStatus.increaseLocationY();
    }

    private void turnLeft() {
        if (NORTH.equals(roverStatus.getDirection())) {
            roverStatus.setDirection(WEST);
        }
    }

    public RoverStatus getRoverStatus() {
        return this.roverStatus;
    }
}
