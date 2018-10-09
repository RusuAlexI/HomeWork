package exercise.airline.reservation.system;

import java.util.Scanner;

public class ExerciseAirlineReservationSystem {

    public static void main(String[] args) {
        /*boolean numberOfSeats[]=new boolean[10];
        Scanner scan=new Scanner(System.in);
        int menuChoice=0;
        int availableSeatsForFirstClass=5;
        int availableSeatsForSecondClass=5;
        String otherMenuChoice;
        
        for(int i=0;i<numberOfSeats.length;i++){
        numberOfSeats[i]=false;
        }
        
        
        
            System.out.println("***** Airline Reservation System *****");
            System.out.println(" Menu Options ");
            System.out.println(" 1 - First Class ");
            System.out.println(" 2 - Economy Class ");
            System.out.println(" 3 - Exit ");
            System.out.println("**************************************");
            System.out.println("Please choose your option: ");
            menuChoice = scan.nextInt();
            
            while(menuChoice!=3){
                switch(menuChoice){
                
                    case 1: {
                    if(availableSeatsForFirstClass>0){
                        for(int i=0;i<5;i++){
                        if(numberOfSeats[i]==false) {numberOfSeats[i]=true; availableSeatsForFirstClass--; }break;
                        } 
                        
                    }else
                        {System.out.println("There are no more seats in the first class. Do you want to buy "
                                + "seats in the economy class? y/n");
                    otherMenuChoice=scan.nextLine();
                    if(otherMenuChoice.equalsIgnoreCase("Y")){menuChoice=2;} else menuChoice=3;
                        }
                    }
                    
                    case 2: {
                    if(availableSeatsForSecondClass>0){
                        for(int i=5;i<10;i++){
                        if(numberOfSeats[i]==false) {numberOfSeats[i]=true; availableSeatsForSecondClass--; break;}
                        } 
                        
                    }else
                        {System.out.println("There are no more seats in the second class. Do you want to buy "
                                + "seats in the first class? y/n");
                    otherMenuChoice=scan.nextLine();
                    if(otherMenuChoice.equalsIgnoreCase("Y")){menuChoice=1;} else menuChoice=3;
                        }
                    }
                
                }
        } */

       boolean[] seats = new boolean[10];
       Reservation res=new Reservation(seats);

    }
}
//make in 2 arrays(for each class)