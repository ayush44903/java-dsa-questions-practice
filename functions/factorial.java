package functions;

import java.util.Scanner;

public class factorial {
    public static int fact(int a){
        if(a == 0 || a == 1){
            return 1;
        }
        else{
            int result = 1;
            for(int b = 2; b <= a; b++){
                result = result * b; 
            }
            return result;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(fact(num));
        input.close();
    }
    
}
