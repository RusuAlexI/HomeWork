    
package exercise.mycomplex;


public class ExerciseMyComplex {


    public static void main(String[] args) {
        MyComplex myComplex=new MyComplex(4, 3);
        MyComplex myComplex2=new MyComplex(4, 3);
        MyComplex myComplex3=new MyComplex(7, 2);
        System.out.println("The first complex number is "+myComplex.toString());
        System.out.println("The 4 in my complex number is Imaginary: "+myComplex.isImaginary());
        System.out.println("The 4 in my complex number is Real: "+myComplex.isReal());
        
        System.out.println("The second complex number is "+myComplex2.toString());
        System.out.println("The third complex number is "+myComplex3.toString());
        
        System.out.println("The first number and 6+3i are equal:"+myComplex.equals(6, 3));
        System.out.println("The first and second number are equals:"+myComplex.equals(myComplex2));
        System.out.println("The first and third number are equals:"+myComplex.equals(myComplex3));
        
        System.out.println("The magnitude of 4+3i is "+myComplex.magnitude());
        System.out.println("The argument of 4+3i is "+myComplex.argument());
        System.out.println("(4+3i) + (7+2i) is "+myComplex.add(myComplex3));
        System.out.println("(4+3i) + (7+2i) (making a new instance) is "+myComplex.addNew(myComplex3));
        System.out.println("(4+3i) - (7+2i) is "+myComplex.subtract(myComplex3));
        System.out.println("(4+3i) - (7+2i) (making a new instance) is "+myComplex.substractNew(myComplex3));
        System.out.println("(4+3i) * (7+2i) is "+myComplex.multiply(myComplex3));
        System.out.println("(4+3i) + (7+2i) (making a new instance) is "+myComplex.addNew(myComplex3));
        System.out.println("4+3i conjugate is "+myComplex.conjugate());
        
    }
    
}
