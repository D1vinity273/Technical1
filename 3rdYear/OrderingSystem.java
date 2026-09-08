import java.util.Scanner;

public class OrderingSystem {

    public static void main(String[] args) {
        // Create a Scanner object for user input.
        Scanner input = new Scanner(System.in);

        // Declare variables for order and payment details.
        String item;
        int quantity;
        double price;
        double total;
        double cash;
        double change;

        // Get the item name from the user.
        System.out.print("Enter item: ");
        item = input.nextLine();

        // Get the quantity of the item.
        System.out.print("Enter quantity: ");
        quantity = input.nextInt();

        // Get the price of the item.
        System.out.print("Enter price: ");
        price = input.nextDouble();

        // Validate the quantity and price.
        if (quantity <= 0 || price <= 0) {
            System.out.println("Invalid quantity or price.");
            input.close();
            return;
        }

        // Calculate the total cost of the order.
        total = quantity * price;

        // Get the customer's cash payment.
        System.out.print("Enter cash payment: ");
        cash = input.nextDouble();

        // Check if the payment is sufficient.
        if (cash < total) {
            System.out.println("Insufficient cash payment.");
            input.close();
            return;
        }

        // Calculate the customer's change.
        change = cash - total;

        // Display the order and payment details.
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Total Payment: " + total);
        System.out.println("Change: " + change);

        // Close the Scanner after receiving all input.
        input.close();
    }
}

