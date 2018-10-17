package exercise.set.of.integers;

public class ExerciseSetOfIntegers {

    public static void main(String[] args) {
        /*IntegerSet integ=new IntegerSet();
       integ.union(integ, integ);*/

        IntegerSet integerSet1 = new IntegerSet();
        System.out.println("intergerSet1 is empty: " + integerSet1);
        IntegerSet integerSet2 = new IntegerSet();
        System.out.println("empty set union  is empty set:  " + IntegerSet.union(integerSet1, integerSet2));
        IntegerSet universe = new IntegerSet();
        for (int i = 0; i < 100; i++) {
            universe.insertElement(i);
        }
        System.out.println("universe: " + universe);
        System.out.println("empty set union universe = universe:  " + integerSet1.union(integerSet1, universe));
        System.out.println("empty set intersection universe = empty set:  " + integerSet1.intersection(integerSet1, universe));
        integerSet1.insertElement(0);
        System.out.println("intergerSet1 has only element 0: " + integerSet1);
        System.out.println("intergerSet1 != integerSet2: isEqual: " + integerSet1.isEqualTo(integerSet2));
        System.out.println("intergerSet2 != integerSet1: isEqual: " + integerSet2.isEqualTo(integerSet1));
        integerSet2.insertElement(0);
        System.out.println("intergerSet1 == integerSet2: isEqual: " + integerSet1.isEqualTo(integerSet2));
        integerSet1.deleteElement(0);
        System.out.println("intergerSet1 is empty: " + integerSet1);
        IntegerSet.union(universe, universe);
        
        System.out.println("universe: " + universe);
        IntegerSet integerSet3 = new IntegerSet();
        for (int i = 10; i < 20; i++) {
            integerSet3.insertElement(i);
        }
        
        System.out.println("intergerSet3 before complement with universe: " + integerSet3);
        System.out.println("intergerSet3 complement universe: " + integerSet3.complement(universe, integerSet3));
        
        IntegerSet integerSet4 = new IntegerSet();
        for (int i = 15; i < 25; i++) {
            integerSet4.insertElement(i);
        }
        System.out.println("intergerSet3 before difference with integerSet4: " + integerSet3);
        System.out.println("intergerSet4: " + integerSet4);
        System.out.println("intergerSet3 difference with integerSet4: " + integerSet3.difference(integerSet3, integerSet4));
        
        System.out.println("intergerSet3: " + integerSet3);
        System.out.println("intergerSet4: " + integerSet4);
        System.out.println("intergerSet3 is disjointed with integerSet4: "+integerSet3.disjoint(integerSet3, integerSet4));
        IntegerSet integerSet5 = new IntegerSet();
        for (int i = 20; i < 30; i++) {
            integerSet5.insertElement(i);
        }
        System.out.println("intergerSet5: " + integerSet5);
        System.out.println("intergerSet3 is disjointed with integerSet5: "+integerSet3.disjoint(integerSet3, integerSet5));
        
        IntegerSet integerSet6 = new IntegerSet();
        for (int i = 0; i < 50; i++) {
            integerSet6.insertElement(i);
        }
        IntegerSet integerSet7 = new IntegerSet();
        for (int i = 50; i < 100; i++) {
            integerSet7.insertElement(i);
        }
        
        System.out.println("intergerSet6: " + integerSet6);
        System.out.println("intergerSet7: " + integerSet7);
        System.out.println("intergerSet6 and integer7 is partition of integerRepresentation: " + integerSet6.partition(integerSet6, integerSet7));
        System.out.println("intergerSet5 and integer7 is partition of integerRepresentation: " + integerSet6.partition(integerSet5, integerSet7));

    }

}
