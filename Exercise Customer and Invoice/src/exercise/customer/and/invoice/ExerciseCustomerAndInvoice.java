
package exercise.customer.and.invoice;


public class ExerciseCustomerAndInvoice {


    public static void main(String[] args) {
        Customer customer=new Customer(45, "John", 12);
        System.out.println(customer.toString());
        Invoice invoice=new Invoice(30, customer, 450);
        System.out.println(invoice.getAmountAfterDiscount());
        
    }
    
}
