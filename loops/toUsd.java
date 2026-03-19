import java.util.Scanner;

public class toUsd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter amount in INR: ");
		double inr = input.nextDouble();
		double usd = inr / 83.0;
		System.out.println("Amount in USD: " + usd);
		input.close();
	}
}
