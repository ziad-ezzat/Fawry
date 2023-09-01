import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // interface class example to functional interface
        MyInterface myInterface = () -> System.out.println("Display Method Executed");
        myInterface.display();
        myInterface.defaultMethod();
        MyInterface.staticMethod();

        // ---------------------------------------------

        Runnable runnable = () -> System.out.println("Runnable Interface Executed");
        runnable.run();

        // ---------------------------------------------

        List<Integer> list = List.of(1, 2, 3, 4, 5);
        int sum = list.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        // ---------------------------------------------

        MyInterfaceImpl myInterfaceImpl = new MyInterfaceImpl();
        myInterfaceImpl.display();
        myInterfaceImpl.defaultMethod();
        MyInterface.staticMethod();

        // ---------------------------------------------

        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);

        LocalDate nextWeek = today.plusWeeks(1);
        System.out.println("Next week: " + nextWeek);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = today.format(formatter);
        System.out.println("Formatted date: " + formattedDate);

        // ---------------------------------------------

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Using lambda expression
        names.forEach(name -> System.out.println(name));

        // Using method reference
        names.forEach(System.out::println);
    }
}