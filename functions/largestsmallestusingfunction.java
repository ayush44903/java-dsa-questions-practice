package functions;
import java.util.Scanner;

public class largestsmallestusingfunction {
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

    public static int smallest (int first, int second , int third ){
        int min = first;
        if(first>second){
            min = second;
        }
        if(second>third){
            min = third;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();
        int max = largest(first, second, third);
        int min = smallest(first, second, third);
        System.out.println("The largest number among these is: "+max);
        System.out.println("The minimum number among these is: "+min);
        input.close();
    }
}
