package scoreCalculator;

public class GameScoreCalculator {
	
	// 1 > Running / 0 > notRunning
	public int gameStatus;
	public int score;
	public int levelCompleted;
	public int bonus;
	
	public GameScoreCalculator(int gameStatus, int score, int levelCompleted, int bonus) {
		this.gameStatus = gameStatus;
		this.score = score;
		this.levelCompleted = levelCompleted;
		this.bonus = bonus;
	}
	
	public int scoreCalculator() {
		if (gameStatus == 1) {
			throw new IllegalArgumentException("game is still running");
		} else { 
			int finalScore = this.score + (this.levelCompleted * this.bonus);
			return finalScore;
		}
	}

}
