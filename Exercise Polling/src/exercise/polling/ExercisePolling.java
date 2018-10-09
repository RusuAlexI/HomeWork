package exercise.polling;

import java.util.Scanner;

public class ExercisePolling {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] topics = {"Workers Rights", "Healthcare", "Law Enforcement", "Environment and Water", "Animal Rights"};
        int[][] responses = new int[5][3];
        int[] sumOfAllTopics = new int[5];
        //int[] pointMinimum=new int[topics.length];
        //int[] pointMaximum=new int[topics.length];
        int pointsMax = 0;
        int pointsMin = 500;
        int issueMax;
        int issueMin;

        for (int i = 0; i < topics.length; i++) {
            System.out.println("Topic: " + topics[i] + ", responses:");
            for (int j = 0; j < responses[j].length; j++) {
                System.out.println((j + 1) + " person:");
                responses[i][j] = scan.nextInt();

            }

        }

        System.out.println("Topic           grade1  grade2  grade3      average");

        int sum = 0, indexMin = 0;
        int indexMax = 0;

        for (int i = 0; i < topics.length; i++) {
            System.out.print(topics[i] + "        ");

            sum = 0;
            for (int j = 0; j < responses[j].length; j++) {
                System.out.print(" " + responses[i][j] + "   ");
                sum += responses[i][j];
                if (j == responses[j].length - 1) {
                    System.out.println("    " + sum);
                }
            }
            System.out.println("");
            if (sum > pointsMax) {
                pointsMax = sum;
                indexMax = i;
            }
            if (sum < pointsMin) {
                pointsMin = sum;
                indexMin = i;
            }
        }

        System.out.println("The biggest/Smallest average:");
        System.out.println("Issue: " + topics[indexMax] + " points total: " + pointsMax);

        System.out.println("Issue: " + topics[indexMin] + " points total: " + pointsMin);

    }

}
