
package exercise.employee.productworker.shiftsupervisor;

import java.util.Arrays;
public class Employee {
    
    final private char[] allowedDigits={'0','1','2','3','4','5','6','7','8','9'};
    final private char[] allowedLetters={'A','B','C','D','E','F','G','H','I','J','K','L','M'};
    private String employeeName="default";
    private String employeeNumber="";
    private String hireDate="0.0.0";

    public Employee(String employeeName, String employeeNumber, String hireDate) {
        this.employeeName = employeeName;
        setEmployeeNumber(employeeNumber);
        this.hireDate = hireDate;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public boolean setEmployeeNumber(String employeeNumber) {
        if(employeeNumber.length()!=5) return false;
        int controller=0;
        char[] employeeNumberToCharArray = employeeNumber.toCharArray();
        
        for(int i=0;i<3;i++){
            for(int j=0;j<allowedDigits.length;j++){
        if(employeeNumberToCharArray[i]==allowedDigits[j]) controller++;}
        }
        if(employeeNumberToCharArray[3]=='-') {controller++;}
        for(int i=0;i<allowedLetters.length;i++){
        if(employeeNumberToCharArray[4]==allowedLetters[i]) {controller++;}
        }
        System.out.println(controller);
        if(controller==5){this.employeeNumber=employeeNumber; return true;} else 
        {System.out.println("The number entered is invalid");return false;}
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" + " employeeName=" + employeeName + ", employeeNumber=" + employeeNumber + ", hireDate=" + hireDate + '}';
    }
    
}
