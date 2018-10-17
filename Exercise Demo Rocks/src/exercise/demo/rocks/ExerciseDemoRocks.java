
package exercise.demo.rocks;


public class ExerciseDemoRocks {


    public static void main(String[] args) {
       Rock firstRock=new Rock(5, 45);
       Rock secondRock=new IgneousRock(6, 34);
       Rock thirdRock=new MetamorphicRock(7, 78);
       Rock fourthRock=new SedimentaryRock(6, 98);
       IgneousRock igneousRock=new IgneousRock(5, 67);
       SedimentaryRock sedimentaryRock=new SedimentaryRock(9, 546);
       MetamorphicRock metamorphicRock=new MetamorphicRock(76, 234);
       
        System.out.println(firstRock.toString());
        System.out.println(secondRock.toString());
        System.out.println(thirdRock.toString());
        System.out.println(fourthRock.toString());
        System.out.println(igneousRock.toString());
        System.out.println(sedimentaryRock.toString());
        System.out.println(metamorphicRock.toString());
    }
    
}
