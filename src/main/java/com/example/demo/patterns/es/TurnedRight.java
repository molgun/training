package com.example.demo.patterns.es;

import com.example.demo.patterns.command.Command;
import com.example.demo.patterns.command.RightCommand;

public class TurnedRight extends Event {

    @Override
    public Command getCommand() {
        return new RightCommand();
    }

}
