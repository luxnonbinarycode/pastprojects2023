package Mashayla_Kendrick_HW2_Q1;
import java.util.Scanner;

/*
    DESIGN PHILOSOPHY DIFFERENCE BETWEEN TRACKER 1 AND TRACKER 2: For the Tracker 1 and
    Tracker 2 classes, they both give bodies to the methods of NumTrackerInterface. The main
    difference is the user's choice. For the Tracker 1 class, the user has the option of seeing
    the count of numbers, the sum of those numbers, and the average. In Tracker 2, not much
    emphasis is put on displaying the sum or count, however the user has a choice of calculating
    and displaying the average. The goal of Tracker 1 appears to be getting user input for
    summary information while the goal of Tracker 2 appears to be getting the most useful
    information, the average.

*/


public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String printResults;

        System.out.println("Please type in the amount of numbers in your problem for " +
                "the Tracker1 class > ");
        int numCount = scnr.nextInt();
        NumTrackerInterface track1Object = new Tracker1();
        track1Object.add(numCount);
        track1Object.findAverage();
        System.out.println("Do you want to see the amount of numbers, the sum\n" +
                "of those numbers, and their average? Type 'yes' if so, and 'no'\n" +
                "if not > ");
        printResults = scnr.next();

        if (printResults.equals("yes")) {
            track1Object.print();
            System.out.println();
        }

        System.out.println("Please enter the amount of numbers in your\n" +
                "problem for the Tracker2 class > ");
        numCount = scnr.nextInt();
        NumTrackerInterface track2Object = new Tracker2();
        track2Object.add(numCount);
        track2Object.findAverage();
        System.out.println("Do you want to calculate and display the average?\n" +
                "Type 'yes' if so and 'no' if not > ");
        printResults = scnr.next();

        if (printResults.equals("yes")) {
         System.out.printf("%.2f",track2Object.getAverage());
        }
    }
}
