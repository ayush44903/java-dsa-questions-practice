import java.util.Scanner;

public class arrayaverage {
    static double getAverage(int[] arr){
        int sum = 0;
        for(int i =0; i< arr.length; i++){
            sum += arr[i];
        }
        int size = arr.length;
        double result = (double) sum / size;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(getAverage(arr));
    }

        
}
    
