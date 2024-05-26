public class ShoppingBag {
    protected int thingsToBuy;
    protected double priceForEach;
    protected double totalRetailPrice;
    protected double totalCost;

    protected double taxRate;

    protected double taxAmt;

    public ShoppingBag(int itemNum, double costForEachItem, double taxPercent) {
        taxRate = taxPercent;
        thingsToBuy = itemNum;
        priceForEach = costForEachItem;
        totalRetailPrice = thingsToBuy * priceForEach;
    }

    public void place(int itemNum, double costForEachItem) {
        thingsToBuy += itemNum;
        totalRetailPrice += (itemNum * costForEachItem);
    }



    public double getTotalCost() {
        taxAmt = totalRetailPrice * taxRate;
        totalCost = taxAmt + totalRetailPrice;
        return totalCost;
    }



    public int getThingsToBuy() {
        return thingsToBuy;
    }

    public double getTotalRetailPrice() {
        return totalRetailPrice;
    }

    public String toString() {
        return "The bag contains " + getThingsToBuy() +
                " items. The retail cost of the items is $" +
                getTotalRetailPrice() + ". The total cost of the items, " +
                "including tax, " + "is ";

    }
    public void formatTotalCost() {
        System.out.print("$");
        System.out.printf("%.2f", getTotalCost());
        System.out.print(".");
    }



}
