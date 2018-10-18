
package exercise.college.list;

import java.util.Scanner;
public class CollegeEmployee extends Person{
    Scanner scan=new Scanner(System.in);
    private int socialSecurityNumber;
    private int annualSalary;
    private String departmentName;

    public CollegeEmployee() {
    }
    
    
    
    @Override
    public void setData(){
        super.setData();
        System.out.println("Please type the social Security Number:");
        this.socialSecurityNumber=scan.nextInt();
        System.out.println("Please type the annualSalary:");
        this.annualSalary=scan.nextInt();
        System.out.println("Please type the department Name:");
        this.departmentName=scan.nextLine();
    }
    
    @Override
    public void displayInformation(){
        super.displayInformation();
        System.out.println("social Security Number: " + this.socialSecurityNumber +
                ", annual Salary: " + this.annualSalary +
                ", department Name: " + this.departmentName);
    }
    
    
}
