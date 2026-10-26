import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        do {
            System.out.println();
            System.out.println("CALCULATOR - please select:");
            System.out.println("0: end program");
            System.out.println("1: add");
            System.out.println("2: subtract");
            System.out.println("3: multiply");
            System.out.println("4: divide");
            System.out.println("5: sin");
            System.out.println("6: power");
            System.out.println("7: gcd");
            System.out.println("8: fibonacci");

            System.out.print("Selection: ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
                continue;
            }
            switch (choice) {

                case 1:
                    System.out.print("First number: ");
                    double add1 = scanner.nextDouble();

                    System.out.print("Second number: ");
                    double add2 = scanner.nextDouble();

                    System.out.println("Result: " + add(add1, add2));
                    break;

                case 2:
                    System.out.print("Minuend: ");
                    double minuend = scanner.nextDouble();

                    System.out.print("Subtrahend: ");
                    double subtrahend = scanner.nextDouble();

                    System.out.println("Result: " + subtract(minuend, subtrahend));
                    break;

                case 3:
                    System.out.print("First number: ");
                    double factor1 = scanner.nextDouble();

                    System.out.print("Second number: ");
                    double factor2 = scanner.nextDouble();

                    System.out.println("Result: " + multiply(factor1, factor2));
                    break;

                case 4:
                    System.out.print("Dividend: ");
                    double dividend = scanner.nextDouble();

                    System.out.print("Divisor: ");
                    double divisor = scanner.nextDouble();

                    if (divisor == 0) {
                        System.out.println("Division by zero is not allowed.");
                    } else {
                        System.out.println("Result: " + divide(dividend, divisor));
                    }
                    break;

                case 5:
                    System.out.print("Angle in degrees: ");
                    double angle = scanner.nextDouble();

                    System.out.println("Result: " + sin(angle));
                    break;

                case 6:
                    System.out.print("Base x: ");
                    double base = scanner.nextDouble();

                    System.out.print("Exponent y: ");
                    double exponent = scanner.nextDouble();

                    System.out.println("Result: " + power(base, exponent));
                    break;

                case 7:
                    System.out.print("First integer: ");
                    int number1 = scanner.nextInt();

                    System.out.print("Second integer: ");
                    int number2 = scanner.nextInt();

                    System.out.println("Result: " + gcd(number1, number2));
                    break;

                case 8:
                    System.out.print("n: ");
                    int n = scanner.nextInt();

                    System.out.println("Result: " + fibonacci(n));
                    break;

                case 0:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid selection.");
            }

        } while (choice != 0);

        scanner.close();
    }

    public static double add(double summand1, double summand2) {
        return summand1 + summand2;
    }

    public static double subtract(double minuend, double subtrahend) {
        return minuend - subtrahend;
    }

    public static double multiply(double factor1, double factor2) {
        return factor1 * factor2;
    }

    public static double divide(double dividend, double divisor) {
        return dividend / divisor;
    }

    public static double sin(double angle) {
        return Math.sin(Math.toRadians(angle));
    }

    public static double power(double x, double y) {
        return Math.pow(x, y);
    }

    public static int gcd(int a, int b) {

        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int rest = a % b;
            a = b;
            b = rest;
        }

        return a;
    }

    public static long fibonacci(int n) {

        if (n <= 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        long a = 0;
        long b = 1;

        for (int i = 2; i <= n; i++) {
            long next = a + b;
            a = b;
            b = next;
        }

        return b;
    }
}