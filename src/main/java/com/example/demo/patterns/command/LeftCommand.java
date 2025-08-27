package com.example.demo.patterns.command;

import com.example.demo.patterns.Rover;

public class LeftCommand implements Command {

    @Override
    public void execute(Rover rover) {
        rover.getDirectionState().turnLeft(rover);
    }
}


