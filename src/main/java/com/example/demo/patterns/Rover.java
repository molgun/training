package com.example.demo.patterns;

import com.example.demo.patterns.command.Command;

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
}
