package learn.Observer;

public class PhoneApp implements Observer{

        @Override
        public void update(double temperature) {
            System.out.println("PhoneApp: " + temperature);
        }
}
