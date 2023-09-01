package learn.Task.Sensor;

import learn.Task.Command.Alarm;
import learn.Task.Command.AlarmCommand;
import learn.Task.Command.Command;
import learn.Task.Observer.SensorObserver;
import learn.Task.Observer.SensorSubject;

import java.util.ArrayList;
import java.util.List;

public class MotionSensor implements SensorSubject {

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

    public void motionDetected() {
        Alarm alarm = new Alarm();
        Command command = new AlarmCommand(alarm);
        System.out.println("Motion detected!");
        command.on();
        notifyObservers("Motion detected");
    }
}
