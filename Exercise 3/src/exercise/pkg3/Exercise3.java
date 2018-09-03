
package exercise.pkg3;

import java.util.Scanner;
public class Exercise3 {

 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type an even number (or 999 to stop):");
        int i = sc.nextInt();
        
        while(i!=999)
            {
                if(i%2==0) {System.out.println("Good Job! "+i+" is an even number, please insert the next number, or 999 to exit.");i = sc.nextInt();}
                else {System.out.println(i+" is not an even number, please insert a different number."); i = sc.nextInt();}
            }
    }
    
}
