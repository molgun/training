package com.example.demo.patterns.es;

import com.example.demo.patterns.command.Command;
import com.example.demo.patterns.command.PowerModeCommand;

public class ChangedPowerModeCommand extends Event {

    @Override
    public Command getCommand() {
        return new PowerModeCommand();
    }

}
