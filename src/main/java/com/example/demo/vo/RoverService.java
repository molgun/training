package com.example.demo.vo;

public class RoverService {

    public void runRover(Integer duration, Integer speed) {
        Rover rover;
        if (speed > 50) {
            rover = new FastRover();
        } else {
            rover = new SlowRover();
        }
    }

}
