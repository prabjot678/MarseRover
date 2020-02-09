package main.java.com.marserover.command;

import main.java.com.marserover.MarseRover;

public class MoveCommand implements Command {

	@Override
	public void execute(MarseRover marseRover) {
		marseRover.move();
	}

}
