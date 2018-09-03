
package exercise.methods.pkg3;

import java.util.Scanner;
public class ExerciseMethods3 {


    public static void main(String[] args) {
                Scanner scan=new Scanner(System.in);
        
        System.out.println("Type in the number you want to convert from inches to centimeters, and from gallons to liters:");
        int numberToBeConverted = scan.nextInt();
        
        inchesToCentimeters(numberToBeConverted);
        gallonsToLiters(numberToBeConverted);
    }
    
    static void inchesToCentimeters(int i) {
        System.out.println(i+" inches are "+(i*2.54)+" centimeters");
    }
    
    static void gallonsToLiters(int i) {
        System.out.println(i+" gallons are "+(i*3.7854)+" liters");
    }
    
}
