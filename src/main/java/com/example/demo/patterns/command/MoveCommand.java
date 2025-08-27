package com.example.demo.patterns.command;

import com.example.demo.patterns.Rover;
import com.example.demo.patterns.es.Event;
import com.example.demo.patterns.es.Moved;

public class MoveCommand implements Command {

    @Override
    public Event execute(Rover rover) {
        rover.getDirectionState().move(rover);
        return new Moved();
    }

}
