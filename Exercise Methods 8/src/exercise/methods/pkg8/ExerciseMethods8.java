
package exercise.methods.pkg8;

//import java.util.Scanner;

public class ExerciseMethods8 {


    public static void main(String[] args) {
        
        //Scanner scan=new Scanner(System.in); 
        
        Employee employee1=new Employee("First","Employee",1000);
        Employee employee2=new Employee("Second","Employee",+2000);
        
        System.out.println("First employee's yearly salary is "+(employee1.getMonthlySalary()*12));
        System.out.println("Second employee's yearly salary is "+(employee2.getMonthlySalary()*12));
        
        System.out.println("Monthly salary after raise:");
        
        employee1.raise(employee1.getMonthlySalary());
        employee2.raise(employee2.getMonthlySalary());
        System.out.println("First employee's yearly salary is "+(employee1.getMonthlySalary()*12));
        System.out.println("Second employee's yearly salary is "+(employee2.getMonthlySalary()*12));
    }
    
}
