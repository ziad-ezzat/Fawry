package learn.Template;

public class Nescafe extends CoffeeMachine{
    @Override
    void brewCoffee()
    {
        System.out.println("Dripping instant coffee through filter");
    }

    @Override
    void addSugarAndMilk()
    {
        System.out.println("Adding sugar and cream");
    }
}
