package com.example.demo.patterns.command;

import com.example.demo.patterns.Rover;

public class RightCommand implements Command {

    @Override
    public void execute(Rover rover) {
        rover.getDirectionState().turnRight(rover);
    }

}
