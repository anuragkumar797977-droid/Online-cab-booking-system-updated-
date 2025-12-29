public class LiveLocation {

    public static void trackCab(double distance) {
        System.out.println("\nTracking Cab Live Location...");

        while (distance > 0) {
            System.out.println("Cab is " + distance + " km away");
            try {
                Thread.sleep(1000); // 1 second delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            distance--;
        }

        System.out.println("Cab has arrived at your pickup location!");
    }
}
