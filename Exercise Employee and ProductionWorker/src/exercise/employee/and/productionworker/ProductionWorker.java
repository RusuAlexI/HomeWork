package exercise.employee.and.productionworker;

import java.time.LocalDate;
import java.time.Month;

public class ProductionWorker extends Employee {

    private int shift = 1;
    private double hourlyPayRate = 0;

    public ProductionWorker() {
        this(1, 100.0, "John", "111-A", LocalDate.of(2018, Month.JULY, 1));
    }

    public ProductionWorker(int shift, double hourlyPayRate, String employeeName, String employeeNumber, LocalDate hireDate) {
        super(employeeName, employeeNumber, hireDate);
        setShift(shift);
        this.hourlyPayRate = hourlyPayRate;
    }

    public int getShift() {
        if (this.shift == 1) {
            System.out.println("The worker has the day shift");
        } else {
            System.out.println("The worker has the night shift");
        }
        return shift;
    }

    public void setShift(int shift) {
        if (shift == 2 || shift == 1) {
            this.shift = shift;
        }
        throw new IllegalArgumentException("Entered shift is not valid!");
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public String toString() {
        return super.toString() + " ProductionWorker{" + "shift=" + shift + ", hourlyPayRate=" + hourlyPayRate + '}';
    }

}
