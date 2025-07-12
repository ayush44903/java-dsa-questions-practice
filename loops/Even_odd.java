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
    }
    
}

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input number
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//         // Check if the number is even or odd
//         if (num % 2 == 0) {
//             System.out.println(num + " is Even.");
//         } else {
//             System.out.println(num + " is Odd.");
//         }
//     }
// }






