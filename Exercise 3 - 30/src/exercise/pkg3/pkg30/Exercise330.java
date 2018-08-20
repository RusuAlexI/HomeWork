
package exercise.pkg3.pkg30;
import java.util.Scanner;
public class Exercise330 {

    public static void main(String[] args) {
        
      Scanner scan = new Scanner(System.in);
       System.out.println("Please type the number:");
      int a=scan.nextInt();
      int n, length = (int)(Math.log10(a)+1); //we get the length of the entered number
      

       if(length>5) System.out.println("The number is bigger tham 5 digits, please insert anoter number."); //we check if the entered number is not biger that 5 caracters
       
       
      String numString = String.valueOf(a); //we convert the number to a string of characters
        String reverseNumString = new StringBuilder(numString).reverse().toString(); //we assign "reverseNjmString" the reverse value of our entered number

               if(numString.equals(reverseNumString)) { //we compare the two strings (the straight and the reversed one) to see if they are equal, if so then the number is a palindrome
                System.out.println(a + " is a Palindrome!");
                  }
                else {
                System.out.println(a + " is not a Palindrome!");
                }
      

        
     
      
    }
    
}
