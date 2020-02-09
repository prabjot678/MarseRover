package main.java.com.marserover.universe;

import java.util.List;

import main.java.com.marserover.command.Command;
import main.java.com.marserover.command.CommandParser;
import main.java.com.marserover.direction.CardinalPoint;
import main.java.com.marserover.direction.CardinalPointFactory;
import main.java.com.marserover.direction.Direction;

public class MarseRover {

	private Coordinates coordinates;
	private Direction direction;

	public MarseRover(int xCoordinate, int yCoordinate, CardinalPoint cardinalPoint) {
		this.coordinates(new Coordinates(xCoordinate, yCoordinate));
		this.direction(new Direction(new CardinalPointFactory(this).currentPoint(cardinalPoint), this));

	}

	public void moveLeft() {
		direction().currentDirection().moveLeft();
	}

	public void moveRight() {
		direction().currentDirection().moveRight();
	}

	public void move() {
		direction().currentDirection().move();
	}

	public Coordinates coordinates() {
		return coordinates;
	}

	public void coordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}

	public Direction direction() {
		return direction;
	}

	public void direction(Direction direction) {
		this.direction = direction;
	}

	public void run(String commandString) {

		List<Command> commands = new CommandParser(commandString).toCommands();
		for (Command command : commands)
			command.execute(this);
	}

}
