package com.example.demo.patterns.command;

import com.example.demo.patterns.NormalModeStrategy;
import com.example.demo.patterns.Rover;
import com.example.demo.patterns.es.ChangedNormalModeCommand;
import com.example.demo.patterns.es.Event;

public class NormalModeCommand implements Command {

    @Override
    public Event execute(Rover rover) {
        rover.setStrategy(new NormalModeStrategy());
        return new ChangedNormalModeCommand();
    }
}
