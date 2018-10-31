/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author User
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee emp1 = new Manager(); 
        Employee emp2 = new Employee(); 
        System.out.println(emp1.name); //comile-time (by the type of reference)
        System.out.println(emp2.name); //comile-time (by the type of reference)
        emp1.printName(); //run-time (by the type of object)
        emp2.printName(); //run-time (by the type of object)
    }
    
}
