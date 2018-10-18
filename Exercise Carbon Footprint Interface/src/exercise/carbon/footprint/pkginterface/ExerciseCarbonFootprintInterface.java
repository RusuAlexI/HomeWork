package exercise.carbon.footprint.pkginterface;

import java.util.ArrayList;

public class ExerciseCarbonFootprintInterface {

    public static void main(String[] args) {

        ArrayList<CarbonFootprint> carbonFootprintArray = new ArrayList<>();

        carbonFootprintArray.add(new Building(7));
        carbonFootprintArray.add(new Car(5000, 75, 23));
        carbonFootprintArray.add(new Bicycle(56, 2));

        for (CarbonFootprint carbonFootprint : carbonFootprintArray) {
            System.out.println(carbonFootprint.getCarbonFootprint());
        }

    }

}
