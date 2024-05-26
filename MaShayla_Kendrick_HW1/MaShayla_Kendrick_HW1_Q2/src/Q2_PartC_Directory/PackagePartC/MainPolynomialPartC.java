package Q2_PartC_Directory.PackagePartC;

import java.util.Scanner;

public class MainPolynomialPartC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the degree-coefficient pairs (e.g., 3 5 1 2 0 -3): ");
        String input = scanner.nextLine();
        String[] inputValues = input.split(" ");


        if (inputValues.length % 2 != 0) {
            System.out.println("Invalid input format. Please provide valid degree-coefficient pairs.");
            return;
        }

        int numPairs = inputValues.length / 2;


        double[] coefficients = new double[numPairs];
        double[] degrees = new double[numPairs];

        int inputIndex = 0;
        for (int i = 0; i < numPairs; i++) {
            try {
                degrees[i] = Double.parseDouble(inputValues[inputIndex]);
                coefficients[i] = Double.parseDouble(inputValues[inputIndex + 1]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input format. Please provide valid degree-coefficient pairs.");
                return;
            }
            inputIndex += 2;
        }


        System.out.print("Enter the start of the interval: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the end of the interval: ");
        double b = scanner.nextDouble();


        double definiteIntegral = PolynomialPartC.calculateDefiniteIntegral(coefficients, degrees, a, b);

        System.out.println("Approximate definite integral:");
        System.out.printf("%.3f", definiteIntegral);

        scanner.close();
    }
}
