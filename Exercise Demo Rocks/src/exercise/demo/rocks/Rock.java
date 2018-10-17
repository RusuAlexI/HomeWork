
package exercise.demo.rocks;


public class Rock {
    private int numberOfSamples;
    private String descriptionOfTypeOfRock;
    private double weightInGramms;

    public Rock(int numberOfSamples, double weightInGramms) {
        this.numberOfSamples = numberOfSamples;
        this.weightInGramms = weightInGramms;
        this.descriptionOfTypeOfRock="Unclassified";
    }

    public void setDescriptionOfTypeOfRock(String descriptionOfTypeOfRock) {
        this.descriptionOfTypeOfRock = descriptionOfTypeOfRock;
    }
    
    
    public int getNumberOfSamples() {
        return numberOfSamples;
    }

    public String getDescriptionOfTypeOfRock() {
        return descriptionOfTypeOfRock;
    }

    public double getWeightInGramms() {
        return weightInGramms;
    }

    @Override
    public String toString() {
        return "Rock{" + "numberOfSamples=" + numberOfSamples + ", descriptionOfTypeOfRock=" + descriptionOfTypeOfRock + ", weightInGramms=" + weightInGramms + '}';
    }
    
    
    
    
}
