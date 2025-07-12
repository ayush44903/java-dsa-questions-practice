import java.util.Scanner;

public class largestuntilzero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int largest=0;

        while(true){
            number = input.nextInt();

            if (number==0){
                break;
            }
            if(number>=largest){
                largest= number;
            }
        }
        System.out.println("The largest no is: "+largest);
        input.close();
    }
    
}
