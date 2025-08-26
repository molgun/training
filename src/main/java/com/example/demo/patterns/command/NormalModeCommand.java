package com.example.demo.patterns.command;

import com.example.demo.patterns.NormalModeStrategy;
import com.example.demo.patterns.Rover;

public class NormalModeCommand implements Command {

    @Override
    public void execute(Rover rover) {
        rover.setStrategy(new NormalModeStrategy());
    }
}
