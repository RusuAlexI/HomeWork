
package exercise.methods.pkg2;



import java.util.Scanner;

public class ExerciseMethods2 {


    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Type in the student's name:");
        String studentName = scan.next();
        
        System.out.println("What is the student's grade point average?");
        float studentGrade = scan.nextFloat();
        
        displayCredit(studentName, studentGrade);
        
        
        
    }
    
    static void displayCredit(String name, float i) {
        System.out.println(name+" with the point average "+i+" gets the credit of "+(i*10)+"$");
    }
}
