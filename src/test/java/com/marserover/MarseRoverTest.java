package test.java.com.marserover;

import static main.java.com.marserover.direction.CardinalPoint.E;
import static main.java.com.marserover.direction.CardinalPoint.N;

import org.junit.Assert;
import org.junit.Test;

import main.java.com.marserover.universe.MarseRover;

public class MarseRoverTest {

	@Test
	public void roverShouldBeAtNorth() {
		MarseRover roverAtNorth = new MarseRover(1, 2, N);
		roverAtNorth.run("LMLMLMLMM");

		String expected = "1 3 N";

		String actual = roverAtNorth.coordinates().xCoordinate() + " " + roverAtNorth.coordinates().yCoordinate() + " "
				+ roverAtNorth.direction().currentDirection().toString();

		Assert.assertEquals(expected, actual);

	}

	@Test
	public void roverShouldBeAtEast() {
		MarseRover roverAtNorth = new MarseRover(3, 3, E);
		roverAtNorth.run("MMRMMRMRRM");

		String expected = "5 1 E";

		String actual = roverAtNorth.coordinates().xCoordinate() + " " + roverAtNorth.coordinates().yCoordinate() + " "
				+ roverAtNorth.direction().currentDirection().toString();

		Assert.assertEquals(expected, actual);

	}

}
