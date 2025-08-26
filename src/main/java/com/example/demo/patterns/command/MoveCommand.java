package com.example.demo.patterns.command;

import com.example.demo.patterns.Rover;

public class MoveCommand implements Command {

    @Override
    public void execute(Rover rover) {
        rover.getDirectionState().move(rover);
    }

}
