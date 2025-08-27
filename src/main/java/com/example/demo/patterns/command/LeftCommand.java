package com.example.demo.patterns.command;

import com.example.demo.patterns.Rover;
import com.example.demo.patterns.es.Event;
import com.example.demo.patterns.es.TurnedLeft;

public class LeftCommand implements Command {

    @Override
    public Event execute(Rover rover) {
        rover.getDirectionState().turnLeft(rover);
        return new TurnedLeft();
    }
}


