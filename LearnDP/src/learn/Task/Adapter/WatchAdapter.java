package learn.Task.Adapter;

import learn.Task.Observer.SensorObserver;
import learn.Task.Singleton.SingletonLogger;

public class WatchAdapter implements SensorObserver {

    SingletonLogger logger = SingletonLogger.getInstance("");

    private String watchId;

    public WatchAdapter(String watchId, PhoneAdapter phoneAdapter) {
        this.watchId = watchId;
    }

    @Override
    public void update(String event) {
        System.out.println("sending to " + watchId + ": " + event);
        logger.log("sending to " + watchId + ": " + event + "at " + System.currentTimeMillis());
    }
}
