package Q2_PartA_Directory.PackagePartA;

import java.util.Scanner;


public class MainPolynomialPartA {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String moveForwardPartA = "no";
        String hasCoefficientAndVariableMultiplied = "no";
        int degreeOfTerm;
        int coefficient;
        double variableValue;
        String termIsConstant = "no";



        PolynomialPartA testPoly = new PolynomialPartA(3);
        testPoly.setCoefficient(2, 6);
        testPoly.calculate(3.0);
        testPoly.setCoefficient(3, 2);
        testPoly.calculate(3.0);
        testPoly.setCoefficient(1, 7);
        testPoly.calculate(3.0);
        System.out.println(testPoly.evaluate());


        System.out.println("Enter the degree of your polynomial (highest degree of the polynomial): ");

        degreeOfTerm = scnr.nextInt();

        PolynomialPartA polyPartA = new PolynomialPartA(degreeOfTerm);

        System.out.println("Enter your leading coefficient: ");

        coefficient = scnr.nextInt();

        polyPartA.setCoefficient(degreeOfTerm, coefficient);

        System.out.println("Enter the variable value: ");

        variableValue = scnr.nextDouble();

        polyPartA.calculate(variableValue);

        System.out.println("Do you have more terms to add? Enter yes or no: ");

        moveForwardPartA = scnr.next();

        while (moveForwardPartA.equals("yes")) {

            System.out.println("Does your term have a coefficient and variable being multiplied, " +
                    "such as 5x? Enter yes or no: ");

            hasCoefficientAndVariableMultiplied = scnr.next();

            while (hasCoefficientAndVariableMultiplied.equals("yes")) {
                System.out.println("Enter the degree of your term: ");
                degreeOfTerm = scnr.nextInt();
                System.out.println("Enter your coefficient: ");
                coefficient = scnr.nextInt();
                polyPartA.setCoefficient(degreeOfTerm, coefficient);
                System.out.println("Enter the variable value: ");
                variableValue = scnr.nextDouble();
                polyPartA.calculate(variableValue);
                System.out.println("Do you have another term where the coefficient and variable " +
                        "are being multiplied? Enter yes or no: ");

                hasCoefficientAndVariableMultiplied = scnr.next();

            }

            if (hasCoefficientAndVariableMultiplied.equals("no")) {
                System.out.println("Is your term a constant? Enter yes or no: ");
                termIsConstant = scnr.next();
                while (termIsConstant.equals("yes")) {
                    System.out.println("Enter your coefficient: ");
                    coefficient = scnr.nextInt();
                    polyPartA.setCoefficient(0, coefficient);
                    System.out.println("Enter the variable value: ");
                    variableValue = scnr.nextDouble();
                    polyPartA.calculate(variableValue);
                    System.out.println("Do you have another constant? Enter yes or no: ");
                    termIsConstant = scnr.next();
                }

            }

            System.out.println("Do you wish to continue Part A of the project? Enter yes or no: ");
            moveForwardPartA = scnr.next();
            if (moveForwardPartA.equals("no")) {
                System.out.println(polyPartA.evaluate());
            }

        }


        }
    }





