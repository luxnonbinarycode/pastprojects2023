package Q2_PartB_Directory.PackagePartB;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class MainPolynomialPartB {
    public static void main(String[] args) {
        System.out.println("This program takes command line inputs and creates\n" +
                "polynomials, and calculates answers with entered x-values.\n" +
                "For example, if the polynomial you want is 5x^3 + 2x -3, enter it in the\n" +
                "command prompt as 3 5 1 2 0 -3. The degrees go first and then\n" +
                "the coefficients for those degrees. For constants, put 0 for the degrees.");

        System.out.println();

        List<Double> coefficientList = new ArrayList<>();

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        while (true) {
            System.out.print("Enter degree and coefficient pairs (or 'q' to quit): ");
            String input = scanner.nextLine();

            if (input.equals("q")) {
                break;
            }

            String[] values = input.split(" ");
            if (values.length % 2 != 0) {
                System.out.println("Invalid input. Please enter degree and coefficient pairs.");
                continue;
            }

            try {
                for (int i = 0; i < values.length; i += 2) {
                    int degree = Integer.parseInt(values[i]);
                    double coefficient = Double.parseDouble(values[i + 1]);
                    coefficientList.add((double) degree);
                    coefficientList.add(coefficient);
                }

                double[] coefficients = new double[coefficientList.size()];
                for (int i = 0; i < coefficientList.size(); i++) {
                    coefficients[i] = coefficientList.get(i);
                }

                PolynomialPartB polynomial = new PolynomialPartB(coefficients);

                while (true) {
                    System.out.print("Enter an x-value to evaluate the polynomial (or 'q' to quit): ");
                    String xInput = scanner.nextLine();
                    if (xInput.equals("q")) {
                        break;
                    }

                    try {
                        double x = Double.parseDouble(xInput);
                        double result = polynomial.evaluate(x);
                        System.out.println("Result: " + result);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a valid x-value or 'q' to quit.");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter valid degree and coefficient pairs.");
            }

            coefficientList.clear();
        }

        scanner.close();
    }
    }


