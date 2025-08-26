package com.example.demo.patterns.command;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONCommandAdapter extends CommandAdapter {

    @Override
    public List<Command> toCommands(String string) {
        List<Command> commands = new ArrayList<>();
        ObjectMapper mapper = new ObjectMapper();
        try {
            JsonNode node = mapper.readTree(string);
            JsonNode arrayNode = node.get("commands");

            for (JsonNode value : arrayNode) {
                Command command = super.getMap().get(value.asText()).get();
                commands.add(command);
            }
            return commands;
        } catch (JsonProcessingException e) {
            throw new IllegalArgumentException();
        }
    }

}