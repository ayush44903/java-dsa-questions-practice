import java.util.Scanner;

public class linearsearch {
    static boolean getelement(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of the array");
        int n = sc.nextInt();
        System.out.println("Enter target");
        int target = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("elements of the array");

    for(int i = 0; i<n;i++){
        
        arr[i] = sc.nextInt();
        
    }

    System.out.println(getelement(arr, target));
    sc.close();
    }
    
}
