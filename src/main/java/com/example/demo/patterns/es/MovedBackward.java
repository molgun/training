package com.example.demo.patterns.es;

import com.example.demo.patterns.command.BackwardCommand;
import com.example.demo.patterns.command.Command;

public class MovedBackward extends Event{

    @Override
    public Command getCommand() {
        return new BackwardCommand();
    }

}
