package learn.Task.Singleton;

public class SingletonLogger {

    private static SingletonLogger instance = null;

    private String pass;

    private SingletonLogger(String pass) {
        this.pass = pass;
    }

    public static SingletonLogger getInstance(String pass) {
        if (instance == null) {
            instance = new SingletonLogger(pass);
        }
        return instance;
    }

    public String getPass() {
        return pass;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
