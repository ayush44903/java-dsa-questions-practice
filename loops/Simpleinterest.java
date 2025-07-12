// import java.util.Scanner;

// public class Program {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);


//         System.out.print("Enter the string ");
//         String str = input.nextLine();


//         System.out.print("Enter the integer ");
//         int num = input.nextInt();

//         System.out.println("Good morning  " + str);
//         System.out.println("Integer you entered : " + num);
//     }
// }

package loops;
import java.util.Scanner;

public class Simpleinterest
{

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.println("Enter amount ");
        int P = sn.nextInt();
        System.out.println("Enter time in years ");
        int T = sn.nextInt();
        System.out.println("Enter rate in %");
        int R = sn.nextInt();

        int SI = (P*R*T)/100;
        System.out.println("The total SI "+SI);
    }
}

