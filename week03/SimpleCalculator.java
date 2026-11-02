import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String again;

        System.out.println("=== Simple Calculator ===");

        do {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            switch (operator) {
                case '+':
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                    } else {
                        System.out.println("Result: " + (num1 / num2));
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator.");
            }

            System.out.print("Calculate again? (y/n): ");
            again = scanner.next();
        } while (again.equalsIgnoreCase("y"));

        System.out.println("Goodbye!");
        scanner.close();
    }
}
