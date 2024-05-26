import java.util.Scanner;


public class MainShoppingBag {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int itemNum;
        double costForEachItem;
        double taxPercent = 0.06;

        ShoppingBag firstBag = new ShoppingBag(6, 9.50, taxPercent);
        firstBag.place(3,8.70);
        System.out.println(firstBag);
        firstBag.formatTotalCost();

        System.out.println();

        ShoppingBag secondBag = new ShoppingBag(10, 2.00, taxPercent);
        secondBag.place(4, 9.30);
        System.out.println(secondBag);
        secondBag.formatTotalCost();

        System.out.println();

        ShoppingBag myBag = null;


        System.out.println("Enter count (use 0 to stop): ");

        itemNum = scnr.nextInt();
        System.out.println("Enter cost: ");
        costForEachItem = scnr.nextDouble();
        myBag = new ShoppingBag(itemNum, costForEachItem, taxPercent);

        System.out.println("Enter count (use 0 to stop): ");
        itemNum = scnr.nextInt();

        while (itemNum != 0) {
            System.out.println("Enter cost: ");
            costForEachItem = scnr.nextDouble();
            myBag.place(itemNum, costForEachItem);
            System.out.println("Enter count (use 0 to stop): ");
            itemNum = scnr.nextInt();
        }



        if (itemNum == 0) {
            System.out.println(myBag);
            myBag.formatTotalCost();

        }
    }
}