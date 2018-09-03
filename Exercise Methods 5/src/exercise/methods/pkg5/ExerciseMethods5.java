
package exercise.methods.pkg5;

import java.util.Scanner;

public class ExerciseMethods5 {


    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        
        /*Student student=new Student();
        
        System.out.println(student.getIdNumber()+"  "+ student.getPointsEarned()+"  "+student.getCreditHours());
        System.out.println(student.gradePointAverage(student.pointsEarned, student.creditHours));*/
        
        Student student=new Student(12,3,61);
        
        /*System.out.println(student.getIdNumber()+"  "+ student.getPointsEarned()+"  "+student.getCreditHours());
        System.out.println(student.gradePointAverage(student.pointsEarned, student.creditHours));*/
        
        displayIDNumber(student.getIdNumber());
        displayCredit(student.getCreditHours());
        displayPointsEarned(student.pointsEarned);
        displayGradePointAverage(student.gradePointAverage(student.pointsEarned, student.creditHours));
        
    }
    
    static void displayIDNumber(int id) {
        System.out.println("The student ID number is "+id);
    }
    
    static void displayCredit(int credit) {
        System.out.println("The student credit is "+credit);
    }
    
    static void displayPointsEarned(int pointsEarned) {
        System.out.println("The student earned "+pointsEarned+" points");
    }
    
    static void displayGradePointAverage(float grade) {
        System.out.println("The student's grade point average is "+grade);
    }
    
}
