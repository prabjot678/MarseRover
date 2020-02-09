package main.java.com.marserover.command;

import main.java.com.marserover.MarseRover;

public class LeftCommand implements Command {

	@Override
	public void execute(MarseRover marseRover) {
		marseRover.moveLeft();
	}

}
