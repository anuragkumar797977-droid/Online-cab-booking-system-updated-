import java.util.Scanner;

public class Payment {
    public static boolean makePayment(double amount) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- Payment Options ---");
        System.out.println("1. Cash");
        System.out.println("2. UPI");
        System.out.println("3. Card");
        System.out.print("Choose payment method: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Cash payment selected.");
                break;
            case 2:
                System.out.println("UPI payment successful.");
                break;
            case 3:
                System.out.println("Card payment successful.");
                break;
            default:
                System.out.println("Invalid payment method!");
                return false;
        }

        System.out.println("Amount Paid: ₹" + amount);
        return true;
    }
}
