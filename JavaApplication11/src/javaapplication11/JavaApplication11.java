
package exercise.pkg4.pkg17;
import java.util.Scanner; //needed to use the Scanner command   

public class Exercise417 {

    public static void main(String[] args) {
        //We use Scanner for keyBoard input, assigning it the "input" name
Scanner input =new Scanner(System.in);
//We initialise the "total" variable of type double, in order to then use it to calculate the data entered
double total;
// Use a sentinel-controlled loop to determine when the
//program should stop looping and display the final results.
while(true){
//display menu
System.out.println("1 - Product 1, $2.98");
System.out.println("2 - Product 2, $4.50");
System.out.println("3 - Product 3, $9.98");
System.out.println("4 - Product 4, $4.49");
System.out.println("5 - Product 5, $6.87");
System.out.println("6 - Exit program");
System.out.print("Enter product number: ");
int productnumber=input.nextInt();
//exit program
if(productnumber>=6){
break;

}
///Enter quantity sold
System.out.print("Enter quantity sold: ");
int quantitySold=input.nextInt();
//use a switch statement to determine the retail price
//for each product.
switch(productnumber){
case 1:
total+=2.98*quantitySold;
break;
case 2:
total+=4.50*quantitySold;
break;
case 3:
total+=9.98*quantitySold;
break;
case 4:
total+=4.49*quantitySold;
break;
case 5:
total+=6.87*quantitySold;
break;
}
//display resut
System.out.println("\nThe total retail value of all products sold: $"+total);
}


    }
    
}
