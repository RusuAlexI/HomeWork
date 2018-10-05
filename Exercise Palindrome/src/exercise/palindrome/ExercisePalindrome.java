
package exercise.palindrome;

import java.util.Scanner;

public class ExercisePalindrome {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        /*System.out.println("Please insert the phrase:");
        String phrase=scan.nextLine();*/
        String phraseToTest="was it a car or a cat i saw";
        System.out.println(phraseToTest);
        boolean isPalindrome=true;

        phraseToTest=phraseToTest.replaceAll(" ", "");
        System.out.println(phraseToTest);
        
        
        char[] arrayToTest=phraseToTest.toCharArray();
        int test=arrayToTest.length;
        if(arrayToTest.length%2==0){
        for(int i=0; i<arrayToTest.length/2; i++){
            
        System.out.println(arrayToTest[i]+" "+arrayToTest[test-1]);
            
        if(arrayToTest[i] != arrayToTest[test-1]) {isPalindrome=false; break;}
        test--;
        }} else 
            for(int i=0; i<arrayToTest.length/2+1; i++){
            
            System.out.println(arrayToTest[i]+" "+arrayToTest[test-1]);
            
            if(arrayToTest[i] != arrayToTest[test-1]) {isPalindrome=false; break;}
            test--;
        }
        
        if(isPalindrome==false) System.out.println("The phrase is not a palindrome");
        else System.out.println("The phrase is a palindrome");
    }
    
}
