package main.java.com.marserover.direction;

public enum CardinalPoint {

	N, E, W, S;

	public static CardinalPoint valueOf(CardinalDirection cardinalDirection) {

		if (cardinalDirection instanceof North)
			return N;
		else if (cardinalDirection instanceof East)
			return E;
		else if (cardinalDirection instanceof West)
			return W;
		else if (cardinalDirection instanceof South)
			return S;
		else
			return null;
	}

}
