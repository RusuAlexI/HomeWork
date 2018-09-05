
package exercise.methods.pkg5;

import java.util.Scanner;

public class ExerciseMethods5 {


    public static void main(String[] args) {
        
        //Scanner scan=new Scanner(System.in);
        
        Student student=new Student();
        
        student=new Student(12,3,61);
        
        /*System.out.println(student.getIdNumber()+"  "+ student.getPointsEarned()+"  "+student.getCreditHours());
        System.out.println(student.gradePointAverage(student.pointsEarned, student.creditHours));*/
        
        System.out.println(student.toString());
        
    }
   
    
}
