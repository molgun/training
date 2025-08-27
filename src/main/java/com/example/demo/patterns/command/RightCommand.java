package com.example.demo.patterns.command;

import com.example.demo.patterns.Rover;
import com.example.demo.patterns.es.Event;
import com.example.demo.patterns.es.TurnedRight;

public class RightCommand implements Command {

    @Override
    public Event execute(Rover rover) {
        rover.getDirectionState().turnRight(rover);
        return new TurnedRight();
    }

}
