package com.example.demo.patterns.command;

import com.example.demo.patterns.Rover;
import com.example.demo.patterns.es.Event;
import com.example.demo.patterns.es.MovedBackward;

public class BackwardCommand implements Command {

    @Override
    public Event execute(Rover rover) {
        rover.getDirectionState().backward(rover);
        return new MovedBackward();
    }

}
