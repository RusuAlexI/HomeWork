
package exercise.meanmedian;

import java.util.Arrays;

public class MeanMedian2 {
    


    public MeanMedian2(int[] intArray) {
        
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
        System.out.println("The sorted array is: ");
        displayArray(intArray);
        int middleOfArray=intArray.length/2;
        if(intArray.length%2==0){
        System.out.println("The median of the array is " + intArray[middleOfArray]);} else {        
        System.out.println("The median of the array is " + ((intArray[middleOfArray]+intArray[middleOfArray+1])/2));
        }
            
        
    }

    public void displayArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println("\n");
    }
}
