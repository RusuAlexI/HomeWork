
package exercise.employee.productworker.shiftsupervisor;


public class ProductWorker extends Employee{
    private int shift=1;
    private double hourlyPayRate=0;

    public ProductWorker(int shift, double hourlyPayRate, String employeeName, String employeeNumber, String hireDate) {
        super(employeeName, employeeNumber, hireDate);
        this.shift = shift;
        this.hourlyPayRate = hourlyPayRate;
    }

    public int getShift() {
        if(this.shift==1) System.out.println("The worker has the day shift"); else
            System.out.println("The worker has the night shift");
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public String toString() {
        return super.toString()+" ProductionWorker{" + "shift=" + shift + ", hourlyPayRate=" + hourlyPayRate + '}';
    }

    
}
