package com.afs.tdd;

public class MarsRover {

    private RoverStatus roverStatus;

    public MarsRover(RoverStatus roverStatus) {
        this.roverStatus = roverStatus;
    }

    public void executeCommand(String command) {
        
        if ("M".equals(command)) {
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
