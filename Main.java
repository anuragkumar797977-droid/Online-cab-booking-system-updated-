import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CabService service = new CabService();

        while (true) {
            System.out.println("\n===== ONLINE CAB BOOKING SYSTEM =====");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.println("4. Admin Login");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> service.registerUser();

                case 2 -> service.loginUser();

                case 3 -> {
                    System.out.println("Thank you for using Cab Booking System!");
                    System.exit(0);
                }

                case 4 -> {
                    System.out.print("Enter admin password: ");
                    String pass = sc.next();

                    if (pass.equals("admin123")) {
                        AdminService.showDashboard(
                                service.users,
                                service.bookings
                        );
                    } else {
                        System.out.println("Wrong admin password!");
                    }
                }

                default -> System.out.println("Invalid choice!");
            }
        }
    }
}
