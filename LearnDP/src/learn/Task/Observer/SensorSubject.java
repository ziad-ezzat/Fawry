package learn.Task.Observer;

public interface SensorSubject {
    void registerObserver(SensorObserver observer);
    void removeObserver(SensorObserver observer);
    void notifyObservers(String event);
}
