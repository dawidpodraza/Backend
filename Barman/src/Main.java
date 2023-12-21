import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Car car1 = new Car("audi",1989);

        System.out.println(car1.getName());

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();


    }
}