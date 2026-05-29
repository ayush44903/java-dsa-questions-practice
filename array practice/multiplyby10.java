import java.util.Scanner;

public class multiplyby10 {
    static int[] getmultiple(int[] arr){
        int size = arr.length;
        int[] newarr = new int[size];
        for(int i=0;i<arr.length;i++){
            int element = arr[i];
            int newelement = element*10;
            newarr[i] = newelement;
            

        }
        return newarr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();

        }
        int[] result = getmultiple(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        
    }
}
