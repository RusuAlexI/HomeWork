
package exercise.person.student.staff;


public class ExercisePersonStudentStaff {


    public static void main(String[] args) {
        Person firstPerson=new Person("Person 1","First example address");
        Person secondPerson=new Person("Person 2","Second example address");
        
        System.out.println(firstPerson.toString());
        System.out.println(secondPerson.toString());
        
        Student firstStudent=new Student(firstPerson.getName(),firstPerson.getAddress(),"First persons program",2018,4500.5);
        Student secondStudent=new Student(secondPerson.getName(),secondPerson.getAddress(),"Second persons program",2017,5500);
        
        System.out.println(firstStudent.toString());
        System.out.println(secondStudent.toString());
        
        Staff firstStaff=new Staff(firstPerson.getName(),firstPerson.getAddress(),"UTM",2000);
        Staff secondStaff=new Staff(secondPerson.getName(),secondPerson.getAddress(),"ULIM",1300);
        
        System.out.println(firstStaff.toString());
        System.out.println(secondStaff.toString());
        
    }
    
}
