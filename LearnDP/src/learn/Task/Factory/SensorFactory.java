package learn.Task.Factory;

import learn.Task.Sensor.MotionSensor;
import learn.Task.Sensor.SmokeSensor;

public interface SensorFactory {
    SmokeSensor createSmokeSensor();
    MotionSensor createMotionSensor();
}
