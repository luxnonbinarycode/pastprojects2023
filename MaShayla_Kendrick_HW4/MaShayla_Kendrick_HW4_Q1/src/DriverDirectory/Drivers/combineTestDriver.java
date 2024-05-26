package DriverDirectory.Drivers;
import java.util.Scanner;
import ClassDirectory.Classes.*;

public class combineTestDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueAdding = true;
        LinkedCollection<Object> combinedCollection = new LinkedCollection<Object>();

        while (continueAdding) {
            System.out.println("Choose data type: 1 for String, 2 for Integer");
            int dataTypeChoice = input.nextInt();

            if (dataTypeChoice == 1) {
                System.out.println("Enter a String element:");
                String element = input.next();
                combinedCollection.add(element);
            } else if (dataTypeChoice == 2) {
                System.out.println("Enter an Integer element:");
                int element = input.nextInt();
                combinedCollection.add(element);
            } else {
                System.out.println("Invalid data type choice.");
            }

            System.out.println("Do you want to continue? (true/false)");
            continueAdding = input.nextBoolean();
        }

        System.out.println("Combined Collection: " + combinedCollection);
        System.out.println("Program finished.");
    }
}