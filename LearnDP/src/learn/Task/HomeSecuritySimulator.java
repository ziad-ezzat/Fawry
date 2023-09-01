package learn.Task;

import learn.Task.Singleton.*;
import learn.Task.Command.*;
import learn.Task.Observer.*;
import learn.Task.Factory.*;
import learn.Task.Adapter.*;
import learn.Task.Sensor.*;

public class HomeSecuritySimulator {
    public static void main(String[] args) {

        SingletonLogger logger = SingletonLogger.getInstance("ziad");

        SensorFactory sensorFactory = new CompanySensorFactory();

        SmokeSensor smokeSensor = sensorFactory.createSmokeSensor();
        MotionSensor motionSensor = sensorFactory.createMotionSensor();

        SensorObserver phoneAdapter = new PhoneAdapter("01019382585");
        SensorObserver WatchAdapter = new WatchAdapter("200300",(PhoneAdapter) phoneAdapter);

        smokeSensor.registerObserver(phoneAdapter);
        smokeSensor.registerObserver(WatchAdapter);
        motionSensor.registerObserver(phoneAdapter);
        motionSensor.registerObserver(WatchAdapter);

        Sprinkler sprinkler = new Sprinkler();
        Alarm alarm = new Alarm();

        Command sprinklerOnCommand = new SprinklerCommand(sprinkler);
        Command alarmOnCommand = new AlarmCommand(alarm);

        smokeSensor.smokeDetected();
        motionSensor.motionDetected();

        sprinklerOnCommand.off();
        alarmOnCommand.off();
    }
}

