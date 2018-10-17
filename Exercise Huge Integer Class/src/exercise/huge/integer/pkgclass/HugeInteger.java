package exercise.huge.integer.pkgclass;
//import java.lang.Object;
//import java.time.Clock;

import java.lang.reflect.Array;

//import java.time.LocalDate;

public class HugeInteger {

    private int hugeIntegerArray[] = new int[40];
    //LocalDate asd=LocalDate.parse(cs)

    public HugeInteger() {
        for (int i = 0; i < hugeIntegerArray.length; i++) {
            hugeIntegerArray[i] = 0;
        }
    }

    public HugeInteger parse(String stringToParse) {

        HugeInteger temporary=new HugeInteger();
        for (int i = 0; i < stringToParse.length(); i++) {
            if (Character.isDigit(stringToParse.charAt(i)) == true) {
                this.hugeIntegerArray[i] = Character.getNumericValue(stringToParse.charAt(i));
            } else {
                this.hugeIntegerArray[i] = 0;
            }
        }
        for (int i = 0; i < stringToParse.length(); i++) {
            System.out.print(this.hugeIntegerArray[i] + " ");
        }
        System.out.println("");
           
        return this;
    }

    public void add(HugeInteger numberToAdd) {
        
        int sizeOfBiggerArray = this.hugeIntegerArray.length;
        if (numberToAdd.hugeIntegerArray.length > sizeOfBiggerArray) {
            sizeOfBiggerArray = numberToAdd.hugeIntegerArray.length;
        }
        int rest = 0;
        int[] addedArrays = new int[sizeOfBiggerArray+1];
        
        if(numberToAdd.hugeIntegerArray[0]+this.hugeIntegerArray[0]<9){
        for (int i = sizeOfBiggerArray-1; i >= 0; i--) {
            int sum=Array.getInt(this.hugeIntegerArray, i) + Array.getInt(numberToAdd.hugeIntegerArray, i) + rest;
            //System.out.println(Array.getInt(numberToAdd.hugeIntegerArray, i));
            if (sum < 10) {
               
                addedArrays[i] = sum;
                rest = 0;
            } else {
                addedArrays[i] = sum % 10;
                rest = 1;
            }
        }} else {
            for (int i = sizeOfBiggerArray-1; i >= 0; i--) {
            int sum=Array.getInt(this.hugeIntegerArray, i) + Array.getInt(numberToAdd.hugeIntegerArray, i) + rest;
            
            if (sum < 10) {
               
                addedArrays[i+1] = sum;
                rest = 0;
            } else {
                addedArrays[i+1] = sum % 10;
                rest = 1;
                addedArrays[0]=rest;
            }
        }}
            
        for (int i = 0; i < addedArrays.length; i++) {
            System.out.print(addedArrays[i] + " ");
        }
        System.out.println("\n");

    }

    public void subtract(HugeInteger numberToSubtract) {

        int sizeOfBiggerArray = this.hugeIntegerArray.length;
        int sizeOfSmallerArray = numberToSubtract.hugeIntegerArray.length;
        if (numberToSubtract.hugeIntegerArray.length > sizeOfBiggerArray) {
            sizeOfBiggerArray = numberToSubtract.hugeIntegerArray.length;
            sizeOfSmallerArray = this.hugeIntegerArray.length;
        }

        int rest = 0;
        HugeInteger subtractedArrays = new HugeInteger();
        for (int i = sizeOfBiggerArray - 1; i >= 0; i--) {
            int substract=Array.getInt(this.hugeIntegerArray, i) - Array.getInt(numberToSubtract.hugeIntegerArray, i) + rest;
            if (substract >= 0) {
                subtractedArrays.hugeIntegerArray[i] = Array.getInt(this.hugeIntegerArray, i) - Array.getInt(numberToSubtract.hugeIntegerArray, i) + rest;
                rest = 0;
            } else {
                subtractedArrays.hugeIntegerArray[i] = (Array.getInt(this.hugeIntegerArray, i) - Array.getInt(numberToSubtract.hugeIntegerArray, i) + rest) + 10;
                rest = 1;
            }
        }
        for (int i = 0; i < subtractedArrays.hugeIntegerArray.length; i++) {
            System.out.print(subtractedArrays.hugeIntegerArray[i] + " ");
        }
        System.out.println("\n");
    }

    public boolean isEqualTo(HugeInteger testHugeInteger) {

        for (int i = 0; i < this.hugeIntegerArray.length; i++) {
            if (this.hugeIntegerArray[i] != testHugeInteger.hugeIntegerArray[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean isNotEqualTo(HugeInteger testHugeInteger) {

        if (isEqualTo(testHugeInteger) == true) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isGreaterThan(HugeInteger testHugeIntegerClass) {
        if (this.hugeIntegerArray.length > testHugeIntegerClass.hugeIntegerArray.length) {
            return true;
        } else if (this.hugeIntegerArray.length < testHugeIntegerClass.hugeIntegerArray.length) {
            return false;
        } else {
            for (int i = 0; i < this.hugeIntegerArray.length; i++) {
                if (hugeIntegerArray[i] > testHugeIntegerClass.hugeIntegerArray[i]) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public boolean isLesserThan(HugeInteger testHugeIntegerClass) {
        if (this.hugeIntegerArray.length < testHugeIntegerClass.hugeIntegerArray.length) {
            return true;
        } else if (this.hugeIntegerArray.length > testHugeIntegerClass.hugeIntegerArray.length) {
            return false;
        } else {
            for (int i = 0; i < this.hugeIntegerArray.length; i++) {
                if (hugeIntegerArray[i] < testHugeIntegerClass.hugeIntegerArray[i]) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public boolean isGreaterThanOrEqualTo(HugeInteger testHugeIntegerClass) {
        if (isEqualTo(testHugeIntegerClass) == true) {
            return true;
        } else if (this.hugeIntegerArray.length > testHugeIntegerClass.hugeIntegerArray.length) {
            return true;
        } else if (this.hugeIntegerArray.length < testHugeIntegerClass.hugeIntegerArray.length) {
            return false;
        } else {
            for (int i = 0; i < this.hugeIntegerArray.length; i++) {
                if (hugeIntegerArray[i] > testHugeIntegerClass.hugeIntegerArray[i]) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public boolean isLessThanOrEqualTo(HugeInteger testHugeIntegerClass) {
        if (isEqualTo(testHugeIntegerClass) == true) {
            return true;
        } else if (this.hugeIntegerArray.length < testHugeIntegerClass.hugeIntegerArray.length) {
            return true;
        } else if (this.hugeIntegerArray.length > testHugeIntegerClass.hugeIntegerArray.length) {
            return false;
        } else {
            for (int i = 0; i < this.hugeIntegerArray.length; i++) {
                if (hugeIntegerArray[i] < testHugeIntegerClass.hugeIntegerArray[i]) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "";
    }

    public boolean isZero() {
        for (int i = 0; i < this.hugeIntegerArray.length; i++) {
            if (this.hugeIntegerArray[i] != 0) {
                return false;
            }
        }
        return true;
    }

}
