import java.util.Scanner;

public class factorialusingloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        
        if(num < 0){
            System.out.println("Invalid - Factorial of negative number doesn't exist");
        }
        else {
            long factorial = 1;
            for(int a=1; a<=num; a++){
                factorial = factorial * a;
            }
            System.out.println("The factorial of "+num +" is: "+factorial);
        }
        input.close();
    }
}
