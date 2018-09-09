
package exercise.methods.pkg8;

public class Employee {
    
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }
    
    public Employee() {
        this("Test","Default",0);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return this.monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary<0) this.monthlySalary=0; else
        this.monthlySalary = monthlySalary;
    }
    
     public double raise(double monthlySalary) {
        
        this.monthlySalary = 1.10*monthlySalary;
        return monthlySalary;
    }
    
    
}
