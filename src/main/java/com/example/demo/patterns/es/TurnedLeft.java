package com.example.demo.patterns.es;

import com.example.demo.patterns.command.Command;
import com.example.demo.patterns.command.LeftCommand;

public class TurnedLeft extends Event {

    @Override
    public Command getCommand() {
        return new LeftCommand();
    }

}
