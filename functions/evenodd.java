package functions;
import java.util.Scanner;

public class evenodd {
    public static String evenodd(int a){
        if(a%2==0){
            return "Even";
        } else {
            return "Odd";
        }
    } 

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        

        System.out.println("The Number " + num + " is: " + evenodd(num));
        input.close();
    
    }
}
