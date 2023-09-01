package learn.Task.Factory;

import learn.Task.Sensor.MotionSensor;
import learn.Task.Sensor.SmokeSensor;

public class CompanySensorFactory implements SensorFactory{
    @Override
    public SmokeSensor createSmokeSensor() {
        return new SmokeSensor();
    }

    @Override
    public MotionSensor createMotionSensor() {
        return new MotionSensor();
    }
}
