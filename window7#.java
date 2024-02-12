import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the room: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the room: ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height of the room: ");
        double height = scanner.nextDouble();

        System.out.print("Enter the number of windows: ");
        int num_windows = scanner.nextInt();

        System.out.print("Enter the number of doors: ");
        int num_doors = scanner.nextInt();

        double total_area = 2 * (length * height + width * height) + length * width - (num_windows * 15 + num_doors * 21);

        int gallons = (int) (total_area / 350);
        double quarts = (total_area % 350) / 350.0 * 4;

        System.out.println("You will need " + gallons + " gallons and " + quarts + " quarts of paint.");
    }
}
