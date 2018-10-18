
package exercise.demo.runners;


public class PoliticalCandidate implements Runner{
    
    public PoliticalCandidate() {
        Run(); 
    }
    
    @Override
    public void Run() {
        System.out.println("The Political Candidate is running for major.");
    }
}
