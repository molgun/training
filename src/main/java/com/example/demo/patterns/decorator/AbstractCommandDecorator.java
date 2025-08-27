package com.example.demo.patterns.decorator;

import com.example.demo.patterns.command.Command;

public abstract class AbstractCommandDecorator implements Command {

    private final Command command;

    public AbstractCommandDecorator(Command command) {
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }
}
