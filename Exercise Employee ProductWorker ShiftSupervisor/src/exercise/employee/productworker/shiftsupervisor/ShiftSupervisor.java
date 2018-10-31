
package exercise.employee.productworker.shiftsupervisor;


public class ShiftSupervisor extends Employee{
  private double annualSalary;
  private double annualProductionBonus;

    public ShiftSupervisor(double annualSalary, double annualProductionBonus, String employeeName, String employeeNumber, String hireDate) {
        super(employeeName, employeeNumber, hireDate);
        this.annualSalary = annualSalary;
        this.annualProductionBonus = annualProductionBonus;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getAnnualProductionBonus() {
        return annualProductionBonus;
    }

    public void setAnnualProductionBonus(double annualProductionBonus) {
        this.annualProductionBonus = annualProductionBonus;
    }

    @Override
    public String toString() {
        return super.toString()+"ShiftSupervisor{" + "annualSalary=" + annualSalary + ", annualProductionBonus=" + annualProductionBonus + '}';
    }
  
  
  
  
    
}
