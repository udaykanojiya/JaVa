package harry;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Interface representing a mathematical operation.
 */
interface Operation {
    double apply(double num1, double num2);
}

/**
 * Addition operation.
 */
class Addition implements Operation {
    @Override
    public double apply(double num1, double num2) {
        return num1 + num2;
    }
}

/**
 * Subtraction operation.
 */
class Subtraction implements Operation {
    @Override
    public double apply(double num1, double num2) {
        return num1 - num2;
    }
}

/**
 * Multiplication operation.
 */
class Multiplication implements Operation {
    @Override
    public double apply(double num1, double num2) {
        return num1 * num2;
    }
}

/**
 * Division operation.
 */
class Division implements Operation {
    @Override
    public double apply(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero.");
        }
        return num1 / num2;
    }
}

/**
 * Calculator engine that manages operations and executes them.
 */
class CalculatorEngine {
    private final Map<Character, Operation> operations = new HashMap<>();

    public CalculatorEngine() {
        operations.put('+', new Addition());
        operations.put('-', new Subtraction());
        operations.put('*', new Multiplication());
        operations.put('/', new Division());
    }

    public double calculate(double num1, char operator, double num2) {
        Operation operation = operations.get(operator);
        if (operation == null) {
            throw new IllegalArgumentException("Invalid operator: " + operator);
        }
        return operation.apply(num1, num2);
    }
}

/**
 * Main class for the professional calculator application.
 */
public class calci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorEngine engine = new CalculatorEngine();

        System.out.println("=== Professional Calculator ===");
        
        try {
            System.out.print("Enter first number: ");
            double num1 = readDouble(scanner);

            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = readDouble(scanner);

            double result = engine.calculate(num1, operator, num2);
            System.out.printf("Result: %.2f %c %.2f = %.2f%n", num1, operator, num2, result);

        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Exiting...");
        }
    }

    private static double readDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input! Please enter a numeric value: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}

