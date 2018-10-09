package exercise.meanmedian;

import java.util.Arrays;

public class MeanMedian {

    private int[] intArray = new int[5];

    public MeanMedian(int[] intArray) {
        this.intArray = intArray;
    }

    public void mean(int[] intArray) {
        int sumOfArrayElements = 0;
        int mean;

        for (int i = 0; i < intArray.length; i++) {
            sumOfArrayElements += intArray[i];
        }
        mean = sumOfArrayElements / intArray.length;
        System.out.println("The mean of the array is "+sumOfArrayElements+"/"+intArray.length+"="+ mean);
    }

    public void median(int[] intArray) {
        Arrays.sort(intArray);
        displayArray(intArray);
        int middleOfArray=intArray.length/2;
        System.out.println("The median of the array is " + intArray[middleOfArray]);
    }

    public void displayArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println("\n");
    }

}
