
package com.course.buildings;


public class Building {
    
    private int squareFootage;
    private int stories;

    public Building(int squareFootage, int stories) {
        this.squareFootage = squareFootage;
        this.stories = stories;
    }

    public int getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }

    public int getStories() {
        return stories;
    }

    public void setStories(int stories) {
        this.stories = stories;
    }

    @Override
    public String toString() {
        return "Building{" + "squareFootage=" + squareFootage + ", stories=" + stories + '}';
    }
    
    
    
}
