
package exercise.data_types;

import java.util.Scanner;

public class ExerciseData_Types {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        Scanner str=new Scanner(System.in);
        System.out.println("Please choose the exercise you want to do:");
        
        int exercise=scan.nextInt();
        
        while (exercise>=1 && exercise<=6){
            
        switch(exercise){
            
            case 1:
                System.out.println("Exercise 1:");
                System.out.println("Long way or short way? (1 or 2)");
                int var=scan.nextInt();
                switch(var){
                    case 1:
                  
                        System.out.println("What are your initials?");
                        String initials=str.next();
                        System.out.println("Your initials are: "+initials);
                        break;
                        
                    case 2:
                        
                         System.out.println("What is your first initial?");
                        String initial1=str.next();
                        System.out.println("What is your second initial?");
                        String initial2=str.next();
                        System.out.println("What is your third initial?");
                        String initial3=str.next();
                        
                        System.out.println(initial1+". "+initial2+". "+initial3+".");
                        break;
                        
                }
                
            System.out.println("Please choose the exercise you want to do:");
            exercise=scan.nextInt(); break;
                
            case 2:
                
                float price;
                
                System.out.println("We charge $3.25 for a dozen eggs, or 45 cents for individual eggs that are not part of a dozen");
                System.out.println("How many eggs do you want to buy?");
                int numberOfEggs=scan.nextInt();
                
                if(numberOfEggs%12==0){
                int dozen=numberOfEggs/12;
                price=(float) (dozen*3.25);
                    System.out.println("You ordered " +numberOfEggs+" eggs. That’s "+dozen+" dozen at $3.25 per dozen for a total of  "+price);} 
                
                    else {
                    int dozen=numberOfEggs/12;
                    int eggs=numberOfEggs%12;
                    price=(float) (dozen*3.25)+(float)(eggs*0.45);
                    System.out.println("You ordered " +numberOfEggs+" eggs. That’s "+dozen+" dozen at $3.25 per dozen and "+eggs+" loose eggs at 45 cents each for a total of  "+price);
                }
                
                System.out.println("Please choose the exercise you want to do:");
                exercise=scan.nextInt(); break;
        
            case 3:
                
                int adultMeals;
                int  ChildMeal;
                //int totalCollected;
                
                System.out.println("How many adult meals were ordered?");
                adultMeals=scan.nextInt();
                System.out.println("How many child's meals were ordered?");
                ChildMeal=scan.nextInt();
                
                System.out.println("the total money collected for adult meals is "+adultMeals*7+", for children’s meals is "+ ChildMeal*4+", and the total collected for all meals is "+(adultMeals*7+ChildMeal*4));
                
                System.out.println("Please choose the exercise you want to do:");
                exercise=scan.nextInt(); break;
                
            case 4:
                
                System.out.println("Enter the number of money:");
                int numberOfDollars=scan.nextInt();
                int rest=numberOfDollars;
                
                System.out.println("The currency denominations are:");
                while (rest!=0){
                if(rest>=20){
                    System.out.println((rest/20)+" of 20$, ");
                    rest=rest%20;} else
                if(rest>=10){
                    System.out.println((rest/10)+" of 10$, ");
                    rest=rest%10;} else
                if(rest>=5){
                    System.out.println((rest/5)+" of 5$, ");
                    rest=rest%5;} else
                if(rest>=1){
                    System.out.println(rest+" of 1$");
                    break;}
                }
                
                System.out.println("Please choose the exercise you want to do:");
                exercise=scan.nextInt(); break;
                
           case 5:
               
               System.out.println("Please insert the number of minutes:");
               float numberOfMinutes=scan.nextFloat();
               
               System.out.println(numberOfMinutes+" equals to "+(numberOfMinutes/60)+" hours and "+(numberOfMinutes/1440)+" days");
                
                System.out.println("Please choose the exercise you want to do:");
                exercise=scan.nextInt(); break;
                
           case 6:
               
               
               System.out.println("please type an exclamation:");
               String ex=scan.next();
               System.out.println("please type an adverb:");
               String adverb=scan.next();
               System.out.println("please type a noun:");
               String noun=scan.next();
               System.out.println("please type an adjective:");
               String adjective=scan.next();  

               
               System.out.println(ex+"! he said "+adverb+" as he jumped into his convertible "+noun
                       +"  and drove off with his "+adjective+" wife."); 
               
                System.out.println("Please choose the exercise you want to do:");
                exercise=scan.nextInt(); break;

                
            default:
                System.out.println("You inserted a wrong number. Please try again.");
                exercise=scan.nextInt();
        
            }
        }
    }
    
}
