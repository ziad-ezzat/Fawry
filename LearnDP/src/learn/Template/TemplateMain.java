package learn.Template;

public class TemplateMain {
    public static void main(String[] args)
    {
        CoffeeMachine espresso = new Espresso();
        espresso.makeCoffee();

        System.out.println();

        CoffeeMachine nescafe = new Nescafe();
        nescafe.makeCoffee();
    }
}
