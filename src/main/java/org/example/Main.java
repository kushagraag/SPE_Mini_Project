package org.example;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        int a = 4, b = 5;
        System.out.print(a + b);

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Please choose a function:");
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Logarithm");
            System.out.println("4. Power Function");
            System.out.println("0. Exit");

            int choice = input.nextInt();
            double num;

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    num = input.nextDouble();
                    System.out.println("Square root of " + num + " is " + squareRoot(num));
                    break;
                case 2:
                    System.out.print("Enter a number: ");
                    int n = input.nextInt();
                    System.out.println("Factorial of " + n + " is " + factorial(n));
                    break;
                case 3:
                    System.out.print("Enter a number: ");
                    num = input.nextDouble();
                    System.out.println("Natural logarithm of " + num + " is " + naturalLog(num));
                    break;
                case 4:
                    System.out.print("Enter a base: ");
                    double base = input.nextDouble();
                    System.out.print("Enter an exponent: ");
                    double exponent = input.nextDouble();
                    System.out.println(base + " raised to the power of " + exponent + " is " + power(base, exponent));
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
            input.close();
        }
    }

        public static double squareRoot(double num) {
            return Math.sqrt(num);
        }

        public static int factorial(int num) {
            if (num == 0) {
                return 1;
            } else {
                return num * factorial(num - 1);
            }
        }

        public static double naturalLog(double num) {
            return Math.log(num);
        }

        public static double power(double base, double exponent) {
            return Math.pow(base, exponent);
        }
}