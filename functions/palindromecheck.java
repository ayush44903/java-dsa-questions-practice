package functions;

import java.util.Scanner;

public class palindromecheck {
    public static boolean ispalindrome(int number){
        int original = number;
        int reverse = 0;

        while(number>0){
            int digit = number%10;
            reverse = reverse*10 + digit;
            number = number / 10;
            
        }
        return original == reverse;
    } 

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        if(ispalindrome(number)){
            System.out.println("The given no. is pallindrome");
        }
        else{
            System.out.println("The given no. is not a pallindrome");
        }

    input.close();
    }
    
    
}
