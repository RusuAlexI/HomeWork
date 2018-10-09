
package exercise.duplicate.elimination;

import java.util.Scanner;


public class ExerciseDuplicateElimination {


    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
int[] array = new int[10];

int test=0, counter1=0, counter2=0;

   
   for(int i=0; i<array.length;i++){
       counter1=0;
       System.out.println("Please insert the value for the array:");
       test=input.nextInt();
       for(int j=0; j<array.length;j++){
       if(test==array[j]) counter1++;
       
       }
       if(counter1<1) {array[counter2]=test; counter2++;}
       for(int k=0;k<array.length;k++){
           System.out.print(array[k]+" ");
       }
   }
    }
}

