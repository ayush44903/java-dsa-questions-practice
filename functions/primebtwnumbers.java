package functions;

import java.util.Scanner;

public class primebtwnumbers {
    public static String isprime(int n){
        if(n<=1){
            return "Not prime";
        }
        if(n==2){
            return "Prime";
        }
        for(int num=2;num<=Math.sqrt(n);num++){
            if(n%num==0){
                return "Not Prime";
            }
        }
        return "Is Prime";
    }

    public static void betwnnum(int a, int b){
        System.out.println("Prime numbers between " + a + " and " + b + ":");
        for(int c = a; c <= b; c++){
            if(isprime(c).equals("Is Prime")){
                System.out.print(c + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int start = input.nextInt();
        System.out.print("Enter second number: ");
        int end = input.nextInt();
        
        betwnnum(start, end);
        input.close();
    }
    
}


