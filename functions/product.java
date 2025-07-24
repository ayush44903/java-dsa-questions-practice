package functions;

import java.util.Scanner;

public class product {
    public static int product(int a, int b){
        return a*b;

    }

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter first digit: ");
       int num1= input.nextInt();
       System.out.print("Enter Second digit: ");
       int num2= input.nextInt();
       
       int product = product(num1, num2);
       System.out.println("The product of numbers is: "+product);
       input.close();
    }
    
}
