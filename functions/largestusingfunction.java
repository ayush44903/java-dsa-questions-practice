package functions;
import java.util.Scanner;

public class largestusingfunction {
    public static int largest(int first, int second, int third){
        int max =  first;
        if(first <second){
            max = second;
        }
        else if(third>second){
            max = third;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();
        int max = largest(first, second, third);
        System.out.println("The largest number among these is: "+max);
        input.close();
    }
}
