package com.example.demo.patterns.command;

import com.example.demo.patterns.Rover;

public interface Command {
    public void execute(Rover rover);
}
