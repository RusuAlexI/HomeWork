
package exercise.motto;

public class ExerciseMOTTO {

    public static void main(String[] args) {
        
        Bread bread1=new Bread("Rye", 45);
        Bread bread2=new Bread("Flat Bread", 100);
        Bread bread3=new Bread("Dry Bread", 145);
        
        System.out.println("Data for the first bread:");
        System.out.println("Bread type is "+bread1.getBreadType()+", with "+bread1.getCaloriesPerSlice()+
                            " calories per slice. Company Motto: "+Bread.MOTTO);
        
        System.out.println("Data for the second bread:");
        System.out.println("Bread type is "+bread2.getBreadType()+", with "+bread2.getCaloriesPerSlice()+
                            " calories per slice. Company Motto: "+Bread.MOTTO);
        
        System.out.println("Data for the third bread:");
        System.out.println("Bread type is "+bread3.getBreadType()+", with "+bread3.getCaloriesPerSlice()+
                            " calories per slice. Company Motto: "+Bread.MOTTO);
        
    }
    
}
