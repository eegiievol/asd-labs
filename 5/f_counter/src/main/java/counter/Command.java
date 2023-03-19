package counter;

public interface Command {
    void execute();
    void unexecute();
}