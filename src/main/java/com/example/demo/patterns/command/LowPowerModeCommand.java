package com.example.demo.patterns.command;

import com.example.demo.patterns.LowModeStrategy;
import com.example.demo.patterns.Rover;

public class LowPowerModeCommand implements Command {
    @Override
    public void execute(Rover rover) {
        rover.setStrategy(new LowModeStrategy());
    }
}
