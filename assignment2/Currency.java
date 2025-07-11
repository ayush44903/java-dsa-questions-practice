package assignment2;
import java.util.Scanner;
public class Currency {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount in inr: ");
        int amount = input.nextInt();
        double usd = 0.012 * amount;
        System.out.println(usd);
        input.close(); // Close the scanner to avoid resource leak
    }
}