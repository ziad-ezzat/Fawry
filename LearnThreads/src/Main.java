public class Main {
    public static void main(String[] args) {

        Thread thread =new Thread(new Runnable() {
            @Override
            public void run() {
                SingletonClass singletonClass = SingletonClass.getInstance();
            }
        });

        Thread thread2 =new Thread(new Runnable() {
            @Override
            public void run() {
                SingletonClass singletonClass = SingletonClass.getInstance();
            }
        });
    thread.start();
    thread2.start();
    }
}

class SingletonClass
{
    private static SingletonClass instance;

    private SingletonClass()
    {
        System.out.println("SingletonClass");
    }

    public static SingletonClass getInstance()
    {
        if(instance == null)
        {
            instance = new SingletonClass();
        }
        return instance;
    }
}