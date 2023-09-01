package learn.Template;

public class Espresso extends CoffeeMachine{
    @Override
    void brewCoffee()
    {
        System.out.println("Dripping espresso through filter");
    }

    @Override
    void addSugarAndMilk()
    {
        System.out.println("Adding a shot of steamed milk");
    }
}
