import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int num = scanner.nextInt();

        int hundreds = num / 100;
        int tens = (num % 100) / 10;
        int ones = num % 10;

        System.out.println("The digits in reverse order are " + ones + tens + hundreds + ".");
    }
}
