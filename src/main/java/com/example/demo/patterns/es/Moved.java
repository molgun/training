package com.example.demo.patterns.es;

import com.example.demo.patterns.command.Command;
import com.example.demo.patterns.command.MoveCommand;

public class Moved extends Event {

    @Override
    public Command getCommand() {
        return new MoveCommand();
    }

}
