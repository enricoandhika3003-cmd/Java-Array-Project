import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product[] = { "Guitars", "Pianos", "Keyboards", "Trumpets", "Saxophones", "Drums", "Banjos", "Maracas",
                "Flutes", "Xylophones" };
        double price[] = { 750.55, 1400.15, 600.95, 550.95, 700.15, 1200.99, 500, 70.55, 325.45, 175.55 };
        int bought[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        boolean keep_shopping = true;
        double total = 0;
        double discount = 1;
        System.out.println("Greetings!");
        System.out.println("Which of our products would you be interested in purchasing today?");
        while (keep_shopping == true) {
            System.out.println("<----- Products ----->");
            for (int i = 0; i <= 9; i++) {
                System.out.println(i + ". " + product[i] + " -->  $" + price[i]);
            }
            System.out.println("<--------------->");
            System.out.println("Please enter the ID number of the product you would like to purchase: ");
            int num = scan.nextInt();
            System.out.println("Product ID number [ " + num + " ] has been entered.");
            System.out.println("<----- Product Amount ----->");
            System.out.println("How many " + product[num] + " would you like to purchase?");
            int amount = scan.nextInt();
            bought[num] += amount;
            if (amount == -1) {
                discount = 0.9;
            }
            System.out.println("<--------------->");
            System.out.println("Would you like to keep shopping? (yes/no)");
            String answer = scan.next();
            if (answer.equals("no")) {
                keep_shopping = false;
            }
        }
        System.out.println("<----- Receipt ----->");
        System.out.println("Product          Price          Amount of Product          Total");
        for (int i = 0; i <= 9; i++) {
            if (bought[i] > 0) {
                System.out.println(
                        product[i] + "          " + price[i] + "              x " + bought[i] + "                   $"
                                + (price[i] * bought[i] * discount));
                total += (price[i] * bought[i] * discount);
            }
        }
        if (discount == 0.9) {
            System.out.println("Total                                                      $" + total * discount
                    + " (10% Discount Applied)");
        } else {
            System.out.println("Total                                                      $" + total * discount);
        }
        scan.close();
    }
}
