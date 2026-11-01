import java.util.Scanner;

public class ItemCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Item Cost Calculator ===");
        System.out.print("How many different items? ");
        int itemCount = scanner.nextInt();
        scanner.nextLine(); // clear leftover newline

        double subtotal = 0;

        for (int i = 1; i <= itemCount; i++) {
            System.out.println("\nItem " + i);
            System.out.print("  Name: ");
            String name = scanner.nextLine();

            System.out.print("  Price per unit: ");
            double price = scanner.nextDouble();

            System.out.print("  Quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            double itemTotal = price * quantity;
            subtotal += itemTotal;
            System.out.printf("  %s x%d = %.2f%n", name, quantity, itemTotal);
        }

        System.out.print("\nEnter tax rate (%): ");
        double taxRate = scanner.nextDouble();

        double tax = subtotal * (taxRate / 100);
        double total = subtotal + tax;

        System.out.println("\n--- Summary ---");
        System.out.printf("Subtotal: %.2f%n", subtotal);
        System.out.printf("Tax (%.1f%%): %.2f%n", taxRate, tax);
        System.out.printf("Total:    %.2f%n", total);

        scanner.close();
    }
}
