
package exercise.flow_control;

import java.util.Scanner;
import java.util.Random;

public class ExerciseFlow_Control {

    public static void main(String[] args) {
      
      Scanner scan=new Scanner(System.in);
      
        System.out.println("Please choose the Exercise you want to do:");
        
        int exercise=scan.nextInt();
        int i,j;
        
         while (exercise>=1 && exercise<=9){
             
          switch(exercise){
          
          case 1:
              
              System.out.println("Please enter the integer you want to check:");
                int integer=scan.nextInt();
                
                if(integer%2==0) System.out.println(integer+" is even");
                else System.out.println(integer+" is odd");
              
              System.out.println("Please choose the exercise you want to do:");
                exercise=scan.nextInt(); break;
          
          case 2:
              
              /*int firstNumber,secondNumber,thirdNumber;
              
              System.out.println("Please type the first number:");
              firstNumber=scan.nextInt();
              System.out.println("Please type the first number:");
              secondNumber=scan.nextInt();
              System.out.println("Please type the first number:");
              thirdNumber=scan.nextInt();
              
              if(firstNumber>secondNumber && firstNumber>secondNumber)*/
              //Showing the array:
              System.out.println("Please type the size of the array:");
              int n=scan.nextInt();
              
              int[] integers=new int[n];
              int[] integersAscending;
              int temp;
              
              //Declaring the array:
              
              for(i=0;i<n; i++){
                  System.out.println("Please insert the "+(i+1)+" number:");
                  integers[i]=scan.nextInt();
              }
              
              for(i=0;i<n; i++){
                  System.out.print(integers[i]+" ");
              } System.out.println("\n");
              
              integersAscending=integers;
              
                for(i=0; i<n-1; i++){
                  for(j=i+1;j<n;j++){
                  if (integersAscending[i]>integersAscending[j]){
                        temp = integersAscending[i];
                        integersAscending[i] = integersAscending[j];
			integersAscending[j] = temp;}
                  }
              }
              
              
              System.out.println("Ascending order:");
              for(i=0;i<n; i++){
                  System.out.print(integersAscending[i]+" ");
              } System.out.print("\n");
              
              
              System.out.println("Descending order:");
              for(i=n-1;i>=0; i--){
                  System.out.print(integersAscending[i]+" ");
              } System.out.print("\n");
              
              System.out.println("Please choose the exercise you want to do:");
                exercise=scan.nextInt(); break;
          
          case 3:
              
                System.out.println("Please enter the maximum monthly values for talk minutes used:");
                int maximumMinutesUsed=scan.nextInt();
                System.out.println("Please enter the maximum monthly values for text messages sent:");
                int maximumMessagesSent=scan.nextInt();
                System.out.println("maximum monthly values for gigabytes of data used:");
                int maximumGigabytesUsed=scan.nextInt();
                
                if(maximumMinutesUsed<500 && maximumMessagesSent==0 && maximumGigabytesUsed==0) 
                    System.out.println("You should accept Plan A of 49$ per month"); else
                if(maximumMinutesUsed<500)
                    System.out.println("You should accept Plan B of 55$ per month"); else
                if(maximumMinutesUsed>=500 && maximumGigabytesUsed==0 && maximumMessagesSent<100)
                    System.out.println("You should accept Plan C of 61$ per month"); else
                if(maximumMinutesUsed>=500 && maximumGigabytesUsed==0 && maximumMessagesSent>=100)
                    System.out.println("You should accept Plan D of 70$ per month"); 
                else System.out.println("You should accept Plan E for up to 2 gigabytes at $79 or Plan F for 2 gigabytes or more at $87"); 
              
              
              System.out.println("Please choose the exercise you want to do:");
                exercise=scan.nextInt(); break;
          
          case 4:
              
             Random rand = new Random();
              
             int[] arrayRandom=new int[3];
             arrayRandom[0]=rand.nextInt(9);
             arrayRandom[1]=rand.nextInt(9);
             arrayRandom[2]=rand.nextInt(9);
             
             int[] arrayGuesses=new int[3];
                            
              System.out.println("Please type your first guess:");
              arrayGuesses[0]=scan.nextInt();
              System.out.println("Please type your second guess:");
              arrayGuesses[1]=scan.nextInt();
              System.out.println("Please type your third guess:");
              arrayGuesses[2]=scan.nextInt();
              
              System.out.println("The guessed numbers are "+arrayGuesses[0]+", "+arrayGuesses[1]+" and "+arrayGuesses[2]);
              
              System.out.println("The random numbers are "+arrayRandom[0]+", "+arrayRandom[1]+" and "+arrayRandom[2]);
              
              int match1=0;
              int match2=0;
              
              for(i=0;i<3;i++){
                      if(arrayGuesses[i]==arrayRandom[i]) match1++;
                      if (match1==3) System.out.println("You have won 1.000.000$");
              }
              
              for(i=0;i<3;i++){
                  for(j=0;j<3;j++){
                      if(arrayGuesses[j]==arrayRandom[i]) {match2++; break;}
                  
                  }
              } 
              if(match2==1) System.out.println("You have won 10$"); else
                  if(match2==2) System.out.println("You have won 100$"); else
                      if(match2==3 && match1!=3) System.out.println("You have won 1.000$"); else
                          System.out.println("You have no matches.");
              

              System.out.println("Please choose the exercise you want to do:");
                exercise=scan.nextInt(); break;
          
          case 5:
              
              Random random = new Random();
              int pickedRandom = random.nextInt(2);
              System.out.println("Please choose Rock(0), Paper(1) or Scissors(2):");
                int pickedNumber=scan.nextInt();
                
                if(pickedRandom==pickedNumber) System.out.println("You chose "+pickedNumber+" and the computer chose "+pickedRandom+". The result is a tie.");
                else if(pickedRandom==0 && pickedNumber==1) System.out.println("You chose "+pickedNumber+" and the computer chose "+pickedRandom+". You win.");
                else if(pickedRandom==0 && pickedNumber==2) System.out.println("You chose "+pickedNumber+" and the computer chose "+pickedRandom+". You lose.");
                else if(pickedRandom==1 && pickedNumber==0) System.out.println("You chose "+pickedNumber+" and the computer chose "+pickedRandom+". You lose.");
                else if(pickedRandom==1 && pickedNumber==2) System.out.println("You chose "+pickedNumber+" and the computer chose "+pickedRandom+". You win.");
                else if(pickedRandom==2 && pickedNumber==0) System.out.println("You chose "+pickedNumber+" and the computer chose "+pickedRandom+". You win.");
                else System.out.println("You chose "+pickedNumber+" and the computer chose "+pickedRandom+". You lose.");
              
              
              System.out.println("Please choose the exercise you want to do:");
                exercise=scan.nextInt(); break;
          
          case 6:
              
              for(i=0;i<10;i++){
                  for(j=0;j<10;j++){
                  if(i==j) System.out.print("O");
                  else System.out.print(" ");
                  } System.out.print("\n");
              }
              
              System.out.println("Please choose the exercise you want to do:");
                exercise=scan.nextInt(); break;
          
          case 7:
              
              double populationOfMexico=121000000d;
              double populationOfUnitedStates=315000000d;
              int numberOfYears=0;
              
              while(populationOfMexico<populationOfUnitedStates){
              populationOfMexico=populationOfMexico+(populationOfMexico*0.0101);//1.01%
              populationOfUnitedStates=populationOfUnitedStates-(populationOfUnitedStates*0.0015);//0.15%
              numberOfYears++;
                  System.out.println("Population of Mexico in the "+numberOfYears+" year is "+populationOfMexico+" and the population of the US is "+populationOfUnitedStates);
              }
              System.out.println("The number of years it took is "+numberOfYears);
              
              System.out.println("Please choose the exercise you want to do:");
                exercise=scan.nextInt(); break;
          
          case 8:
              
                System.out.println("How many points did Art score?");
                int pointsScoredByArt=scan.nextInt();
                System.out.println("How many points did Bob score?");
                int pointsScoredByBob=scan.nextInt();
                 System.out.println("How many points did Cal score?");
                int pointsScoredByCal=scan.nextInt();
                 System.out.println("How many points did Dan score?");
                int pointsScoredByDan=scan.nextInt();
                System.out.println("How many points did Eli score?");
                int pointsScoredByEli=scan.nextInt();
                
                int maxScore=pointsScoredByArt;
                if(pointsScoredByArt>pointsScoredByBob && pointsScoredByArt>pointsScoredByCal && pointsScoredByArt>pointsScoredByDan && pointsScoredByArt>pointsScoredByEli)
                    maxScore=pointsScoredByArt; else
                if(pointsScoredByBob>pointsScoredByArt && pointsScoredByBob>pointsScoredByCal && pointsScoredByBob>pointsScoredByDan && pointsScoredByBob>pointsScoredByEli)
                    maxScore=pointsScoredByBob; else
                if(pointsScoredByCal>pointsScoredByBob && pointsScoredByCal>pointsScoredByArt && pointsScoredByCal>pointsScoredByDan && pointsScoredByCal>pointsScoredByEli)
                    maxScore=pointsScoredByCal; else    
                if(pointsScoredByDan>pointsScoredByBob && pointsScoredByDan>pointsScoredByCal && pointsScoredByDan>pointsScoredByArt && pointsScoredByDan>pointsScoredByEli)
                    maxScore=pointsScoredByDan; else    
               if(pointsScoredByEli>pointsScoredByBob && pointsScoredByEli>pointsScoredByCal && pointsScoredByEli>pointsScoredByDan && pointsScoredByEli>pointsScoredByArt)
                    maxScore=pointsScoredByEli; 
                System.out.print("Art  ");
                for(i=0 ; i<pointsScoredByArt ; i++){
                    System.out.print("*");
                } System.out.print("\n");
                
                System.out.print("Bob  ");
                for(i=0 ; i<pointsScoredByBob ; i++){
                    System.out.print("*");
                } System.out.print("\n");
                
                System.out.print("Cal  ");
                for(i=0 ; i<pointsScoredByCal ; i++){
                    System.out.print("*");
                } System.out.print("\n");
                
                System.out.print("Dan  ");
                for(i=0 ; i<pointsScoredByDan ; i++){
                    System.out.print("*");
                } System.out.print("\n");
                
                System.out.print("Eli  ");
                for(i=0 ; i<pointsScoredByEli ; i++){
                    System.out.print("*");
                } System.out.print("\n");
                   
                   
              System.out.println("Please choose the exercise you want to do:");
                exercise=scan.nextInt(); break;
          
          case 9:
              
        //final int TWENTY_ONE = 21;
       /* int playerOneEntry;
        int computerEntry = 0;
        int total = 0;
        System.out.println("Instructions, two players take turns by entering 1, 2, or 3 \n"+ "which is then added to a running total. Whoever makes the score go over twenty one "+ "loses\n");

        while(total <= 21) {    
            System.out.println("Player, please enter 1, 2, or 3 >>> ");
            playerOneEntry = scan.nextInt();
            while(playerOneEntry != 1 && playerOneEntry != 2 && playerOneEntry != 3) {
                System.out.println("Player, please enter 1, 2, or 3 >>> ");
                playerOneEntry = scan.nextInt();
            }
            total += playerOneEntry;
            System.out.println("The total is " + total);
            if(total == 21) {
                System.out.println("Player Wins!");
                total = 25;
            }

            if(total < 21) {
                switch (total) {
                    case 1:
                        computerEntry = 1;
                        break;
                    case 2:
                        computerEntry = 1;
                        break;
                    case 3:
                        computerEntry = 3;
                        break;
                    case 4:
                        computerEntry = 3;
                        break;
                    case 5:
                        computerEntry = 3;
                        break;
                    case 6:
                        computerEntry = 2;
                        break;
                    case 7:
                        computerEntry = 1;
                        break;
                    case 8:
                        computerEntry = 1;
                        break;
                    case 9:
                        computerEntry = 3;
                        break;
                    case 10:
                        computerEntry = 2;
                        break;
                    case 11:
                        computerEntry = 3;
                        break;
                    case 12:
                        computerEntry = 2;
                        break;
                    case 13:
                        computerEntry = 1;
                        break;
                    case 14:
                        computerEntry = 3;
                        break;
                    case 15:
                        computerEntry = 2;
                        break;
                    case 16:
                        computerEntry = 1;
                        break;
                    case 17:
                        computerEntry = 1;
                        break;
                    case 18:
                        computerEntry = 3;
                        break;
                    case 19:
                        computerEntry = 2;
                        break;
                    case 20:
                        computerEntry = 1;
                        break;
                    default:
                        computerEntry = 1;
                }
            }

            total += computerEntry;
            System.out.println("Computer entered " + computerEntry);
            System.out.println("The total is " + total);
            if(total == 21) {
                System.out.println();
                total = 25;
                System.out.println("Computer Wins!");
            }
            else {
                System.out.println("The total is " + total);
            }
        }  

                  System.out.println("Please choose the exercise you want to do:");
                    exercise=scan.nextInt(); break;*/

//do program that asks who starts, me or PC,also to choose to what number to count(21 or more)

              
              int total,ingameTotal=0,playerOneEntry;

              
              System.out.println("What do you want to be the end number (bigger than 4)?");
              total=scan.nextInt();
              
              int rest=total%4;
              ingameTotal+=rest;
              System.out.println("omputer entered "+rest);
              
              while(ingameTotal<total) {
         
              System.out.println("Player, please enter 1, 2, or 3 >>> ");
            playerOneEntry = scan.nextInt();
            while(playerOneEntry != 1 && playerOneEntry != 2 && playerOneEntry != 3) {
                System.out.println("Player, please enter 1, 2, or 3 >>> ");
                playerOneEntry = scan.nextInt();
            }
            ingameTotal += playerOneEntry;
            System.out.println("The total is " + ingameTotal);
            if(ingameTotal >= total) {
                System.out.println("Player Wins!");
                ingameTotal = total;
            }
            switch(playerOneEntry){
                    case 1: ingameTotal+=3; System.out.println("Computer entered 3"); break;
                    case 2: ingameTotal+=2; System.out.println("Computer entered 2"); break;
                    case 3: ingameTotal+=1; System.out.println("Computer entered 1"); break;}


            if(ingameTotal >= total) {
                
                System.out.println("Computer Wins!");
                } else {
                    System.out.println("The total is " + ingameTotal);
                    }
              } 
              System.out.println("Please choose the exercise you want to do:");
                    exercise=scan.nextInt(); break;
              }
         
         }
        
        
    }
    
}
    

