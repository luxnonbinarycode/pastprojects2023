package Mashayla_Kendrick_HW2_Q2;
import java.util.Scanner;
import java.lang.Integer;


public class Main {
    public static void main(String [] args) {

        Scanner scnr = new Scanner(System.in);

        System.out.println("What kind of input will you enter? Type 'String', 'Double'\n" +
                "'Integer' , 'Float' , or 'Boolean'. Type options\n" +
                "exactly as spelled out in the previous statement. >");

        String inputTypeBasicPair = scnr.next();

        System.out.println();

        System.out.println("What is the first input of the object >");

        String firstInputString = scnr.next();

        System.out.println();

        System.out.println("What is the second input of the object >");

        String secondInputString = scnr.next();

        if (inputTypeBasicPair.equals("String")) {
            PairInterface<String> myInputPair = new BasicPair<String>(firstInputString,
                    secondInputString);
            System.out.println();
            myInputPair.print();

        }

        else if (inputTypeBasicPair.equals("Double")) {
            Double firstInputDouble = Double.valueOf(firstInputString);
            Double secondInputDouble = Double.valueOf(secondInputString);
            PairInterface<Double> myPair = new BasicPair<Double>(firstInputDouble,
                    secondInputDouble);
            System.out.println();
            myPair.print();

        }

        else if (inputTypeBasicPair.equals("Integer")) {
            Integer firstInputInteger = Integer.valueOf(firstInputString);
            Integer secondInputInteger = Integer.valueOf(secondInputString);
            PairInterface<Integer> myPair = new BasicPair<Integer>(firstInputInteger,
                    secondInputInteger);
            System.out.println();
            myPair.print();

        }

        else if (inputTypeBasicPair.equals("Float")) {
            Float firstInputFloat = Float.valueOf(firstInputString);
            Float secondInputFloat = Float.valueOf(secondInputString);
            PairInterface<Float> myPair = new BasicPair<Float>(firstInputFloat,
                    secondInputFloat);
            System.out.println();
            myPair.print();

        }

        else  {
            Boolean firstInputBoolean = Boolean.valueOf(firstInputString);
            Boolean secondInputBoolean = Boolean.valueOf(secondInputString);
            PairInterface<Boolean> myPair = new BasicPair<Boolean>(firstInputBoolean,
                    secondInputBoolean);
            System.out.println();
            myPair.print();

        }

        System.out.println();
        System.out.println();

        System.out.println("Would you like to make an array pair? Type 'Yes'\n" +
                "or 'No'. >");

        String arrayContinue = scnr.next();
        String inputTypeArrayPair;
        String firstInputArrayPair;
        String secondInputArrayPair;

        if (arrayContinue.equals("Yes")) {
            System.out.println();
            System.out.println();
            System.out.println("For the Array Pair data type, type\n" +
                    "'String', 'Double', 'Float', 'Integer', or 'Boolean'.\n" +
                    "Type the answer exactly as spelled out in the\n" +
                    "previous sentence. >");
            inputTypeArrayPair = scnr.next();
            System.out.println();
            System.out.println("What is your first Array Pair input? >");
            firstInputArrayPair = scnr.next();
            System.out.println();
            System.out.println("What is your second Array Pair input? >");
            secondInputArrayPair = scnr.next();

            if (inputTypeArrayPair.equals("String")) {
                PairInterface<String> myArrayPair = new ArrayPair<String>(firstInputArrayPair,
                        secondInputArrayPair);
                System.out.println();
                myArrayPair.print();

            }

            else if (inputTypeArrayPair.equals("Double")) {
                Double firstInputDoubleArrayPair = Double.valueOf(firstInputArrayPair);
                Double secondInputDoubleArrayPair = Double.valueOf(secondInputArrayPair);
                PairInterface<Double> myArrayPair = new ArrayPair<Double>(firstInputDoubleArrayPair,
                        secondInputDoubleArrayPair);
                System.out.println();
                myArrayPair.print();

            }

            else if (inputTypeArrayPair.equals("Integer")) {
                Integer firstInputIntegerArrayPair = Integer.valueOf(firstInputArrayPair);
                Integer secondInputIntegerArrayPair = Integer.valueOf(secondInputArrayPair);
                PairInterface<Integer> myArrayPair = new ArrayPair<Integer>(firstInputIntegerArrayPair,
                        secondInputIntegerArrayPair);
                System.out.println();
                myArrayPair.print();

            }

            else if (inputTypeArrayPair.equals("Float")) {
                Float firstInputFloatArrayPair = Float.valueOf(firstInputArrayPair);
                Float secondInputFloatArrayPair = Float.valueOf(secondInputArrayPair);
                PairInterface<Float> myArrayPair = new ArrayPair<Float>(firstInputFloatArrayPair,
                        secondInputFloatArrayPair);
                System.out.println();
                myArrayPair.print();

            }

            else  {
                Boolean firstInputBooleanArrayPair = Boolean.valueOf(firstInputArrayPair);
                Boolean secondInputBooleanArrayPair = Boolean.valueOf(secondInputArrayPair);
                PairInterface<Boolean> myArrayPair = new ArrayPair<Boolean>(firstInputBooleanArrayPair,
                        secondInputBooleanArrayPair);
                System.out.println();
                myArrayPair.print();

            }

        }
        else {
            System.out.println("Thank you for trying the program!");
        }
    }
}
