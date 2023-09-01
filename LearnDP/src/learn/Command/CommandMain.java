package learn.Command;

public class CommandMain {
    public static void main(String[] args) {
        Light light = new Light();
        Command turnOnLightCommand = new TurnOnLightCommand(light);
        Command turnOffLightCommand = new TurnOffLightCommand(light);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(turnOnLightCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(turnOffLightCommand);
        remoteControl.pressButton();
    }
}
