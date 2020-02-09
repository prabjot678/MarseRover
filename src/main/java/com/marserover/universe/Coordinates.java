package main.java.com.marserover.universe;

import java.util.Objects;

public class Coordinates {
	
	private int xCoordinate;
	private int yCoordinate;

	public Coordinates(int xCoordinate, int yCoordinate) {
		this.xCoordinate(xCoordinate);
		this.yCoordinate(yCoordinate);
	}

	public int xCoordinate() {
		return xCoordinate;
	}

	public void xCoordinate(int xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	public int yCoordinate() {
		return yCoordinate;
	}

	public void yCoordinate(int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(xCoordinate, yCoordinate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordinates other = (Coordinates) obj;
		return xCoordinate == other.xCoordinate && yCoordinate == other.yCoordinate;
	}

}