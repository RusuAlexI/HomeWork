
package exercise.employee.productworker.shiftsupervisor;


public class ExerciseEmployeeProductWorkerShiftSupervisor {


    public static void main(String[] args) {
        Employee firstEmployee=new Employee("firstEmployeeName", "512-C", "01.01.2010");
        Employee secondEmployee=new ProductWorker(1, 3000, "secondEmployeeName", "482-A", "08.10.2000");
        ProductWorker firstProductionWorker=new ProductWorker(0, 8000, "secondProductWorkerName", "917-C", "10.10.2010");
        System.out.println(firstEmployee.toString());
        System.out.println(secondEmployee.toString());
        System.out.println(firstProductionWorker.toString());
        ShiftSupervisor firstShiftSupervisor=new ShiftSupervisor(20000, 1000, "firstShiftSupervisor", "975-D", "01.11.2011");
        System.out.println(firstShiftSupervisor.toString());
    }
    
}
