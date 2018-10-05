
package exercise.replacearray;


public class ExerciseReplaceArray {


    public static void main(String[] args) {
                
            String firstString="First string of characters to change";
            String secondString="Second string of characters to change";
            String thirdString="third string of characters to change cccc";
            
            Replace replaceAll=new Replace(firstString,'c','t');
            System.out.println(replaceAll.getString());
            
            Replace replaceFrom=new Replace(secondString,'c','I',2);
            System.out.println(replaceFrom.getString());
            
            Replace replaceSome=new Replace(thirdString,'c','I' , 2 , 4);
            System.out.println(replaceSome.getString());

    }
    
}
