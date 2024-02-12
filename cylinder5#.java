import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double PI = 3.1416;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the base circle: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the length of the cylinder: ");
        double length = scanner.nextDouble();

        double base_area = PI * Math.pow(radius, 2);
        double volume = base_area * length;

        System.out.println("The base area of the cylinder is " + base_area + " square units.");
        System.out.println("The volume of the cylinder is " + volume + " cubic units.");
    }
}
