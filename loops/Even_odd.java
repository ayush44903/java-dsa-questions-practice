package loops;

import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if(num %2==0){
            System.out.println("is Even");

        }
        else{
            System.out.println("is odd");
        }
        input.close();
    }
    
}








