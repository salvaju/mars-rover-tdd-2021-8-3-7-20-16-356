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
        }

    }

    private void move() {
        roverStatus.increaseLocationY();
    }

    public RoverStatus getRoverStatus() {
        return this.roverStatus;
    }
}
