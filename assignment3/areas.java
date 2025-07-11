package assignment3;
import java.util.Scanner;

public class areas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        int n = input.nextInt();
        double a = 3.14*n*n;

        System.out.println("Area of circle: "+a);
    }
    
}



