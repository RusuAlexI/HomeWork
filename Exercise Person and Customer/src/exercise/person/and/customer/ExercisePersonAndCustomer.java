
package exercise.person.and.customer;


public class ExercisePersonAndCustomer {


    public static void main(String[] args) {
        Person firstPerson=new Person("firstPersonName", "firstPersonAddress", "111-1111-1111");
        Person secondPerson=new Customer(1, true, "secondPersonName", "secondPersonAddress", "222-2222-2222");
        Customer firstCustomer=new Customer(2,false,"firstCustomer", "firstCustomerAddress", "333-3333-3333");
        System.out.println(firstPerson.toString());
        System.out.println(secondPerson.toString());
        System.out.println(firstCustomer.toString());
    }
    
}
