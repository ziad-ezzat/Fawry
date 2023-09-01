package learn.Task.Adapter;

import learn.Task.Observer.SensorObserver;
import learn.Task.Singleton.SingletonLogger;

import java.util.Scanner;

public class PhoneAdapter implements SensorObserver {

    private SingletonLogger logger = SingletonLogger.getInstance("");
    private String phoneNumber;

    public PhoneAdapter(String phoneNumber) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter password: ");

        String password = scanner.nextLine();

        if (password.equals(logger.getPass())) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Incorrect password");
            System.exit(0);
        }
    }

    @Override
    public void update(String event) {
        System.out.println("Sending SMS to " + phoneNumber + ": " + event);
        logger.log("Sending SMS to " + phoneNumber + ": " + event + "at " + System.currentTimeMillis());
    }
}
