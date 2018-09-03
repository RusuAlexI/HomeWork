package exercise.pkg6;

public class Exercise6 {

    public static void main(String[] args) {
        int i, perfectNumber;

        for (i = 4; i <= 10000; i++) {
            perfectNumber = 0;
            if (i % 2 == 0) {
                for (int j = 1; j <= i / 2; j++) {
                    if (i % j == 0) {
                        perfectNumber += j;
                    }
                }
            } else {
                for (int j = 1; j <= i / 2 - 1; j++) {
                    if (i % j == 0) {
                        perfectNumber += j;
                    }
                }
            }

            if (perfectNumber == i) {
                System.out.println(i + " is a perfect number");
            }

        }

    }

}
