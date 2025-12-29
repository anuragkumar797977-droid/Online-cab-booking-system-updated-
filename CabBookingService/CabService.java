import java.util.*;

public class CabService {
    Scanner sc = new Scanner(System.in);

    ArrayList<User> users = new ArrayList<>();
    ArrayList<Booking> bookings = new ArrayList<>();

    // FIXED AREA DISTANCES
    Map<String, Integer> areas = Map.of(
            "Gandhi Maidan", 1,
            "Kankarbagh", 3,
            "Patna Junction", 5,
            "Boring Road", 7,
            "Bailey Road", 9,
            "Airport", 12
    );

    // ================= REGISTER =================
    public void registerUser() {
        System.out.print("Enter username: ");
        String user = sc.next();

        System.out.print("Enter password: ");
        String pass = sc.next();

        users.add(new User(user, pass));
        System.out.println("Registration Successful!");
    }

    // ================= LOGIN =================
    public void loginUser() {
        System.out.print("Enter username: ");
        String user = sc.next();
        System.out.print("Enter password: ");
        String pass = sc.next();

        for (User u : users) {
            if (u.username.equals(user) && u.password.equals(pass)) {
                System.out.println("Login Successful!");
                userMenu(user);
                return;
            }
        }
        System.out.println("Invalid Login!");
    }

    // ================= USER MENU =================
    public void userMenu(String username) {
        while (true) {
            System.out.println("\n===== USER MENU =====");
            System.out.println("1. Book Cab");
            System.out.println("2. View My Bookings");
            System.out.println("3. Logout");

            System.out.print("Enter choice: ");
            int option = sc.nextInt();

            switch (option) {
                case 1 -> bookCab(username);
                case 2 -> viewBookings(username);
                case 3 -> {
                    System.out.println("Logged out!");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    // ================= BOOK CAB =================
    public void bookCab(String username) {

        System.out.println("\nAvailable Locations:");
        for (String a : areas.keySet()) {
            System.out.println("- " + a);
        }

        sc.nextLine(); // clear buffer

        System.out.print("\nEnter Pickup Location: ");
        String pickup = sc.nextLine();

        if (!areas.containsKey(pickup)) {
            System.out.println("Invalid pickup location!");
            return;
        }

        System.out.print("Enter Drop Location: ");
        String drop = sc.nextLine();

        if (!areas.containsKey(drop)) {
            System.out.println("Invalid drop location!");
            return;
        }

        System.out.print("\nEnter Distance (in km): ");
        double distance = sc.nextDouble();

        if (distance <= 0) {
            System.out.println("Invalid distance!");
            return;
        }

        System.out.println("\nChoose Cab Type:");
        System.out.println("1. Auto (₹10/km)");
        System.out.println("2. Mini (₹15/km)");
        System.out.println("3. Prime (₹20/km)");
        System.out.print("Enter cab type: ");
        int type = sc.nextInt();

        Cab cab;
        switch (type) {
            case 1 -> cab = new Cab("Auto", 10);
            case 2 -> cab = new Cab("Mini", 15);
            case 3 -> cab = new Cab("Prime", 20);
            default -> {
                System.out.println("Invalid cab type!");
                return;
            }
        }

        double fare = cab.pricePerKm * distance;

        // ================= PAYMENT =================
        boolean paid = Payment.makePayment(fare);
        if (!paid) {
            System.out.println("Payment Failed. Booking Cancelled!");
            return;
        }      
              LiveLocation.trackCab(distance);

            
        Booking b = new Booking(username, cab.type, pickup, drop, distance, fare);
        bookings.add(b);

        System.out.println("\nCab Booked Successfully!");
        b.showBooking();
    }

    // ================= VIEW BOOKINGS =================
    public void viewBookings(String username) {
        System.out.println("\n----- My Bookings -----");
        boolean found = false;

        for (Booking b : bookings) {
            if (b.username.equals(username)) {
                b.showBooking();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No bookings found!");
        }
    }
}
