package functions;
import java.util.Scanner;

public class voteeligibility {
    public static String age_check(int a){
        if(a<18){
            return "Not eligible to vote";
        }
        else{
            return"Eligible to vote";
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.print("Enter your age: ");
        int age = input.nextInt();

        System.out.println(age_check(age));
        input.close();


    
    }

    
}
