package game;

public class LevelTwo extends LevelState{
    public LevelTwo(Game game) {
        super(game);
    }

    @Override
    protected void addPoints(int newPoints) {
        int totalPoints = game.getTotalPoints();
        totalPoints += newPoints * 2;
        game.setTotalPoints(totalPoints);
        System.out.println("points="+totalPoints+" level=2");
        if (totalPoints > 20) { // move to level 3
            LevelState level = new LevelThree(game);
            game.setLevelState(level);
        }
    }
}
