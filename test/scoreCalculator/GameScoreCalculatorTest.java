package scoreCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameScoreCalculatorTest {

	
	@Test
	public void runningGameTest() {
		GameScoreCalculator gameScoreCalculator = new GameScoreCalculator(0, 10000, 5, 50);
		int expected = 10250;
		int actual = gameScoreCalculator.scoreCalculator();
		assertEquals(expected, actual);
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void notRunningGameTest() {
		GameScoreCalculator gameScoreCalculator = new GameScoreCalculator(1, 25000, 15, 150);
		gameScoreCalculator.scoreCalculator();
	}
}
