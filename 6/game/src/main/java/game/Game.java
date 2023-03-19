package game;

import java.util.Random;

public class Game {
	private int totalPoints = 0;
	LevelState levelState;

	public void setLevelState(LevelState levelState) {
		this.levelState = levelState;
	}

	public void play() {
		Random random = new Random();
		addPoints(random.nextInt(7));

	}

	public int addPoints(int newPoints) {
		levelState.addPoints(newPoints);
		return totalPoints;
	}

	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}

	public int getTotalPoints() {
		return totalPoints;
	}
}
