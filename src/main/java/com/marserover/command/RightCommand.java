package main.java.com.marserover.command;

import main.java.com.marserover.MarseRover;

public class RightCommand implements Command {

	@Override
	public void execute(MarseRover marseRover) {

		marseRover.moveRight();

	}

}
