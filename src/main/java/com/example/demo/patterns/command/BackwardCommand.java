package com.example.demo.patterns.command;

import com.example.demo.patterns.Rover;

public class BackwardCommand implements Command {

    @Override
    public void execute(Rover rover) {
        rover.getDirectionState().backward(rover);
    }

}
