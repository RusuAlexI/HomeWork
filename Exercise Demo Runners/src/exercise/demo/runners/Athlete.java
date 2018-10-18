
package exercise.demo.runners;

public class Athlete implements Runner{
    
    public Athlete() {
        Run(); 
    }
    
    @Override
    public void Run() {
        System.out.println("The athlete is running the race.");
    }
}
