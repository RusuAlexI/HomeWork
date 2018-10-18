
package com.course.buildings;


public class ExerciseCreateBuildings {


    public static void main(String[] args) {
        
        Building building = new Building(45,9);
	House house = new House(45,9,2,1);
	School school = new School(102,"Senior",45,9);
        
        System.out.println(building.toString());
        System.out.println(house.toString());
        System.out.println(school.toString());
    }
    
}
