@FunctionalInterface
interface MyInterface {
    // abstract method
    public void display();

    // default method
    default void defaultMethod() {
        System.out.println("Default Method Executed");
    }

    // static method
    static void staticMethod() {
        System.out.println("Static Method Executed");
    }
}