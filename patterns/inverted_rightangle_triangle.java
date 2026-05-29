import java.util.Scanner;

public class inverted_rightangle_triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n-row+1; col++){
                System.out.print("* ");
            }System.out.println(" ");
        }System.out.println();
    }
    
}
