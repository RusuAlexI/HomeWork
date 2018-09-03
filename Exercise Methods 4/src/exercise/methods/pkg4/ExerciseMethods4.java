
package exercise.methods.pkg4;

import java.util.Scanner;

public class ExerciseMethods4 {


    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);


        Sandwich sandwich=new Sandwich("carp","scale",250.6);
        
        System.out.println(sandwich.getBreadType()+" "+sandwich.getIngredient()+"  "+sandwich.getPrice());
        
        sandwich.setBreadType("asd");
        sandwich.setIngredient("dsa");
        sandwich.setPrice(145.3);
        System.out.println(sandwich.getBreadType()+" "+sandwich.getIngredient()+"  "+sandwich.getPrice());
        
    }
    
}
