
package exercise.customer.and.account;


public class ExerciseCustomerAndAccount {


    public static void main(String[] args) {
        Customer customer=new Customer(4,"Customer1",'M');
        System.out.println(customer.toString());
        Account account=new Account(7,customer,500);
        System.out.println(account.toString());
        account.deposit(75);
        System.out.println(account.toString());
        account.withdraw(80);
        System.out.println(account.toString());
    }
    
}
