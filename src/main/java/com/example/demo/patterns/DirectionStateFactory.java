package com.example.demo.patterns;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class DirectionStateFactory {

    private Map<Direction,Supplier<WestDirectionState>> stateMap;

    

    public DirectionStateFactory() {
        this.stateMap = new HashMap<>();
        stateMap.put(Direction.WEST, WestDirectionState::new);
        stateMap.put(Direction.EAST, WestDirectionState::new);
        stateMap.put(Direction.SOUTH, WestDirectionState::new);
        stateMap.put(Direction.NORTH, WestDirectionState::new);
    }



    public DirectionState create(Direction direction) {
        return stateMap.get(direction).get();
    }
}
