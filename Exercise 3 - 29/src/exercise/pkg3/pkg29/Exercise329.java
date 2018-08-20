/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg3.pkg29;
import java.util.Scanner;

public class Exercise329 {

    public static void main(String[] args) {
       int i,j,k,a;
       Scanner scan = new Scanner(System.in);
       System.out.println("Input the size of te square between 1 and 20:");
       a=scan.nextInt();//a-number of rows
       if(a<=20 && a>0){ //we check if we entered a number that is in the 1 to 20 range
        for(i=0; i<a;i++){
           if(i==0 || i==a-1){ //for first and last row:
           for(k=0;k<a;k++){
           System.out.print("*"); //we print a full row of *
           }  System.out.print("\n");} else //after we finish printing, we go to a new line 
            if(i>0 && i<a-1){ //for the second till second to last row:
              for(j=0; j<a; j++){
               if(j==0 || j==a-1) {System.out.print("*");} else //for the first and last column we print one *
                   System.out.print(" "); //for the rest we print an empty space
                } System.out.print("\n"); //after each finished line we go to the next line
            
            }
       }
       } else 
           System.out.print("You entered an invalid number");       
        
    }
    
}
