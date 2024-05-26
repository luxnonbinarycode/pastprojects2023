package DriverDirectory.Drivers;

import java.util.Scanner;
import ClassDirectory.Classes.*;


/*
MaShayla Kendrick Assignment 4 project

This test driver tests the count method in LinkedCollection.
 */

// Class to hold count test driver
public class countTestDriver {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Boolean addNode;
        System.out.println("This program allows the\n" +
                "user to count all instances of a\n" +
                "single element.");
        System.out.println("What is the data type of\n" +
                "your linked collection? Choose 'String'\n" +
                "or 'Integer'.");

        String countTestDataType = scnr.next();

        if (countTestDataType.equals("String")) {
            LinkedCollection<String> countTestCollection = new LinkedCollection<>();
            System.out.println("Enter a node input > ");
            String nodeInput = scnr.next();
            countTestCollection.add(nodeInput);
            System.out.println("Do you want to add more nodes? Type 'Yes' or 'No'.");
            addNode = scnr.nextBoolean();
            while (addNode.equals("yes")) {
                System.out.println("Enter a node input > ");
                nodeInput = scnr.next();
                countTestCollection.add(nodeInput);
                System.out.println("Do you want to continue adding nodes? Type 'Yes' or 'No'.");
                addNode = scnr.nextBoolean();
            }
            if (addNode.equals("No")) {
                System.out.println("What element do you wish to count? > ");
                String target = scnr.next();
                int numTarget = countTestCollection.count(target);
                System.out.println("There are " + numTarget + "instances of\n" +
                        "target " + target);

            }
        } else {
            LinkedCollection<Integer> countTestCollection = new LinkedCollection<>();
            System.out.println("Enter a node input > ");
            Integer nodeInput = scnr.nextInt();
            countTestCollection.add(nodeInput);
            System.out.println("Do you want to add more nodes? Type 'Yes' or 'No'.");
            addNode = scnr.nextBoolean();
            while (addNode.equals("yes")) {
                System.out.println("Enter a node input > ");
                nodeInput = scnr.nextInt();
                countTestCollection.add(nodeInput);
                System.out.println("Do you want to continue adding nodes? Type 'Yes' or 'No'.");
                addNode = scnr.nextBoolean();
            }
            if (addNode.equals("No")) {
                System.out.println("What element do you wish to count? > ");
                Integer target = scnr.nextInt();
                int numTarget = countTestCollection.count(target);
                System.out.println("There are " + numTarget + "instances of\n" +
                        "target " + target);
            }

        }

    }
}