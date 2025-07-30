package patterns;

import java.util.Scanner;

public class pattern3 {
    public static void invertedtriangle(int n){
        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=n-row+1; col++){
                System.out.print("* ");
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        invertedtriangle(num);
        input.close();
    }
}
