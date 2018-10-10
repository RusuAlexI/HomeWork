
package exercise.day.of.week;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class DayOfWeekArrayList {
    
    final private ArrayList<String> dayOfWeekArrayList=new ArrayList<String>(){{
    add("SUNDAY");
    add("MONDAY");
    add("TUESDAY");
    add("WEDNESDAY");
    add("THURSDAY");
    add("FRIDAY");
    add("SATURDAY");}};

    
   
    public DayOfWeekArrayList(){
        
    displayDates();
    }
    
    public void displayDates(){
        Scanner scan=new Scanner(System.in);
    System.out.println("The days are:");
        for(int i=0; i<dayOfWeekArrayList.size();i++){
            System.out.print(dayOfWeekArrayList.get(i)+" ");
        }
        
        
        System.out.println("\nPlease type the day of the week you want to find the work hours for:");
        String dayOfTheWeek=scan.nextLine().toUpperCase();
        
        
        int indexOfTheDay=0;
        
        for(int i=0; i<dayOfWeekArrayList.size();i++){
        if(dayOfWeekArrayList.get(i).equals(dayOfTheWeek/* equals(dayOfTheWeek)*/)){      // .equals(day.toString()))
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
