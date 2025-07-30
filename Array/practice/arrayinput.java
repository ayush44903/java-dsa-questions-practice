package Array.practice;

import java.util.Scanner;
import java.util.Arrays;

public class arrayinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");
        for(int i=0;i<arr.length;i++){
            arr[i] = input.nextInt();
        }
        
        System.out.println("Array: " + Arrays.toString(arr));
        input.close();
    }
    


    
}
