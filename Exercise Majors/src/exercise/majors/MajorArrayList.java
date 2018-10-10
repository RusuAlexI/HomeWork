
package exercise.majors;

import java.util.Scanner;
import java.util.ArrayList;

public class MajorArrayList {
    
    final private ArrayList<String> majorsArrayList=new ArrayList<String>(){{
    add("ACC");
    add("CHEM");
    add("CIS");
    add("ENG");
    add("HIS");
    add("PHYS");}};
    
    
    
    public MajorArrayList(){
    displayDivision();
    }
    
    public void displayDivision(){
        Scanner scan=new Scanner(System.in);
        System.out.println("The majors are:");
        
        for(int i=0;i<majorsArrayList.size();i++){
            System.out.print(majorsArrayList.get(i)+" ");
        }
        
        System.out.println("\nPlease enter a major to search(from the provided list):");
        String majorToSearch=scan.nextLine().toUpperCase();
        
        int indexOfTheMajor=0;
        for(int i=0;i<majorsArrayList.size();i++){
        if(majorsArrayList.get(i).equals(majorToSearch))
            indexOfTheMajor=i;
        }
        
        if(indexOfTheMajor==0 || indexOfTheMajor==2) {System.out.println("Business Division");} else
            if(indexOfTheMajor==1 || indexOfTheMajor==5) {System.out.println("Science Division");} else
                if(indexOfTheMajor==3 || indexOfTheMajor==4) {System.out.println("Humanities Division");} else
                    System.out.println("You entered a wrong major, please try again");
    }
}
