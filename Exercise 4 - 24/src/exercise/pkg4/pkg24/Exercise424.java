/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg4.pkg24;

/**
 *
 * @author User
 */
public class Exercise424 {

    public static void main(String[] args) {
        int i,j;
        for(i=0; i<9; i++){
            if (i==0 || i==8) { //for the first and last row, do the next:
                for(j=0; j<9;j++){ //print out a single *
                if (j==4) System.out.print("*"); else System.out.print(" ");} System.out.print("\n"); } else
       
                if (i==1 || i==7) { //for the second and 8th row print *** on the screen
                    for(j=0; j<9;j++){
                     if (j>2 && j<6) System.out.print("*"); else System.out.print(" ");} System.out.print("\n"); } else
                    
                    if (i==2 || i==6) { //for the third and 7th row print ***** on the screen
                    for(j=0; j<9;j++){
                    if (j>1 && j<7) System.out.print("*"); else System.out.print(" ");} System.out.print("\n"); } else
                        
                        if (i==3 || i==5) { //for the 4th and 6th row print ******* on the screen 
                        for(j=0; j<9;j++){
                        if (j>0 && j<8) System.out.print("*"); else System.out.print(" ");} System.out.print("\n"); } else
                            
                            if (i==4) { //for the middle row print *********
                            for(j=0; j<9;j++){
                         System.out.print("*");  } System.out.print("\n");}
                    
                
        
        }
    }
    
}
