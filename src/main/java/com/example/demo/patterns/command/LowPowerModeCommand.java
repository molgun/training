package com.example.demo.patterns.command;

import com.example.demo.patterns.LowModeStrategy;
import com.example.demo.patterns.Rover;
import com.example.demo.patterns.es.ChangedLowModeCommand;
import com.example.demo.patterns.es.Event;

public class LowPowerModeCommand implements Command {
    @Override
    public Event execute(Rover rover) {
        rover.setStrategy(new LowModeStrategy());
        return new ChangedLowModeCommand();
    }
}
