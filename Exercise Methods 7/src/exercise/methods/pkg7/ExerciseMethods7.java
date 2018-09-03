
package exercise.methods.pkg7;

import java.util.Scanner;

public class ExerciseMethods7 {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in); 
        
        Date date=new Date();
        
        
        
        System.out.println("Type in the Year:");
        date.Year=scan.nextInt();
        System.out.println("Type in the Month:");
        date.Month=scan.nextInt();
        System.out.println("Type in the Day:");
        date.Day=scan.nextInt();
        
        date.displayDate();
        
    }
    
    
    
}
