public class Booking {
    String username;
    String cabType;
    String pickup;
    String drop;
    double distance;
    double fare;

    Booking(String username, String cabType, String pickup, String drop, double distance, double fare) {
        this.username = username;
        this.cabType = cabType;
        this.pickup = pickup;
        this.drop = drop;
        this.distance = distance;
        this.fare = fare;
    }

    public void showBooking() {
        System.out.println("\n----- Booking Details -----");
        System.out.println("User: " + username);
        System.out.println("Cab Type: " + cabType);
        System.out.println("Pickup: " + pickup);
        System.out.println("Drop: " + drop);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: ₹" + fare);
        System.out.println("---------------------------");
    }
}
