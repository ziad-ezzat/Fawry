package learn.Observer;

public class TemperatureDisplay implements Observer{

    @Override
    public void update(double temperature) {
        System.out.println("TemperatureDisplay: " + temperature);
    }
}
