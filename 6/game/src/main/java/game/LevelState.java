package game;

public abstract class LevelState {
    Game game;

    public LevelState(Game game) {
        this.game = game;
    }

    protected abstract void addPoints(int newPoints);
}
