package com.example.demo.patterns.es;

import java.time.LocalDateTime;

import com.example.demo.patterns.DirectionState;
import com.example.demo.patterns.ModeStrategy;

public class RoverSnapshot {
    private Integer x;
    private Integer y;
    private DirectionState state;
    private ModeStrategy strategy;
    private LocalDateTime creationDate;

    public RoverSnapshot(Integer x, Integer y, DirectionState state, ModeStrategy strategy, LocalDateTime creationDate) {
        this.x = x;
        this.y = y;
        this.state = state;
        this.strategy = strategy;
        this.creationDate = creationDate;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public DirectionState getState() {
        return state;
    }

    public ModeStrategy getStrategy() {
        return strategy;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }
}
