
package exercise.employee.and.productionworker;

import java.time.LocalDate;
import java.time.Month;


public class ExerciseEmployeeAndProductionWorker {


    public static void main(String[] args) {
        Employee firstEmployee=new Employee("Bob", "777-A", LocalDate.of(2000, Month.MARCH, 12));
        Employee secondEmployee=new ProductionWorker(1, 3000, "firstEmployeeName", "548-D", LocalDate.of(1980, Month.JULY, 11));
        ProductionWorker firstProductionWorker=new ProductionWorker(0, 8000, "secondEmployeeName", "912-F", LocalDate.now());
        System.out.println(firstEmployee.toString());
        System.out.println(secondEmployee.toString());
        System.out.println(firstProductionWorker.toString());
        
    }
    
}
