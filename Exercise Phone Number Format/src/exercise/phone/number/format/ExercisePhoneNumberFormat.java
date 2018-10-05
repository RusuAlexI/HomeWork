package exercise.phone.number.format;

import java.util.Scanner;

public class ExercisePhoneNumberFormat {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean correct = true;
        String number;

        while (correct) {

            System.out.println("Please insert the 10 digit number to be converted(or 999 to exit):");
            number = scan.nextLine();
            if (number.equals("999")) {
                correct = false;
            }

            char[] testArray = number.toCharArray();

            if (testArray.length == 10) {
                number = "(" + testArray[0] + testArray[1] + testArray[2] + ")" + testArray[3] + testArray[4] + testArray[5] + "-"
                        + testArray[6] + testArray[7] + testArray[8] + testArray[9];
                System.out.println("The converted number is " + number);
            } else {
                System.out.println(testArray.length + "  You inserted a wrong length, pleaase insert again:");
            }

        }
    }

}
