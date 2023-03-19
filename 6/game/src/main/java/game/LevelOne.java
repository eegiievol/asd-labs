package game;

public class LevelOne extends LevelState{

    public LevelOne(Game game) {
        super(game);
    }

    @Override
    protected void addPoints(int newPoints) {
        int totalPoints = game.getTotalPoints();
        totalPoints += newPoints;
        game.setTotalPoints(totalPoints);
        System.out.println("points="+totalPoints+" level=1");
        if (totalPoints > 10) { // move to level 2
            LevelState level = new LevelTwo(game);
            game.setLevelState(level);
        }
    }
}
