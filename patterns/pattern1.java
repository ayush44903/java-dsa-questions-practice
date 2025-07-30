package patterns;

import java.util.Scanner;

public class pattern1 {
    public static void square(int n){
        for(int row = 1;row <=n; row++){
            for(int col = 1 ; col<=n; col++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        square(n);
       input.close();
    }
    
}
