package com.example.demo.patterns.es;

import com.example.demo.patterns.command.Command;
import com.example.demo.patterns.command.LowPowerModeCommand;

public class ChangedLowModeCommand extends Event {

    @Override
    public Command getCommand() {
        return new LowPowerModeCommand();
    }

}
