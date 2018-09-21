
package exercise.time;


public class ExerciseTime {


    public static void main(String[] args) {
        Time time=new Time();
        time.setTime(5, 59, 59);
        System.out.println(time.toString()); 
        time.nextSecond();
        System.out.println(time.toString()); 
        time.previousSecond();
        System.out.println(time.toString()); 
    }
    
}
