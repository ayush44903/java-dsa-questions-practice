package patterns;

import java.util.Scanner;

public class pattern4 {
    public static void numtriangle(int n){
        for(int row = 1; row <=n; row++){
            for(int col = 1; col<=row; col++){
                System.out.print(col+" ");
            }
            System.out.println(" ");

        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        numtriangle(num);
        input.close();
    }
    
}
