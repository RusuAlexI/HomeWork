
package exercise.college.list;

import java.util.Scanner;

public class Faculty extends CollegeEmployee{
    Scanner scan=new Scanner(System.in);
    
    private boolean isTenured;
    private String choice;

    @Override
    public void displayInformation() {
        super.displayInformation(); 
        System.out.println(", is tenured: " + this.isTenured);
    }

    @Override
    public void setData() {
        super.setData(); 
        System.out.println("is the College Employee tenured(Y/N)? ");
        this.choice=scan.nextLine();
                if(choice.equals("Y") || choice.equals("y")){
            isTenured = true;
        }else{
            isTenured = false;
        }
    }
    
    
}
