package com.example.demo.patterns.command;

import com.example.demo.patterns.PowerModeStrategy;
import com.example.demo.patterns.Rover;

public class PowerModeCommand implements Command {

    @Override
    public void execute(Rover rover) {
        rover.setStrategy(new PowerModeStrategy());
    }
}
