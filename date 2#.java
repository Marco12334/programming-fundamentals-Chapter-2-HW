public class Main {
    public static void main(String[] args) {
        String day = "Monday";
        String date = "2";
        String month = "September";
        String year = "2019";

        System.out.println("Day: " + day);
        System.out.println("Date: " + date);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);

        System.out.println("\nAmerican format:");
        System.out.println(day + ", " + month + " " + date + ", " + year);

        System.out.println("\nEuropean format:");
        System.out.println(day + " " + date + " " + month + " " + year);
    }
}
