import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = 9.0/5.0 * celsius + 32;

        System.out.println("The temperature in Fahrenheit is " + fahrenheit + " degrees.");
    }
}
