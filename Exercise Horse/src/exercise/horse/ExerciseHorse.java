
package exercise.horse;

public class ExerciseHorse {


    public static void main(String[] args) {
        
        Horse firstHorse=new Horse("First Horse", "White", 1998);
        Horse secondHorse=new RaceHorse(8, "Phoenix", "Grey", 2001);
        RaceHorse firstRaceHorse=new RaceHorse(9,"Felix","Brown",2010);
        //RaceHorse secondRaceHorse=new Horse("Brian", "Black", 2005);
        
        System.out.println(firstHorse.toString());
        System.out.println(secondHorse.toString());
        System.out.println(firstRaceHorse.toString());
        
    }
    
}
