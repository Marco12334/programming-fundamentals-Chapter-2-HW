public class Main {
    public static void main(String[] args) {
        int hour = 17;
        int minute = 15;
        int second = 30;

        int secondsSinceMidnight = hour * 3600 + minute * 60 + second;
        System.out.println("Seconds since midnight: " + secondsSinceMidnight);

        int remainingSeconds = 24 * 3600 - secondsSinceMidnight;
        System.out.println("Remaining seconds in the day: " + remainingSeconds);

        double percentagePassed = (secondsSinceMidnight / (24.0 * 3600)) * 100;
        System.out.println("Percentage of the day that has passed: " + percentagePassed + "%");
    }
}
