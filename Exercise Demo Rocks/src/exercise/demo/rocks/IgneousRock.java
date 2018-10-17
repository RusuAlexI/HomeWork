
package exercise.demo.rocks;


public class IgneousRock extends Rock{

    public IgneousRock(int numberOfSamples, double weightInGramms) {
        super(numberOfSamples, weightInGramms);
        super.setDescriptionOfTypeOfRock("Igneous rock is formed through the cooling and solidification of magma or lava.");
        
    }

    @Override
    public String toString() {
        return "IgneousRock{"+super.toString() + '}';
    }
    
    
    
}
