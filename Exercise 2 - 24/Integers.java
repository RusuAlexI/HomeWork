import java.util.Scanner; //Imported this class to be anle to use System.in command and erad the inputs from the user
public class Integers { //Integers - the name I gave this class
	public static void main (String args[]){
	int ifscan = new Scanner(System.in); //I declared the "scan" variable to be able to register the user input

	System.out.println("Enter the values of the 5 numbers:");
	int array[]=new int[5]; //I declared the "array" array in which I will input the 5 number that are needed to be analised
	for (i=0; i<5; i++){      
		array[i]=scan.nextInt(); //I used "for" to go through the 5 numbers one by one and, using "scan.nextInt()", assign them to the "array" array
	}
	int min=array[0]; //I declared the min and max variable that I will use to find the biggest and smallest numbers
	int max=array[0];
	
	System.out.print("\n The Values are:\n");
	for (i=0; i<5; i++){
		System.out.print(" "+ array[i]); //prints all the numbers I input-ed
	}
	
	for(i=0; i<5; i++){
		if (min>array[i]) min=array[i]; //found the smallest and biggest numbers and assigned them to min and max
		if (max<array[i]) max=array[i];
			}
			
	System.out.println("\nThe biggest number is "+max+" and the smallest number is "+min);
	
	//Second method:
	
	int q,w,e,r,t; //the 5 variables I will work with
	
	System.out.println("Enter the first number:"); //Assigned the inuts to each variable using scan.nextInt()
	q=scan.nextInt();
	System.out.println("Enter the second number:");
	w=scan.nextInt();
	System.out.println("Enter the third number:");
	e=scan.nextInt();
	System.out.println("Enter the fourth number:");
	r=scan.nextInt();
	System.out.println("Enter the fifth number:");
	t=scan.nextInt();
	System.out.println("\n");

		
	if (q>w && q>e && q>r && q>t) { //using "if - else" I found which number is biggest
	System.out.println(q+" is the biggest number");} else
	if (w>q && w>e && w>r && w>t) {
	System.out.println(w+" is the biggest number");} else
	if (e>q && e>w && e>r && e>t) {
	System.out.println(e+" is the biggest number");} else
	if (r>q && r>w && r>e && r>t) {
	System.out.println(r+" is the biggest number");} else
	if (t>q && t>w && t>e && t>r) {
	System.out.println(e+" is the biggest number");} 
	
	System.out.println("\n");
	
	if (q<w && q<e && q<r && q<t) { //using "if - else" I found which number is smallest
	System.out.println(q+" is the smaller number");} else
	if (w<q && w<e && w<r && w<t) {
	System.out.println(w+" is the smaller number");} else
	if (e<q && e<w && e<r && e<t) {
	System.out.println(e+" is the smaller number");} else
	if (r<q && r<w && r<e && r<t) {
	System.out.println(r+" is the smallest number");} else
	if (t<q && t<w && t<e && t<r) {
	System.out.println(t+" is the smallest number");} 
	}
}