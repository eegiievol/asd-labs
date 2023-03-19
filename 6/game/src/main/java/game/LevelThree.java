package game;

import game.Game;
import game.LevelState;

public class LevelThree extends LevelState {

    public LevelThree(Game game) {
        super(game);
    }

    @Override
    protected void addPoints(int newPoints) {
        int totalPoints = game.getTotalPoints();
        totalPoints += newPoints * 3;
        System.out.println("points="+totalPoints+" level=3");
        game.setTotalPoints(totalPoints);
    }
}
