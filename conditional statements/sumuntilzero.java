import java.util.Scanner;
public class sumuntilzero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int sum =0;
        while(true){
            num = input.nextInt();
            if(num==0){
                break;                
            }
            sum=sum +num;           
        }
        System.out.println("The Sum of numbers is: "+sum);
        input.close();
        
    }
}
