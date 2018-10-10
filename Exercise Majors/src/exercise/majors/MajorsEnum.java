
package exercise.majors;
import java.util.Scanner;

public class MajorsEnum {
    
    private enum majors {
    ACC, CHEM, CIS, ENG, HIS, PHYS
} 
    
    public MajorsEnum(){
    displayDivision();
    }
    
    public void displayDivision(){
        Scanner scan=new Scanner(System.in);
        System.out.println("The majors are:");
        
        for(majors maj:majors.values()){
            System.out.print(maj+" ");
        }
        
        System.out.println("\nPlease enter a major to search(from the provided list):");
        String majorToSearch=scan.nextLine().toUpperCase();
        
        int indexOfTheMajor=0;
        for(majors maj:majors.values()){
        if(majorToSearch.equals(maj.toString()))
            indexOfTheMajor=maj.ordinal();
        }
        
        if(indexOfTheMajor==0|| indexOfTheMajor==2) {System.out.println("Business Division");} else
            if(indexOfTheMajor==1 || indexOfTheMajor==5) {System.out.println("Science Division");} else
                if(indexOfTheMajor==3 || indexOfTheMajor==4) {System.out.println("Humanities Division");} else
                    System.out.println("You entered a wrong major, please try again");
    }
}
