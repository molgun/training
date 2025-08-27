package com.example.demo.patterns.es;

import com.example.demo.patterns.command.Command;
import com.example.demo.patterns.command.NormalModeCommand;

public class ChangedNormalModeCommand extends Event{

    @Override
    public Command getCommand() {
        return new NormalModeCommand();
    }

}
