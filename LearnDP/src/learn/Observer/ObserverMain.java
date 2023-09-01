package learn.Observer;

public class ObserverMain {
    public static void main(String[] args)
    {
        WeatherStation weatherStation = new WeatherStation();

        Observer temperatureDisplay = new TemperatureDisplay();
        Observer phoneApp = new PhoneApp();

        weatherStation.registerObserver(temperatureDisplay);
        weatherStation.registerObserver(phoneApp);

        weatherStation.setTemperature(25.5); // Notifies observers

        weatherStation.removeObserver(phoneApp); // Unsubscribe phone app

        weatherStation.setTemperature(28.2); // Only temperature display is notified
    }
}
