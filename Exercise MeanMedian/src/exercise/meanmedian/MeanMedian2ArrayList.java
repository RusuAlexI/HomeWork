
package exercise.meanmedian;

import java.util.ArrayList;
import java.util.Collections;

public class MeanMedian2ArrayList {
 
    public MeanMedian2ArrayList(ArrayList<Integer> intArrayList) {
        
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
        System.out.println("Ther sorted arrayList: "+intArrayList);
        int middleOfArray=intArrayList.size()/2;
        if(intArrayList.size()%2==0){
        System.out.println("The median of the array is " + intArrayList.get(middleOfArray));} else {        
        System.out.println("The median of the array is " + ((intArrayList.get(middleOfArray)+intArrayList.get(middleOfArray+1))/2));
        }
            
        
    }

}
