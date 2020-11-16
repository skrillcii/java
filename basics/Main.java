import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // primitive();
        // reference();
        // array();
        // read();
        // conditional();
        // fizzbuss();
        // loop();
    }

    public static void primitive(){
        // Primitive Variables
        int age = 30;
        long view = 1231241212312320L;
        float price = 10.1238F;
        char grade = 'A';
        boolean member = false;

        System.out.println("Hello World");
        System.out.printf("age: %d, view: %d, price: %f, grade: %s, member: %b",
                age, view, price, grade, member);
    }

    public static void reference(){
        // Reference Variables
        Date now = new Date();
        System.out.println("");
        System.out.println(now);

        String message = new String("Hello Reference Variables");
        System.out.println(message);
    }

    public static void array(){
        // Array
        int[] numbers_a = new int[5];
        numbers_a[0] = 1;
        numbers_a[1] = 2;

        int[] numbers_b = {1, 2, 0, 0, 0};

        // This show memory address of an array
        System.out.println(numbers_a);
        System.out.println(numbers_b);
        // This show the values in array to string
        System.out.println(Arrays.toString(numbers_a));
        System.out.println(Arrays.toString(numbers_b));
    }

    public static void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Age: ");
        int age = scanner.nextInt();
        System.out.println("You are " + age);
        scanner.close();
    }

    public static void conditional() {
        int x = 1;
        int y = 1;
        System.out.println(x == y);

        // && and, || or, ! not
        int temperature = 12;
        boolean isWarm = temperature > 20 && temperature > 30;
        System.out.println(isWarm);

        if (temperature > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink water");
        } 
        else if (temperature < 15) {
            System.out.println("It's a cold day");
            System.out.println("Keep warm");
        }
        else {
            System.out.println("Nice weather");
        }
    }

    public static void fizzbuss() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number: ");
        int number = scanner.nextInt();

        if (number % 3 == 0 && number % 5 ==0)
            System.out.println("Fizzbuss");
        else if (number % 3 == 0 )
            System.out.println("Buss");
        else if (number % 5 == 0)
            System.out.println("Fizz");
        else
            System.out.println(number);
        scanner.close();
    }

    public static void loop() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hellow For Loop " + i);
        }

        int i = 0;
        while (i < 5) {
            System.out.println("Hello While Loop " + i);
            i++;
        }

        // Condition with string type is handled differently
        Scanner  scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
        }

        // Do-While loop execute codes at least once, and only check condition at last
        do {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }
        while (!input.equals("quit"));

        // Continue and break loop
        while (true) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("pass"))
                continue;
            if (input.equals("quit"))
                break;
            System.out.println(input);
        }
        scanner.close();

        String[] fruits = {"Apple", "Mango", "Orange"};
        // Basic for loop has access to index and control of flow which can be forward or backward
        for (int j = 0; j < fruits.length; j++)
            System.out.println(fruits[j]);

        // For each loop is forward only without index info
        for (String fruit : fruits)
            System.out.println(fruit);
    }
}
