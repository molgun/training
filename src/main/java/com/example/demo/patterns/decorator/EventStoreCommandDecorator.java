package com.example.demo.patterns.decorator;

import com.example.demo.patterns.Rover;
import com.example.demo.patterns.command.Command;
import com.example.demo.patterns.es.Event;
import com.example.demo.patterns.es.EventStore;

public class EventStoreCommandDecorator extends AbstractCommandDecorator {

    private final EventStore eventStore;

    public EventStoreCommandDecorator(Command command, EventStore events) {
        super(command);
        this.eventStore = events;
    }

    @Override
    public Event execute(Rover rover) {
        Event event = super.getCommand().execute(rover);
        eventStore.save(event);
        return event;
    }

}
