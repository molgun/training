package com.example.demo.patterns.command;

import java.util.ArrayList;
import java.util.List;

public class StringCommandAdapter extends CommandAdapter {

    @Override
    public List<Command> toCommands(String string) {
        List<Command> commands = new ArrayList<>();
        char[] charArray = string.toCharArray();
        for(Character command : charArray) {
            Command comm = super.getMap().get(Character.toString(command)).get();
            commands.add(comm);
        }
        return commands;
    }
}
