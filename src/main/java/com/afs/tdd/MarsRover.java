package com.afs.tdd;

public class MarsRover {

    public static final String MOVE = "M";
    private RoverStatus roverStatus;

    public MarsRover(RoverStatus roverStatus) {
        this.roverStatus = roverStatus;
    }

    public void executeCommand(String command) {
        
        if (MOVE.equals(command)) {
            move();
        } else if ("L".equals(command)) {
            turnLeft();
        }

    }

    private void move() {
        roverStatus.increaseLocationY();
    }

    private void turnLeft() {
        if ("N".equals(roverStatus.getDirection())) {
            roverStatus.setDirection("W");
        }
    }

    public RoverStatus getRoverStatus() {
        return this.roverStatus;
    }
}
