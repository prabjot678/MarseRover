package main.java.com.marserover.direction;

import main.java.com.marserover.universe.MarseRover;

public class East implements CardinalDirection {
	
	private MarseRover marseRover; 
	
	

	public East(MarseRover marseRover) {
		this.marseRover = marseRover;
	}

	@Override
	public void moveLeft() {
		marseRover.direction().currentDirection(marseRover.direction().northDirection());
		
	}

	@Override
	public void moveRight() {
		marseRover.direction().currentDirection(marseRover.direction().southDirection());
	}

	@Override
	public void move() {
		marseRover.coordinates().xCoordinate(marseRover.coordinates().xCoordinate() + 1);
		
	}
	
	@Override
	public String toString() {
		return CardinalPoint.E.toString();
	}

}
