
package com.course.buildings;

//import com.course.buildings.Building;


public class House extends Building{
    
    private int numberOFBedrooms;
    private int numberOfBaths;

    public House(int numberOFBedrooms, int numberOfBaths, int squareFootage, int stories) {
        super(squareFootage, stories);
        this.numberOFBedrooms = numberOFBedrooms;
        this.numberOfBaths = numberOfBaths;
    }

    public int getNumberOFBedrooms() {
        return numberOFBedrooms;
    }

    public void setNumberOFBedrooms(int numberOFBedrooms) {
        this.numberOFBedrooms = numberOFBedrooms;
    }

    public int getNumberOfBaths() {
        return numberOfBaths;
    }

    public void setNumberOfBaths(int numberOfBaths) {
        this.numberOfBaths = numberOfBaths;
    }

    @Override
    public String toString() {
        return "House{" + "numberOFBedrooms=" + numberOFBedrooms + 
                ", numberOfBaths=" + numberOfBaths + ", ("+super.toString()+")";
    }
    
    
}
