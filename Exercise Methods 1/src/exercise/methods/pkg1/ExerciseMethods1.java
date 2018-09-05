/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.methods.pkg1;

public class ExerciseMethods1 {


    public static void main(String[] args) {
        int firstVariable=7;
        int secondVariable=25;
        
        System.out.println("Display twice the numbers:");
        displayTwiceTheNumber(firstVariable);
        displayTwiceTheNumber(secondVariable);
        System.out.println("Display number + 5:");
        displayNumberPlusFive(firstVariable);
        displayNumberPlusFive(secondVariable);
        System.out.println("Display number squared:");
        displayNumberSquared(firstVariable);
        displayNumberSquared(secondVariable);
        
    }
    
    static void displayTwiceTheNumber(int i) {
        System.out.println(i+" "+i);
        
    }
    
    static void displayNumberPlusFive(int i) {
        System.out.println(i+"+5 is "+(i+5));
    }
    
    static void displayNumberSquared(int i) {
        System.out.println(i+" squared is "+(i*i));
    }
    
}
