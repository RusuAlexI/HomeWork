/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.util.Scanner;
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
//We initialise the "total" variable of type double, in order to then use it to calculate the data entered
double total = 0;



//display menu
System.out.println("1 - Product 1, $2.98");
System.out.println("2 - Product 2, $4.50");
System.out.println("3 - Product 3, $9.98");
System.out.println("4 - Product 4, $4.49");
System.out.println("5 - Product 5, $6.87");
System.out.println("6 - Exit program");
System.out.println("Enter product number: ");
int productnumber=input.nextInt();
while(productnumber<6 && productnumber>0) //we do the calculations WHILE the input is not 6 (or something other)
    {

//test if we need to exit the program
        if(productnumber>=6 && productnumber<=0){
        break;

            }
///We read the quantity sold
System.out.print("Enter quantity sold: ");
int quantitySold=input.nextInt();
//We use a switch statement to determine the retail price for each product.
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
//We display the resut
System.out.println("The total retail value of all products sold: "+total);
//after we finish the loop, we ask again for the next input, to see if we need to stop the program
System.out.println("1 - Product 1, $2.98");
System.out.println("2 - Product 2, $4.50");
System.out.println("3 - Product 3, $9.98");
System.out.println("4 - Product 4, $4.49");
System.out.println("5 - Product 5, $6.87");
System.out.println("6 - Exit program");
System.out.print("Enter product number: ");
productnumber=input.nextInt();
}   


    }
    
}

