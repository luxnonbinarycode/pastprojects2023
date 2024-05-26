package Q2_PartC_Directory.PackagePartC;

import java.util.Scanner;

class PolynomialPartC {

    public static double calculateDefiniteIntegral(double[] coefficients,
                                                   double[] degrees, double a, double b) {
        int n = 1000;
        double dx = (b - a) / n;
        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            double x_mid = a + (i + 0.5) * dx;
            double f_x_mid = evaluatePolynomial(coefficients, degrees, x_mid);
            sum += f_x_mid * dx;
        }

        return sum;
    }


    public static double evaluatePolynomial(double[] coefficients, double[] degrees, double x) {
        double result = 0.0;
        for (int i = 0; i < coefficients.length; i++) {
            result += coefficients[i] * Math.pow(x, degrees[i]);
        }
        return result;
    }
}




