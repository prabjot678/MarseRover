package main.java.com.marserover.direction;

import main.java.com.marserover.universe.MarseRover;

public class South implements CardinalDirection {

	private MarseRover marseRover;

	public South(MarseRover marseRover) {
		this.marseRover = marseRover;
	}

	@Override
	public void moveLeft() {
		marseRover.direction().currentDirection(marseRover.direction().eastDirection());

	}

	@Override
	public void moveRight() {
		marseRover.direction().currentDirection(marseRover.direction().westDirection());

	}

	@Override
	public void move() {
		marseRover.coordinates().yCoordinate(marseRover.coordinates().yCoordinate() - 1);

	}
	
	@Override
	public String toString() {
		return CardinalPoint.S.toString();
	}

}
