package assignment3;
import java.util.Scanner;

public class subtract {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int product = a*b;
        int sum = a+b;
        int subs = product-sum;

        System.out.println("final ans: "+subs);
        
    }
}
