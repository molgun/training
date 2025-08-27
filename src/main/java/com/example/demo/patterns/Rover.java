package com.example.demo.patterns;

import java.util.Stack;

import com.example.demo.patterns.command.Command;
import com.example.demo.patterns.es.Event;

public class Rover {

    protected Integer x;
    protected Integer y;
    protected Direction direction;
    protected DirectionState directionState;
    protected ModeStrategy strategy;

    public Rover(Integer x, Integer y, Direction direction) {
        directionState = new DirectionStateFactory().create(direction);
        validation(x, y);
        this.x = x;
        this.y = y;
        this.strategy = new NormalModeStrategy();
    }

    
    public Rover(Integer x, Integer y, DirectionState state, ModeStrategy strategy) {
        directionState = state;
        validation(x, y);
        this.x = x;
        this.y = y;
        this.strategy = strategy;
    }


    private void validation(Integer x, Integer y){
        if (y > 10 || x > 10 || x < 0 || y < 0) {
            throw new IllegalArgumentException();
        }
    }

    public void run(Command command) {
        command.execute(this);
    }

    public void setStrategy(ModeStrategy strategy){
        this.strategy = strategy;
    }

    public DirectionState getDirectionState() {
        return directionState;
    }


    public void replay(Stack<Event> events) {
        for(var event : events) {
            run(event.getCommand());
        }
    }


    public Integer getX() {
        return x;
    }


    public Integer getY() {
        return y;
    }


    public Direction getDirection() {
        return direction;
    }


    public ModeStrategy getStrategy() {
        return strategy;
    }

    
}
