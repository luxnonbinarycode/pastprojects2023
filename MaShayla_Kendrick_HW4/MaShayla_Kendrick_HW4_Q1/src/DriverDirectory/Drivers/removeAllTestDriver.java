package DriverDirectory.Drivers;
import java.util.Scanner;
import ClassDirectory.Classes.*;
/*
MaShayla Kendrick Assignment 4 project

This test driver tests the removeAll method in LinkedCollection.
 */


// class to hold removeAll test driver
public class removeAllTestDriver {
    public static void main(String [] args) {
        Scanner scnr = new Scanner(System.in);

        Boolean addNode;

        System.out.println("This program allows a user to remove all\n" +
                "instances of an element");

        System.out.println("Choose a data type for your linked collection.\n" +
                "Options are 'String' or 'Integer' > ");

        String removeAllDataType = scnr.next();

        if (removeAllDataType.equals("String")) {
            LinkedCollection<String> removeTestCollection = new LinkedCollection<>();

            System.out.println("Enter your node input > ");

            String nodeInput = scnr.next();

            removeTestCollection.add(nodeInput);

            System.out.println("Do you want to add another node to the collection?\n" +
                    "Enter 'Yes' or 'No'.");

            addNode = scnr.nextBoolean();

            while (addNode.equals("Yes")) {
                System.out.println("Enter your node input > ");

               nodeInput = scnr.next();

                removeTestCollection.add(nodeInput);

                System.out.println("Do you want to add another node to the collection?\n" +
                        "Enter 'Yes' or 'No'.");

                addNode = scnr.nextBoolean();
            }
            if (addNode.equals("No")) {
                System.out.println("What element do you wish to see removed?");
                String removeTarget = scnr.next();
                removeTestCollection.removeAll(removeTarget);
            }
        }

        else {
            LinkedCollection<Integer> removeTestCollection = new LinkedCollection<>();

            System.out.println("Enter your node input > ");

            Integer nodeInput = scnr.nextInt();

            removeTestCollection.add(nodeInput);

            System.out.println("Do you want to add another node to the collection?\n" +
                    "Enter 'Yes' or 'No'.");

            addNode = scnr.nextBoolean();

            while (addNode.equals("Yes")) {
                System.out.println("Enter your node input > ");

                nodeInput = scnr.nextInt();

                removeTestCollection.add(nodeInput);

                System.out.println("Do you want to add another node to the collection?\n" +
                        "Enter 'Yes' or 'No'.");

                addNode = scnr.nextBoolean();
            }
            if (addNode.equals("No")) {
                System.out.println("What element do you wish to see removed?");
                Integer removeTarget = scnr.nextInt();
                removeTestCollection.removeAll(removeTarget);
            }
        }
        }
    }

