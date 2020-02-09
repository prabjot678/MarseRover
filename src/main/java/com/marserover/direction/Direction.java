package main.java.com.marserover.direction;

import main.java.com.marserover.universe.MarseRover;

public class Direction {
	
	public CardinalDirection currentDirection;
	public North northDirection;
	public East eastDirection;
	public South southDirection;
	public West westDirection;
	
	public Direction(CardinalDirection currentDirection,MarseRover marseRover) {
		this.currentDirection = currentDirection;
		this.northDirection = new North(marseRover);
		this.eastDirection = new East(marseRover);
		this.southDirection = new South(marseRover);
		this.westDirection = new West(marseRover);
	}

	public CardinalDirection currentDirection() {
		return currentDirection;
	}

	public void currentDirection(CardinalDirection currentState) {
		this.currentDirection = currentState;
	}
	
	public North northDirection() {
		return northDirection;
	}

	public East eastDirection() {
		return eastDirection;
	}

	public South southDirection() {
		return southDirection;
	}

	public West westDirection() {
		return westDirection;
	}
	
	
	
	
}