package functions;

import java.util.Scanner;

public class primeornot {
    public static String isprime(int n){
        if(n <= 1){
            return "Not prime";
        }
        if(n == 2){
            return "IS prime";
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return "Not prime";
            }
        }
        return "IS prime";
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num=input.nextInt();

        System.out.println("The number "+num+" is: "+isprime(num));
        input.close();
    }
    
}
