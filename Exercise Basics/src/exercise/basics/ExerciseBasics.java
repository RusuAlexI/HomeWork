
package exercise.basics;

import java.util.Scanner;

public class ExerciseBasics {


    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Please choose the exercise you want to do:");
        
        int exercise=scan.nextInt();
        
        while (exercise>=1 && exercise<=4){
            
        switch(exercise){
            
            case 1:
            System.out.println("Movie quote");  System.out.println("Please choose the exercise you want to do:");
        
        exercise=scan.nextInt(); break;
                
            case 2:
                System.out.println("My favorite movie quote, the movie it comes from, the character who said it, and the year of the movie"); 
                System.out.println("Please choose the exercise you want to do:");
                exercise=scan.nextInt(); break;
        
            case 3:
                for(int i=0;i<6;i++){
                    if (i==0 || i==1)
                        System.out.println("*                     *"); else
                    if(i==2)
                        System.out.println("*     ***********     *"); else
                    if(i==3)
                        System.out.println("***** *         * *****"); else
                        System.out.println("*   * *         * *   *");          
                } 
                System.out.println("Please choose the exercise you want to do:");
                exercise=scan.nextInt(); break;
                
            case 4:
                System.out.println("Carly’s makes the food that makes it a party.”");
                System.out.println("Please choose the exercise you want to do:");
                exercise=scan.nextInt(); break;

                
            default:
                System.out.println("You inserted a wrong number. Please try again.");
                exercise=scan.nextInt();
        
            }
        }
            
    }
    
}
