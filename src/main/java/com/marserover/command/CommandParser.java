package main.java.com.marserover.command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommandParser {

	private String commandString;

	private static Map<String, Command> stringToCommandMap = new HashMap<String, Command>() {
		{
			put("L", new LeftCommand());
			put("R", new RightCommand());
			put("M", new MoveCommand());
		}
	};

	public CommandParser(String commandString) {
		this.commandString = commandString;
	}

	public List<Command> toCommands() {

		List<Command> commands = new ArrayList<Command>();
		for (char command : commandString.toCharArray())
			commands.add(stringToCommandMap.get(String.valueOf(command)));
		return commands;
	}

}
