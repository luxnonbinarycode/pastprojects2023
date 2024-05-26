package Q2_PartB_Directory.PackagePartB;

public class PolynomialPartB {
    private double[] coefficients;

    public PolynomialPartB(double[] coefficients) {
        this.coefficients = coefficients;
    }

    public double evaluate(double x) {
        double result = 0.0;
        for (int i = 0; i < coefficients.length; i += 2) {
            int degree = (int) coefficients[i];
            double coefficient = coefficients[i + 1];
            result += coefficient * Math.pow(x, degree);
        }
        return result;
    }
}
