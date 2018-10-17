
package exercise.demo.poems;


public class ExerciseDemoPoems {

 
    public static void main(String[] args) {
        Poem firstPoem=new Poem("First poem", 40);
        Poem secondPoem=new Couplet("First poem. first couplet");
        Poem thirdPoem=new Limerick("First poem, first limerick");
        Poem fourthPoem=new Haiku("First poem, first haiku");
        Couplet firstCouplet=new Couplet("First couplet");
        Limerick firstLimerick=new Limerick("First limerick");
        Haiku firstHaiku=new Haiku("First haiku");
        
        System.out.println(firstPoem.toString());
        System.out.println(secondPoem.toString());
        System.out.println(thirdPoem.toString());
        System.out.println(fourthPoem.toString());
        System.out.println(firstCouplet.toString());
        System.out.println(firstLimerick.toString());
        System.out.println(firstHaiku.toString());
        
        
    }
    
}
