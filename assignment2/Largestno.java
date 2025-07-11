package assignment2;
import java.util.Scanner;


public class Largestno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        if(a>b){
            System.out.println("The greatest no is: "+a);
        }
        else{
            System.out.println("The greatest no is: "+b);
        }
        
    }
}
