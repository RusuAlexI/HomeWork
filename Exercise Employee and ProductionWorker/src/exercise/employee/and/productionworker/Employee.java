package exercise.employee.and.productionworker;

import java.time.LocalDate;
import java.time.Month;

public class Employee {

    private String employeeName;
    private String employeeNumber;
    private LocalDate hireDate;

    public Employee() {
        this("John", "111-A", LocalDate.of(2015, Month.JANUARY, 1));
    }

    public Employee(String employeeName, String employeeNumber, LocalDate hireDate) {
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

    public void setEmployeeNumber(String employeeNumber) {
        if (isValidNumber(employeeNumber)) {
            this.employeeNumber = employeeNumber;
        } else {
            throw new IllegalArgumentException("Entered number is not valid!");
        }

    }

    private boolean isValidNumber(String employeeNumber) {
        if (employeeNumber.length() != 5) {
            return false;
        }
        char[] employeeNumberToCharArray = employeeNumber.toCharArray();
        for (int i = 0; i < 3; i++) {
            if (employeeNumberToCharArray[i] < 48 && employeeNumberToCharArray[i] > 57) {
                return false;
            }
        }
        if (employeeNumberToCharArray[3] != '-') {
            return false;
        }
        if (employeeNumberToCharArray[4] < 65 && employeeNumberToCharArray[4] > 77) {
            return false;
        }
        return true;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" + " employeeName=" + employeeName + ", employeeNumber=" + employeeNumber + ", hireDate=" + hireDate + '}';
    }

}
