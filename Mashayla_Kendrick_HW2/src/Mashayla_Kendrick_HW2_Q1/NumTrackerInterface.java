package Mashayla_Kendrick_HW2_Q1;

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

public interface NumTrackerInterface {
    void add(int numCount);
    // keeps track of both the sum and the count of numbers that are submitted to it through its
    // add method

     int getSum();
    // Returns sum

    int getCount();
    // Returns count

    double getAverage();
    // Returns average

     void findAverage();
    // finds average

    void print();
    // prints output

}
