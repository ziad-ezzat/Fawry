package learn.Template;

public abstract class CoffeeMachine {
    void makeCoffee()
    {
        boilWater();
        brewCoffee();
        pourInCup();
        addSugarAndMilk();
    }

    void boilWater()
    {
        System.out.println("Boiling water");
    }

    abstract void brewCoffee();

    void pourInCup()
    {
        System.out.println("Pouring into cup");
    }

    abstract void addSugarAndMilk();
}
