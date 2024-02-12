import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of seconds: ");
        int total_seconds = scanner.nextInt();

        int hours = total_seconds / 3600;
        int remaining_seconds = total_seconds % 3600;
        int minutes = remaining_seconds / 60;
        int seconds = remaining_seconds % 60;

        System.out.println(total_seconds + " seconds is equal to " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds.");
    }
}
