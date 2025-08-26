package com.example.demo.vo;

public class RoverFactory {
    public Rover createRover(Integer speed) {
        if (speed > 50) {
            return new FastRover();
        } else {
            return new SlowRover();
        }
    }
}
