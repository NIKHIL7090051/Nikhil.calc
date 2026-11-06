package calculator;

import java.util.Scanner;
import calculator.advanced.Trig;
import calculator.advanced.Matrix;
import calculator.advanced.Eqn;

public class Calc {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== SCIENTIFIC CALCULATOR =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Trigonometry");
            System.out.println("6. Matrix Addition");
            System.out.println("7. Solve Linear Equation (ax + b = 0)");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    double a = sc.nextDouble();
                    double b = sc.nextDouble();
                    System.out.println("Result = " + (a + b));
                    break;

                case 2:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result = " + (a - b));
                    break;

                case 3:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result = " + (a * b));
                    break;

                case 4:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    if (b == 0) {
                        System.out.println("Cannot divide by zero.");
                    } else {
                        System.out.println("Result = " + (a / b));
                    }
                    break;

                case 5:
                    System.out.print("Enter angle in degrees: ");
                    double angle = sc.nextDouble();
                    System.out.println("sin = " + Trig.sin(angle));
                    System.out.println("cos = " + Trig.cos(angle));
                    if (Math.abs(Math.cos(Math.toRadians(angle))) < 1e-12) {
                        System.out.println("tan is undefined for this angle.");
                    } else {
                        System.out.println("tan = " + Trig.tan(angle));
                    }
                    break;

                case 6:
                    double[][] m1 = new double[2][2];
                    double[][] m2 = new double[2][2];

                    System.out.println("Enter first 2x2 matrix (4 numbers):");
                    readMatrix(m1);
                    System.out.println("Enter second 2x2 matrix (4 numbers):");
                    readMatrix(m2);
                    Matrix.add(m1, m2);
                    break;

                case 7:
                    System.out.print("Enter a and b for ax + b = 0: ");
                    double coefficient = sc.nextDouble();
                    double constant = sc.nextDouble();
                    if (coefficient == 0) {
                        System.out.println("No unique solution because a is zero.");
                    } else {
                        System.out.println("x = " + Eqn.solve(coefficient, constant));
                    }
                    break;

                case 8:
                    System.out.println("Calculator closed.");
                    break;

                default:
                    System.out.println("Invalid choice. Please select 1 to 8.");
            }
        } while (choice != 8);

        sc.close();
    }

    private static void readMatrix(double[][] matrix) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix[i][j] = sc.nextDouble();
            }
        }
    }
}
