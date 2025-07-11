// using function 

package assignment2;
import java.util.Scanner;

public class FibonnachiSeries {

    public static int fibonacci(int n) {
        if(n==1){
            return 0;
        } 
        else if(n==2){
            return 1;
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        // int a=0;
        // while(a<){
        //     return fibonacci(a);
        // }
        for(int i = 1; i <= a; i++) {
            System.out.print(fibonacci(i) + " ");
        }

    }
}
