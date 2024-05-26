package DriverDirectory.Drivers;

import ClassDirectory.Classes.LinkedCollection;

import java.util.Scanner;

/*
MaShayla Kendrick Assignment 4 project

This program is a test driver for the LinkedCollection
toString method.

 */

// Class to hold main method/test driver
public class toStringTestDriver {
    public static void main (String[] args) {
        Scanner scnr = new Scanner (System.in);

        Boolean moveNextNode = false;

        System.out.println("This program allows\n" +
                "the user to add nodes to a linked\n" +
                "collection and print out a string\n" +
                "from that collection.");

        System.out.println("What kind of data will your\n" +
                "collection hold? Choose between String or Integer.");

        String dataType = scnr.next();

        if (dataType.equals("String")) {

            LinkedCollection<String> linkTestCollection = new LinkedCollection<>();
            System.out.println("Do you want to enter data into your linked collection?\n" +
                    "Please type 'Yes' or 'No'.");
            moveNextNode = scnr.nextBoolean();
            if (moveNextNode.equals("No")) {
                System.out.println(linkTestCollection.toString());
            }
            else {
                System.out.print("Enter node information > ");
                String nodeInput = scnr.next();
                linkTestCollection.add(nodeInput);
                System.out.println();
                System.out.println("Do you want to continue adding nodes? Enter 'Yes' or 'No'.");
                moveNextNode = scnr.nextBoolean();
                while (moveNextNode.equals("Yes")) {
                    System.out.print("Enter node information > ");
                    nodeInput = scnr.next();
                    linkTestCollection.add(nodeInput);
                    System.out.println();
                    System.out.println("Do you want to continue adding nodes? Enter 'Yes' or 'No'.");
                    moveNextNode = scnr.nextBoolean();
                }
                if (moveNextNode.equals("No")) {
                   System.out.println(linkTestCollection.toString());
                }

            }
        }
        else {
            LinkedCollection<Integer> linkTestCollection = new LinkedCollection<>();
            System.out.println("Do you want to enter data into your linked collection?\n" +
                    "Please type 'Yes' or 'No'.");
            moveNextNode = scnr.nextBoolean();
            if (moveNextNode.equals("No")) {
                System.out.println(linkTestCollection.toString());
            }
            else {
                System.out.print("Enter node information > ");
                Integer nodeInput = scnr.nextInt();
                linkTestCollection.add(nodeInput);
                System.out.println();
                System.out.println("Do you want to continue adding nodes? Enter 'Yes' or 'No'.");
                moveNextNode = scnr.nextBoolean();
                while (moveNextNode.equals("Yes")) {
                    System.out.print("Enter node information > ");
                    nodeInput = scnr.nextInt();
                    linkTestCollection.add(nodeInput);
                    System.out.println();
                    System.out.println("Do you want to continue adding nodes? Enter 'Yes' or 'No'.");
                    moveNextNode = scnr.nextBoolean();
                }
                if (moveNextNode.equals("No")) {
                    System.out.println(linkTestCollection.toString());
                }

                }
            }
        }
    }

