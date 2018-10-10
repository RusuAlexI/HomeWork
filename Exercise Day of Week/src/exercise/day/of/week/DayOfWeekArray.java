
package exercise.day.of.week;

import java.util.Scanner;

public class DayOfWeekArray {
    final private String[] daysOfTheWeek={"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
    
    public DayOfWeekArray(){
    displayDates();
    }
    
    public void displayDates(){
        Scanner scan=new Scanner(System.in);
    System.out.println("The days are:");
        for(int i=0; i<daysOfTheWeek.length;i++){
            System.out.print(daysOfTheWeek[i]+" ");
        }
        
        
        System.out.println("\nPlease type the day of the week you want to find the work hours for:");
        String dayOfTheWeekToBeSearched=scan.nextLine().toUpperCase();
        
        
        int indexOfTheDay=0;
        
        for(int i=0; i<daysOfTheWeek.length;i++){
        if(daysOfTheWeek[i].equals(dayOfTheWeekToBeSearched)){      // .equals(day.toString()))
            indexOfTheDay=i;}
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
