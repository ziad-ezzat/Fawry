package learn.Task.Command;

public class SprinklerCommand implements Command{

    private Sprinkler sprinkler;

    public SprinklerCommand(Sprinkler sprinkler) {
        this.sprinkler = sprinkler;
    }

    @Override
    public void on() {
        sprinkler.waterOn();
    }

    @Override
    public void off() {
        sprinkler.waterOff();
    }
}
