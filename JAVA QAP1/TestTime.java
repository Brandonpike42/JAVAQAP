public class TestTime {
    public static void main(String[] args) {
        // Create time objects
        Time t1 = new Time(0, 0, 0);
        Time t2 = new Time(0, 0, 0);

        // Set time using setTime()
        t1.setTime(21, 10, 15);
        t2.setTime(10, 20, 25);

        // Display times before changes
        System.out.println("Before changes:");
        System.out.println("Time 1: " + t1.toString());
        System.out.println("Time 2: " + t2.toString());

        // Modify times
        t1.nextSecond();      // Advance t1 by 1 second
        t2.previousSecond();  // Go back 1 second for t2

        // Display final times
        System.out.println("\nAfter changes:");
        System.out.println("Time 1: " + t1.toString());
        System.out.println("Time 2: " + t2.toString());
    }
}
