package learn.Task.Sensor;

import learn.Task.Command.Command;
import learn.Task.Command.Sprinkler;
import learn.Task.Command.SprinklerCommand;
import learn.Task.Observer.SensorObserver;
import learn.Task.Observer.SensorSubject;

import java.util.ArrayList;
import java.util.List;

public class SmokeSensor implements SensorSubject {

    private List<SensorObserver> observers =new ArrayList<>();

    @Override
    public void registerObserver(SensorObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(SensorObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String event) {
        for (SensorObserver observer : observers) {
            observer.update(event);
        }
    }

    public void smokeDetected() {
        Sprinkler sprinkler = new Sprinkler();
        Command command = new SprinklerCommand(sprinkler);
        System.out.println("Smoke detected!");
        command.on();
        notifyObservers("Smoke detected");
    }
}
