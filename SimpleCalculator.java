import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get user input
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result;

            // Perform calculation based on the operator
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("Error: Division by zero is not allowed.");
                    }
                    result = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("Error: Invalid operator. Please use +, -, *, or /.");
            }

            // Display result
            System.out.println("Result: " + result);

        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        } finally 
        {
            System.out.println("Congragulation!You are Genius.");
            scanner.close();
        }
    }
}
