package learn.Task.Command;

public class AlarmCommand implements Command{

    private Alarm alarm;

    public AlarmCommand(Alarm alarm) {
        this.alarm = alarm;
    }

    @Override
    public void on() {
        alarm.alarmOn();
    }

    @Override
    public void off() {
        alarm.alarmOff();
    }
}
