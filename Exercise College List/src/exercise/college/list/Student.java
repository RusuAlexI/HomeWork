
package exercise.college.list;
import java.util.Scanner;

public class Student extends Person{
    
    Scanner scan=new Scanner(System.in);
    private String majorFieldOfStudy;
    private double gradePointAverage;

    @Override
    public void displayInformation() {
        super.displayInformation(); 
        System.out.println(", major Field Of Study: " + this.majorFieldOfStudy+
                ", grade Point Average: " + this.gradePointAverage);
    }

    @Override
    public void setData() {
        super.setData(); 
        System.out.println("What is the student's major Field Of Study? ");
        this.majorFieldOfStudy=scan.nextLine();
        System.out.println("What is the student's grade Point Average? ");
        this.gradePointAverage=scan.nextDouble();
    }
    
    
}
