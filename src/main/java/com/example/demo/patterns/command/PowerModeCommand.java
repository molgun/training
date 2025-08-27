package com.example.demo.patterns.command;

import com.example.demo.patterns.PowerModeStrategy;
import com.example.demo.patterns.Rover;
import com.example.demo.patterns.es.ChangedPowerModeCommand;
import com.example.demo.patterns.es.Event;

public class PowerModeCommand implements Command {

    @Override
    public Event execute(Rover rover) {
        rover.setStrategy(new PowerModeStrategy());
        return new ChangedPowerModeCommand();
    }
}
