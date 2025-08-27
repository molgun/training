package com.example.demo.patterns.es;

import java.time.LocalDateTime;
import java.util.Stack;

import com.example.demo.patterns.Rover;

public class EventStore {

    private Stack<Event> store;
    private Stack<RoverSnapshot> snapshots;

    public EventStore() {
        this.store = new Stack<>();
        this.snapshots = new Stack<>();
    }

    public void save(Event event) {
        store.add(event);
        if (store.size() % 10 == 0) {
            takeSnapshot(event.getTime());
        }
    }

    private void takeSnapshot(LocalDateTime time) {
        Rover rover = getRover();
        RoverSnapshot snapshot = new RoverSnapshot(rover.getX(), rover.getY(), rover.getDirectionState(), rover.getStrategy(), time);
        snapshots.add(snapshot);
    }

    public Rover getRover() {
        RoverSnapshot roverSnapshot = getLatestSnapshot();
        Rover rover = new Rover(roverSnapshot.getX(), roverSnapshot.getY(), roverSnapshot.getState(), roverSnapshot.getStrategy());
        rover.replay(findEvents(roverSnapshot.getCreationDate()));
        return rover;
    }

    public Stack<Event> findEvents(LocalDateTime after) {
        Stack<Event> events = new Stack<>();
        events.addAll(store);
        Stack<Event> result = new Stack<>();
        
        for(Event event : events){
            if (event.getTime().isAfter(after)) {
                result.add(event);
            } else {
                break;
            }
        }

        return result;
    }

    private RoverSnapshot getLatestSnapshot() {
        return snapshots.peek();
    }
    

}
