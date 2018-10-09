
package exercise.birthday.reminder;

import java.util.Scanner;
public class ExerciseBirthdayReminder {


    public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
       String[] arrayOfNames=new String[10];
       String[] arrayOfBirthdays=new String[10];
       int counterOfNames=0,counterOfFoundNames=0;
       String nameToBeChecked=null;
       
       
           for(int i=0;i<arrayOfNames.length;i++){
               System.out.println("Please type in the "+(i+1)+" person name:");
               arrayOfNames[i]=scan.nextLine();
               if("ZZZ".equals(arrayOfNames[i])) break;
               System.out.println("Please type in the "+i+" person birthday:");
               arrayOfBirthdays[i]=scan.nextLine();
               counterOfNames++;
           }
           
           System.out.println(counterOfNames+" names were entered.");
           /*for(int i=0;i<arrayOfNames.length;i++){
               System.out.println(arrayOfNames[i]+" "+arrayOfBirthdays[i]);
           }*/
           
           
           System.out.println("Please enter a name to be checked:");
               nameToBeChecked=scan.nextLine();
           
           while(!"ZZZ".equals(nameToBeChecked)) {
               counterOfFoundNames=0;
           for(int i=0;i<arrayOfNames.length;i++){
            if(nameToBeChecked.equals(arrayOfNames[i])) {System.out.println("Name:"+arrayOfNames[i]+
                    ", birthday: "+arrayOfBirthdays[i]); counterOfFoundNames++;}
           }
                if(counterOfFoundNames==0) System.out.println("The name was not found.");
                
               System.out.println("Please enter another name to be checked:");
               nameToBeChecked=scan.nextLine();
           }
           
           
       
       
           
    }
    
}
