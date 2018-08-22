
package exercise.pkg4.pkg23;

import java.util.Scanner; //needed to read input from the keyboard

public class Exercise423 {

 
    public static void main(String[] args) {
        int number,i;
        long factorial=1;
        Scanner scan=new Scanner(System.in); //we assign the variable "scan" to use it to scan the input, and assign it to a different variable separating them with a dot. 
              
        
        System.out.println("Please insert the number:");
        number=scan.nextInt();  //using the "scan" variable from above, we assign "number" variable the input from the keyboard, adding "/nextInt", Int being the type of the input we expect to enter
        System.out.println("|   Number   |  number!    |");
        for (i = 1; i <= number; i++) { //we start from 1 and increment it till we reach the size of our entered number
            factorial*=i; //starting with 1, we multiply it with i, which goes from 1 to "number"
            if (i<10)
            System.out.println("|     "+i+"!     |   "+factorial); else //we print out the numbers based on their size, to look more readable.
                System.out.println("|     "+i+"!    |   "+factorial);
                    
        }
    }
    
}
