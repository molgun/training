package com.example.demo;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.patterns.Direction;
import com.example.demo.patterns.Rover;
import com.example.demo.patterns.command.Command;
import com.example.demo.patterns.command.CommandAdapter;
import com.example.demo.patterns.command.JSONCommandAdapter;
import com.example.demo.patterns.command.StringCommandAdapter;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String x = args[0];
		String y = args[1];
		String direction = args[2];
		String local = args[3];

		CommandAdapter commandAdapter;
		if (local.charAt(0) == '{') {
			commandAdapter = new JSONCommandAdapter();
		} else {
			commandAdapter = new StringCommandAdapter();
		}
		List<Command> commands = commandAdapter.toCommands(local);
		
		
		Rover rover = new Rover(Integer.valueOf(x), Integer.valueOf(y), Direction.valueOf(direction));
		
		
		for (Command command : commands) {
			rover.run(command);
		}
	}

}
