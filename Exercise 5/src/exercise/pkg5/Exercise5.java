
package exercise.pkg5;
import java.util.Scanner;


public class Exercise5 {

  
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        System.out.println("Please type in the first number:");
       int number1=scan.nextInt();
        System.out.println("Please type in the second number:");
       int number2=scan.nextInt();
       
        System.out.println("The numbers in between are:");
        
       if(number1<number2){
        for(int i=number1+1;i<number2;i++){
            System.out.print(i+" ");}} 
        else if(number1>number2){
       for(int i=number2+1;i<number1;i++){
            System.out.print(i+" ");}
       } else
        System.out.println("the numbers are equal");
    }
    
}
