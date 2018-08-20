/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg4.pkg29;

public class Exercise429 {

    public static void main(String[] args) {
        int i,j;
        for(i=1;i<13;i++){ //count goes from 1 to 12, the number representing each day
            
            
            switch(i){ //in case of _number_ print the verse with the same number day
                case 1: System.out.print("\nOn the First day of Christmas my true love sent to me\n"); break;
                case 2: System.out.print("\nOn the Second day of Christmas my true love sent to me\n"); break;
                case 3: System.out.print("\nOn the Third day of Christmas my true love sent to me\n"); break;
                case 4: System.out.print("\nOn the Fourth day of Christmas my true love sent to me\n"); break;
                case 5: System.out.print("\nOn the Fifth day of Christmas my true love sent to me\n"); break;
                case 6: System.out.print("\nOn the Sixth day of Christmas my true love sent to me\n"); break;
                case 7: System.out.print("\nOn the Seventh day of Christmas my true love sent to me\n"); break;
                case 8: System.out.print("\nOn the Eight day of Christmas my true love sent to me\n"); break;
                case 9: System.out.print("\nOn the Ninth day of Christmas my true love sent to me\n"); break;
                case 10: System.out.print("\nOn the Tenth day of Christmas my true love sent to me\n"); break;
                case 11: System.out.print("\nOn the Eleventh day of Christmas my true love sent to me\n"); break;
                case 12: System.out.print("\nOn the Twelfth day of Christmas my true love sent to me\n"); break;
            
            }
            
            for(j=i;j>0;j--){
            switch(j){ //after that, start the count with the number of the day (i) from the first "for" statement, and go backwards(thanks to j--) to print each verse till we reach the first one
                case 1: System.out.print(" a Partridge in a Pear Tree\n"); break;
                case 2: System.out.print("2 Turtle Doves, \nAnd"); break;
                case 3: System.out.print("3 French Hens,\n"); break;
                case 4: System.out.print("4 Calling Birds,\n"); break;
                case 5: System.out.print("5 Gold Rings,\n"); break;
                case 6: System.out.print("6 Geese a-Laying,\n"); break;
                case 7: System.out.print("7 Swans a-Swimming,\n"); break;
                case 8: System.out.print("8 Maids a-Milking,\n"); break;
                case 9: System.out.print("9 Ladies Dancing,\n"); break;
                case 10: System.out.print("10 Lords a-Leaping,\n"); break;
                case 11: System.out.print("11 Pipers Piping,\n"); break;
                case 12: System.out.print("12 Drummers Drumming,\n"); break;
            }
        }
        }
        
    }
    
}
