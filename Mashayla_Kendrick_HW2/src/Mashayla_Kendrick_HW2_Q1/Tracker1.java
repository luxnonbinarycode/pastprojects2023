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


public class Tracker1 implements NumTrackerInterface{
    Scanner scnr = new Scanner(System.in);
    int tracker1NumCount;
    int i;
    int numSum;

    double average;


    public Tracker1() {

    }

    public void add(int numCount) {
        tracker1NumCount = numCount;
        System.out.println("Please type in your numbers > ");
        for (i = 0; i < tracker1NumCount; i++) {
            numSum += scnr.nextInt();
        }
    }

    public void findAverage() {
        double doubleNumSum = Double.valueOf(numSum);
        double doubleTracker1NumCount = Double.valueOf(tracker1NumCount);
        average = doubleNumSum / doubleTracker1NumCount;
    }

    public int getSum() {
        return numSum;
    }

    public int getCount() {
        return tracker1NumCount;
    }

    public double getAverage() {
        return average;
    }

     public void print() {
        System.out.print(getCount() + " ");
        System.out.print(getSum() + " ");
        System.out.printf("%.2f", getAverage());
        System.out.println();

    }

}
