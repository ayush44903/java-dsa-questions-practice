package functions;

import java.util.Scanner;

public class naturalnumsum {
    public static int sumnum(int a){
        int result = 0;
        for(int num =1;num<=a;num++){
            result +=num;
        } 
        return result;
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(sumnum(num));
        input.close();
    }
    
}
