package functions;

import java.util.Scanner;

public class circle {
    public static int area(int radius){
        return radius*radius;
    }
    public static double circumference(int radius){
        return 2*3.14*radius;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        int radius = input.nextInt();
        System.out.println("The area of the circle:"+area(radius));
        System.out.println("The circumference of the circle: "+circumference(radius));
        input.close();
    }
    
}
