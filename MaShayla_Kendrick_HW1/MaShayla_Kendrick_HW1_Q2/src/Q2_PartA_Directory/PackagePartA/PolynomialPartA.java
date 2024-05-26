package Q2_PartA_Directory.PackagePartA;

import java.lang.Math;

public class PolynomialPartA {

    protected int highestDegree;
    protected int elementDegree;

    protected int coefficientToSet;

    double answerAccumulate = 0;



    public PolynomialPartA(int degreeOfTerm) {
        highestDegree = degreeOfTerm;
    }

    public void setCoefficient(int degreeOfTerm, int coefficient) {
        elementDegree = degreeOfTerm;
        coefficientToSet = coefficient;
    }


    public void calculate(double variableValue) {
        answerAccumulate += coefficientToSet * (Math.pow(variableValue, elementDegree));
    }

    public double evaluate() {
        return answerAccumulate;
    }

}
