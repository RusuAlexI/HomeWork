
package exercise.methods.pkg4;

import java.util.Scanner;

public class ExerciseMethods4 {


    public static void main(String[] args) {
        
        //Scanner scan=new Scanner(System.in);


        Sandwich s=new Sandwich("carp","scale",250.6);
        
        Sandwich s2 = new Sandwich();
        
        Sandwich.k++;
        s.k++;
        
        Sandwich.burnBread();
        s.burnBread();
        
        /*Sandwich.breadType;
        
        Sandwich.getBreadType();*/
        
        System.out.println(s.getBreadType()+" "+s.getIngredient()+"  "+s.getPrice());
        
        s.setBreadType("asd");
        s.setIngredient("dsa");
        s.setPrice(145.3);
        System.out.println(s.getBreadType()+" "+s.getIngredient()+"  "+s.getPrice());
        
    }
    
}
