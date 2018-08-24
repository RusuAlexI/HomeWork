/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg8;

import java.util.Scanner;


public class Exercise8 {


    public static void main(String[] args) {
        int highScore, lowScore,score,numberOfScores=0;
        float average,total=0;
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Please enter the first score:");
        score=scan.nextInt();
        lowScore=score;
        highScore=score;
        
        while(score!=999)  { 
            if(score>=0 && score<=100){
                numberOfScores++;
                total+=score;
                
                if (score<lowScore){
                    lowScore=score;}
                if (score>highScore){
                    highScore=score;}
                
                System.out.println("Please enter the next score:");
                score=scan.nextInt();} 
            else{
               System.out.println("Please enter a different score."); score=scan.nextInt();}
            }
        
        average=total/numberOfScores;
        System.out.println("The highest score is "+highScore);
        System.out.println("The lowest score is "+lowScore);
        System.out.println("The number of scores is "+numberOfScores);
        System.out.println("The average of "+numberOfScores+" scores is "+average);
    }
    
}
