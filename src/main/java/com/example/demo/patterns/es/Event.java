package com.example.demo.patterns.es;

import java.time.LocalDateTime;

import com.example.demo.patterns.command.Command;

public abstract class Event {

    private final LocalDateTime time;

    public Event() {
        this.time = LocalDateTime.now();
    }

    public abstract Command getCommand();

    public LocalDateTime getTime() {
        return time;
    }
}
