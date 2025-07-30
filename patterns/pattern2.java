package patterns;
import java.util.Scanner;

public class pattern2 {
    public static void triangle(int n){
        for(int row = 1; row <=n; row++){
            for(int col = 1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        triangle(num);
        input.close();

    }
}
