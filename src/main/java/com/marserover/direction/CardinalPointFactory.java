package main.java.com.marserover.direction;

import main.java.com.marserover.universe.MarseRover;

public class CardinalPointFactory {

	private MarseRover marseRover;

	public CardinalPointFactory(MarseRover marseRover) {
		this.marseRover = marseRover;
	}

	public CardinalDirection currentPoint(CardinalPoint type) {

		switch (type) {
		case N:

			return new North(marseRover);
		case E:
			return new East(marseRover);
		case W:
			return new West(marseRover);
		case S:
			return new South(marseRover);

		default:

			return null;
		}

	}

}
