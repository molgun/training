package com.example.demo.patterns.command;

import com.example.demo.patterns.Rover;
import com.example.demo.patterns.es.Event;

public interface Command {
    public Event execute(Rover rover);
}
