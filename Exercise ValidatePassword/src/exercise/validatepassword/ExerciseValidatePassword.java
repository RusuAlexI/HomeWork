
package exercise.validatepassword;
import java.util.Scanner;

public class ExerciseValidatePassword {


    public static void main(String[] args) {
        boolean valid=false;
        int upperCaseLettersCounter=0;
        int lowerCaseLettersCounter=0;
        int digitsCounter=0;
        
        Scanner scan=new Scanner(System.in);
        
        
        while(valid!=true){
            
            System.out.println("Please input the password:(at least 2 UPPERCASE letters, two lowercase letters, two digits):");
            String password=scan.nextLine();
            
            char[] passwordToArray=password.toCharArray();
            
            for (int i=0; i<passwordToArray.length;i++){
                if(Character.isUpperCase(passwordToArray[i])==true) upperCaseLettersCounter++;
                if(Character.isLowerCase(passwordToArray[i])==true) lowerCaseLettersCounter++;
                 if(Character.isDigit(passwordToArray[i])==true) digitsCounter++;
               
            }
            System.out.println("Upper counter: "+upperCaseLettersCounter+", lowerCounter: "+lowerCaseLettersCounter+", digits: "+digitsCounter);
            
            if(upperCaseLettersCounter>=2 && lowerCaseLettersCounter>=2 && digitsCounter>=2) valid=true; else {
            if(upperCaseLettersCounter<2) System.out.println("You need at least 2 upper Case letters;");
            if(lowerCaseLettersCounter<2) System.out.println("You need at least 2 lower Case letters;");
            if(digitsCounter<2) System.out.println("You need at least 2 digits;");
                upperCaseLettersCounter=0;
                lowerCaseLettersCounter=0;
                digitsCounter=0;
            
            }


        }
    }
    
}
