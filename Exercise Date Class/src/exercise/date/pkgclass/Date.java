
package exercise.date.pkgclass;

import java.util.Calendar; 

public class Date {
    private Calendar calendar=null;
     private String[] monthsInTheYear = {"January", "February", "March", "April", "May", 
         "June", "July", "August", "September", "October", "November", "December"};
    private int[] daysInEachMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date(int month, int day, int year){
    firstFormat(month,day,year);
    secondFormat(monthsInTheYear[month], day, year);
    thirdFormat(month, day, year);
    
    }
    
    public Date(String month, int day, int year){
    firstFormat(getMonth(month), day, year);
    secondFormat(month,day,year);
    thirdFormat(getMonth(month), day, year);
    }
    
    public Date(int day, int year){
    firstFormat(getMonth(day), getDay(day), year);
        
    thirdFormat(day,year);
    }
    
    private int getDay(int day){
        for(int i=0;i<this.monthsInTheYear.length;i++){
        if(day>daysInEachMonth[i]) day-=daysInEachMonth[i]; else return day;
        }
        return 0;
    }
    
    
    
    private int getMonth(String month){
        for(int i=0;i<this.monthsInTheYear.length;i++){
        if(monthsInTheYear[i].equals(month)) return i+1;
        }
        return 0;
    }
    
    private int getMonth(int month){
        for(int i=0;i<this.monthsInTheYear.length;i++){
        if(month>daysInEachMonth[i]) month-=daysInEachMonth[i]; else return i;
        }
        return 0;
    }
    
    private void firstFormat(int month, int day, int year){
        System.out.println("The date is: "+month+"/"+day+"/"+year);
    }
    
    private void secondFormat(String month, int day, int year){
        System.out.println("The date is: "+month+" "+day+", "+year);
    }
    
    private void thirdFormat(int day, int year){
        for(int i=0; i<this.monthsInTheYear.length;i++){
        if(day>this.daysInEachMonth[i]) {day-=this.daysInEachMonth[i];}
        }
        System.out.println("The date is: "+day+", "+year);

    }
    
    private void thirdFormat( int month,int day, int year){
        int dayTotal=0;
        for(int i=0; i<month;i++){
        dayTotal+=this.daysInEachMonth[i];
        }
        dayTotal+=day;
        System.out.println("The date is: "+dayTotal+", "+year);

    }
}
