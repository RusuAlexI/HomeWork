
package exercise.variable.length.argument.list;


public class ExerciseVariableLengthArgumentList {

   
    public static void main(String[] args) {
        VariableLengthArgumentList argumentList=new VariableLengthArgumentList();
        
        System.out.println("The product of 4 and 5 is "+argumentList.calculateProduct(4,5));
        System.out.println("The product of 4,8 and 5 is "+argumentList.calculateProduct(4,8,5));
        System.out.println("The product of 4,8,20 and 5 is "+argumentList.calculateProduct(4,8,20,5));
    }
    
}
