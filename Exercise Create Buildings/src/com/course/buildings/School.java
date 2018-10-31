
package com.course.buildings;

//import com.course.buildings.Building;


public class School extends Building {
    
    private int numberOfClassRooms;
    private String GradeLevel;

    public School(int numberOfClassRooms, String GradeLevel, int squareFootage, int stories) {
        super(squareFootage, stories);
        this.numberOfClassRooms = numberOfClassRooms;
        this.GradeLevel = GradeLevel;
    }
    
    public void printFromTo(int from, int to){
    for(int i=from; i<to+1;i++){
        System.out.print(i+" ");            
    }
    }

    public int getNumberOfClassRooms() {
        return numberOfClassRooms;
    }

    public void setNumberOfClassRooms(int numberOfClassRooms) {
        this.numberOfClassRooms = numberOfClassRooms;
    }

    public String getGradeLevel() {
        return GradeLevel;
    }

    public void setGradeLevel(String GradeLevel) {
        this.GradeLevel = GradeLevel;
    }

    @Override
    public String toString() {
        return "School{" + "numberOfClassRooms=" + numberOfClassRooms + ", GradeLevel=" + GradeLevel + '}'
                 + ", ("+super.toString()+")";
    }
    
    
}
