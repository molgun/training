package com.example.demo.patterns.command;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public abstract class CommandAdapter {

    protected Map<String,Supplier<Command>> map;

    public CommandAdapter() {
        this.map = new HashMap<>();
        this.map.put("F", MoveCommand::new);
        this.map.put("B", BackwardCommand::new);
        this.map.put("R", RightCommand::new);
        this.map.put("L", LeftCommand::new);
        this.map.put("X", PowerModeCommand::new);
        this.map.put("Y", LowPowerModeCommand::new);
        this.map.put("Z", NormalModeCommand::new);
    }

    public abstract List<Command> toCommands(String string);

    public Map<String, Supplier<Command>> getMap() {
        return map;
    }
}
