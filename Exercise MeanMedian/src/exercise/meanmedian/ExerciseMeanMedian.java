
package exercise.meanmedian;
import java.util.Scanner;
import java.util.ArrayList;

public class ExerciseMeanMedian {

 
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      int[] intArray=new int[5];
        System.out.println("Please insert the 5 int you want to test:");
        for(int i=0; i<intArray.length;i++){
        intArray[i]=scan.nextInt();
        }
        
        MeanMedian meanMedian=new MeanMedian(intArray);
        meanMedian.median(intArray);
        meanMedian.mean(intArray);
        
        int arrayLength=0;
        while(arrayLength>20 ||arrayLength<1){
        System.out.println("Please type how many elements should the array have (up to 20):");
        arrayLength=scan.nextInt();}
        
        int[] intArrayWithDifferentLength=new int[arrayLength];
        System.out.println("Please insert the numbers you want to test:");
        for(int i=0; i<intArrayWithDifferentLength.length;i++){
        intArrayWithDifferentLength[i]=scan.nextInt();
        }
        
        MeanMedian2 meanMedian2=new MeanMedian2(intArrayWithDifferentLength);
        meanMedian2.mean(intArrayWithDifferentLength);
        meanMedian2.median(intArrayWithDifferentLength);
        
        ArrayList<Integer> intArrayList=new ArrayList<>(5);
        System.out.println("Please insert the 5 int you want to test:");
        for (int i = 0; i < 5; i++) {
            intArrayList.add(scan.nextInt());
        }
        System.out.println("The 5 int are:"+intArrayList);
        
        MeanMedianArrayList meanMedianArrayList=new MeanMedianArrayList(intArrayList);
        meanMedianArrayList.mean(intArrayList);
        meanMedianArrayList.median(intArrayList);
        
        int arrayListLength=0;
        while(arrayListLength>20 ||arrayListLength<1){
        System.out.println("Please type how many elements should the arrayList have (up to 20):");
        arrayListLength=scan.nextInt();}
        
        ArrayList<Integer> intArrayListWithDifferentLength=new ArrayList<>(arrayListLength);
        System.out.println("Please insert the numbers you want to test:");
        for(int i=0; i<arrayListLength;i++){
        intArrayListWithDifferentLength.add(scan.nextInt());
        }
        
        MeanMedian2ArrayList meanMedianArrayList2=new MeanMedian2ArrayList(intArrayListWithDifferentLength);
        meanMedianArrayList2.mean(intArrayListWithDifferentLength);
        meanMedianArrayList2.median(intArrayListWithDifferentLength);
                

        
        
    }
    
}
