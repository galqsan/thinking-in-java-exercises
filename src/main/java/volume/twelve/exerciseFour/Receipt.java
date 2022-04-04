package volume.twelve.exerciseFour;

import java.util.Formatter;

//Exercise 4: Modify Receipt.java so that the widths are all controlled by a single set of
//constant values. The goal is to allow you to easily change a width by changing a single value
//in one place.
public class Receipt {
    private double total = 0;
    public static final int WIDTH_ITEM = 15;
    public static final int WIDTH_QTY = 5;
    public static final int WIDTH_PRICE = 10;
    public static final String TITLE = "%-" + WIDTH_ITEM + "s %" + WIDTH_QTY + "s %" + WIDTH_PRICE + "s\n";
    public static final String ITEMS = "%-" + WIDTH_ITEM + "." + WIDTH_ITEM + "s %" + WIDTH_QTY + "d %" + WIDTH_PRICE + ".2f\n";
    public static final String TOTAL = "%-" + WIDTH_ITEM + "s %" + WIDTH_QTY + "s %" + WIDTH_PRICE + ".2f\n";
    private Formatter formatter = new Formatter(System.out);

    public void printTitle() {
        formatter.format(TITLE, "Item", "Qty", "Price");
        formatter.format(TITLE, "----", "---", "-----");
    }

    public void print(String name, int qty, double price) {
        formatter.format(ITEMS, name, qty, price);
        total += price;
    }

    public void printTotal() {
        formatter.format(TOTAL, "Tax", "", total * 0.06);
        formatter.format(TITLE, "", "", "-----");
        formatter.format(TOTAL, "Total", "", total * 1.06);
    }

    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack’s Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1, 14.29);
        receipt.printTotal();
    }
}