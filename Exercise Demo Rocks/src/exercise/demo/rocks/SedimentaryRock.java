
package exercise.demo.rocks;


public class SedimentaryRock extends Rock{

    public SedimentaryRock(int numberOfSamples, double weightInGramms) {
        super(numberOfSamples, weightInGramms);
        super.setDescriptionOfTypeOfRock("types of rock that are formed by the deposition and subsequent cementation of "
                + "mineral or organic particles on the floor of oceans or other bodies of water at the Earth's surface.");
    }

    @Override
    public String toString() {
        return "SedimentaryRock{" +super.toString()+ '}';
    }
    
    
    
    
}
