
package exercise.meanmedian;

import java.util.ArrayList;
import java.util.Collections;


public class MeanMedianArrayList {
    private ArrayList<Integer> intArrayList=new ArrayList<>(5);
    
    public MeanMedianArrayList(ArrayList<Integer> intArrayList) {
        this.intArrayList = intArrayList;
    }

    public void mean(ArrayList<Integer> intArrayList) {
        int sumOfArrayElements = 0;
        int mean;

        for (int i = 0; i < intArrayList.size(); i++) {
            sumOfArrayElements += intArrayList.get(i);
        }
        mean = sumOfArrayElements / intArrayList.size();
        System.out.println("The mean of the array is "+sumOfArrayElements+"/"+intArrayList.size()+"="+ mean);
    }

    public void median(ArrayList<Integer> intArrayList) {
        Collections.sort(intArrayList);
        System.out.println(intArrayList);
        int middleOfArray=intArrayList.size()/2;
        System.out.println("The median of the array is " + intArrayList.get(middleOfArray));
    }

}
