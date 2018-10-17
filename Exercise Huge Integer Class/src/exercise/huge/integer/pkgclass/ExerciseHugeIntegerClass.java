
package exercise.huge.integer.pkgclass;


public class ExerciseHugeIntegerClass {


    public static void main(String[] args) {
        HugeInteger huge=new HugeInteger();
        System.out.println("hugeInteger1:");
        huge.parse("7585875424267868652456");
        //huge.parse("4585875424247868652456");
        System.out.println("hugeInteger2:");
        HugeInteger huge2=new HugeInteger();
        huge2.parse("4563434532423434233249");
        System.out.println("hugeInteger1 add to hugeInteger2:");
        huge.add(huge2);
        System.out.println("hugeInteger1 subtract hugeInteger2:");
        huge.subtract(huge2);
        System.out.println("hugeInteger1 is equal to hugeInteger2:"+huge.isEqualTo(huge2));
        System.out.println("hugeInteger1 is greater tthan hugeInteger2:"+huge.isGreaterThan(huge2));
        System.out.println("hugeInteger1 is greater or equal than hugeInteger2:"+huge.isGreaterThanOrEqualTo(huge2));
        System.out.println("hugeInteger1 is lesser or equal than hugeInteger2:"+huge.isLessThanOrEqualTo(huge2));
        System.out.println("hugeInteger1 is lesser  than hugeInteger2:"+huge.isLesserThan(huge2));
        System.out.println("hugeInteger1 is not equal to hugeInteger2:"+huge.isNotEqualTo(huge2));
        
        
        HugeInteger huge3=new HugeInteger();
        huge3.parse("45858754242u7868652456");
        System.out.println(huge.isEqualTo(huge3));
        
        
        
        
    }
    
}
