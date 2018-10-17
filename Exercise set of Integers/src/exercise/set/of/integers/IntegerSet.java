package exercise.set.of.integers;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
public class IntegerSet {

    private boolean[] integerRepresentation = new boolean[100];

    public IntegerSet() {
        for (int i = 0; i < integerRepresentation.length; i++) {
            integerRepresentation[i] = false;
        }
    }
    
    //LocalDate.

    public static IntegerSet union(IntegerSet firstObject, IntegerSet secondObject) {
        IntegerSet unionOfTheTwoSetsOfIntegers = new IntegerSet();

        for (int i = 0; i < unionOfTheTwoSetsOfIntegers.integerRepresentation.length; i++) {
            if (firstObject.integerRepresentation[i] == true || secondObject.integerRepresentation[i] == true) {
                unionOfTheTwoSetsOfIntegers.integerRepresentation[i] = true;
            } else {
                unionOfTheTwoSetsOfIntegers.integerRepresentation[i] = false;
            }
        }

        return unionOfTheTwoSetsOfIntegers;
    }

    public static IntegerSet intersection(IntegerSet firstObject, IntegerSet secondObject) {
        IntegerSet unionOfTheTwoSetsOfIntegers = new IntegerSet();

        for (int i = 0; i < unionOfTheTwoSetsOfIntegers.integerRepresentation.length; i++) {
            if (firstObject.integerRepresentation[i] == false || secondObject.integerRepresentation[i] == false) {
                unionOfTheTwoSetsOfIntegers.integerRepresentation[i] = false;
            } else {
                unionOfTheTwoSetsOfIntegers.integerRepresentation[i] = true;
            }
        }

        return unionOfTheTwoSetsOfIntegers;
    }

    public IntegerSet insertElement(int k) {
        this.integerRepresentation[k] = true;
        return this;
    }

    public IntegerSet deleteElement(int k) {
        this.integerRepresentation[k] = false;
        return this;
    }

    @Override
    public String toString() {
        String stringSample = "";
        int emptyString = 0;

        for (int i = 0; i < integerRepresentation.length; i++) {
            if (this.integerRepresentation[i] == true) {
                emptyString = 1;
                break;
            }
        }

        for (int i = 0; i < integerRepresentation.length; i++) {
            if (this.integerRepresentation[i] == true) {
                stringSample += " " + i;
            }
        }

        switch (emptyString) {
            case 0:
                stringSample = "---";
                return stringSample;
            default:
                return stringSample;
        }
    }

    public boolean isEqualTo(IntegerSet otherIntegerSet) {

        for (int i = 0; i < integerRepresentation.length; i++) {
            if (this.integerRepresentation[i] != otherIntegerSet.integerRepresentation[i]) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public static IntegerSet complement(IntegerSet universalSet, IntegerSet setToBeTested) {
        for (int i = 0; i < universalSet.integerRepresentation.length; i++) {
            if (universalSet.integerRepresentation[i] == true && setToBeTested.integerRepresentation[i] == true) {
                universalSet.integerRepresentation[i] = false;
            }
        }

        return universalSet;
    }

    public static IntegerSet difference(IntegerSet firstSet, IntegerSet secondSet) {

        IntegerSet differenceOfTheTwoSetsOfIntegers = new IntegerSet();

        for (int i = 0; i < firstSet.integerRepresentation.length; i++) {
            if (firstSet.integerRepresentation[i] == true && secondSet.integerRepresentation[i] == false) {
                differenceOfTheTwoSetsOfIntegers.integerRepresentation[i] = true;
            }
        }

        return differenceOfTheTwoSetsOfIntegers;
    }

    public static boolean disjoint(IntegerSet firstSet, IntegerSet secondSet) {

        IntegerSet differenceOfTheTwoSetsOfIntegers = new IntegerSet();
        boolean isDisjointed = true;

        for (int i = 0; i < firstSet.integerRepresentation.length; i++) {
            if (firstSet.integerRepresentation[i] == true && secondSet.integerRepresentation[i] == true) {
                isDisjointed = false;
            }
        }

        return isDisjointed;
    }

    //check if the partitions kength = length of the whole collection, and check if all partitions are disjointed. if so, do 
    //union and compare with integerRepresentation
    
    public boolean partition(IntegerSet firstSet, IntegerSet secondSet) {
        int counterOfNumbersFirstSet = 0;
        int counterOfNumbersSecondSet = 0;
        IntegerSet differenceOfTheTwoSetsOfIntegers = new IntegerSet();
        boolean isPartition = true;

        for (int i = 0; i < firstSet.integerRepresentation.length; i++) {
            if (firstSet.integerRepresentation[i] == true) {
                counterOfNumbersFirstSet++;
            }
            if (secondSet.integerRepresentation[i] == true) {
                counterOfNumbersSecondSet++;
            }
        }

        if (counterOfNumbersFirstSet + counterOfNumbersSecondSet == integerRepresentation.length) {
            for (int i = 0; i < firstSet.integerRepresentation.length; i++) {
                if (firstSet.integerRepresentation[i] == true && secondSet.integerRepresentation[i] == true) {
                    isPartition = false;
                }
                if (firstSet.integerRepresentation[i] == false && secondSet.integerRepresentation[i] == false) {
                    isPartition = false;
                }
            }
        } else {
            isPartition = false;
        }

        return isPartition;
    }
    
    public static boolean cartesianProduct(IntegerSet firstSet, IntegerSet secondSet) {

        IntegerSet differenceOfTheTwoSetsOfIntegers = new IntegerSet();
        boolean isDisjointed = true;

        for (int i = 0; i < firstSet.integerRepresentation.length; i++) {
            if (firstSet.integerRepresentation[i] == true && secondSet.integerRepresentation[i] == true) {
                isDisjointed = false;
            }
        }

        return isDisjointed;
    }
}
