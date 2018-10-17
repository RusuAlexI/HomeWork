
package exercise.demo.rocks;


public class MetamorphicRock extends Rock{

    public MetamorphicRock(int numberOfSamples, double weightInGramms) {
        super(numberOfSamples, weightInGramms);
        super.setDescriptionOfTypeOfRock("The original rock is subjected to heat and "
                + "pressure, causing profound physical or chemical change.");
    }

    @Override
    public String toString() {
        return "MetamorphicRock{" +super.toString()+ '}';
    }
    
    
    
    
    
}
