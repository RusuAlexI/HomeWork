
package exercise.day.of.week;
import java.util.Scanner;

public class DayOfWeekEnum {
    
    private enum DayOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
} 
    

    public DayOfWeekEnum(){
    displayDates();
    }
    
    public void displayDates(){
    System.out.println("The days are:");
        for(DayOfWeek days:DayOfWeek.values()){
            System.out.print(days+" ");
        }
        Scanner scan=new Scanner(System.in);
        
        System.out.println("\nPlease type the day of the week you want to find the work hours for:");
        String dayOfTheWeek=scan.nextLine().toUpperCase();
        
        
        int indexOfTheDay=0;
        
        for(DayOfWeek day:DayOfWeek.values()){
        if(dayOfTheWeek.equals(day.toString()))
            indexOfTheDay=day.ordinal();
        }
        
        if(indexOfTheDay>=1 && indexOfTheDay<6) {
            System.out.println("The working hours are 9 am to 9 pm");
        } else if(indexOfTheDay==6) {
            System.out.println("The working hours are 10 am to 6 pm");
        }  else if(indexOfTheDay==0) {
            System.out.println("The working hours are 11 am to 5 pm");
        }     
    }
    
  
}
