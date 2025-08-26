package com.example.demo.patterns;

import java.util.Map;

public class Rover {

    protected Integer x;
    protected Integer y;
    protected Direction direction;
    protected DirectionState directionState;

    public Rover(Integer x, Integer y, Direction direction) {
        directionState = new DirectionStateFactory().create(direction);
        validation(x, y);
        this.x = x;
        this.y = y;
    }

    
    private void validation(Integer x, Integer y){
        if (y > 10 || x > 10 || x < 0 || y < 0) {
            throw new IllegalArgumentException();
        }
    }

    public void move() {
        this.directionState.move(this);
    } 

    public void backward() {
        if (Direction.NORTH == direction) {
            y = y - 2;
        } else if (Direction.EAST == direction) {
            x = x - 2;
        }
    } 

    public void turnRight() {
        this.directionState.turnRight(this);
    }

    public void turnLeft() {
        this.directionState.turnLeft(this);
    }
}
