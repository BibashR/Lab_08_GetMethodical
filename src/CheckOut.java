import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double totalCost = 0.0;
        boolean moreItems;

        System.out.println("Welcome to the $10 Store!");

        do {
            double price = SafeInput.getRangedDouble(in, "Enter the price of your item", 0.50, 10.00);
            totalCost += price;

            moreItems = SafeInput.getYNConfirm(in, "Do you have another item to scan?");
        } while (moreItems);

        System.out.printf("\nTotal cost of items: $%.2f\n", totalCost);

        in.close();
    }
}
