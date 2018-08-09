import java.util.Scanner;
public class Integers {
	public static void main (String args[]){
	int i;
	Scanner scan = new Scanner(System.in);

	System.out.println("Enter the values of the 5 numbers:");
	int array[]=new int[5];
	for (i=0; i<5; i++){
		array[i]=scan.nextInt();
	}
	int min=array[0];
	int max=array[0];
	
	System.out.print("\n The Values are:\n");
	for (i=0; i<5; i++){
		System.out.print(" "+ array[i]);
	}
	
	for(i=0; i<5; i++){
		if (min>array[i]) min=array[i];
		if (max<array[i]) max=array[i];
			}
			
	System.out.println("\nThe biggest number is "+max+" and the smallest number is "+min);
	
	int q,w,e,r,t;
	
	System.out.println("Enter the first number:");
	q=scan.nextInt();
	System.out.println("Enter the second number:");
	w=scan.nextInt();
	System.out.println("Enter the third number:");
	e=scan.nextInt();
	System.out.println("Enter the fourth number:");
	r=scan.nextInt();
	System.out.println("Enter the fifth number:");
	t=scan.nextInt();

		
	if (q>w && q>e && q>r && q>t) {
	System.out.println(q+" is the biggest number");} else
	if (w>q && w>e && w>r && w>t) {
	System.out.println(w+" is the biggest number");} else
	if (e>q && e>w && e>r && e>t) {
	System.out.println(e+" is the biggest number");} else
	if (r>q && r>w && r>e && r>t) {
	System.out.println(r+" is the biggest number");} else
	if (t>q && t>w && t>e && t>r) {
	System.out.println(e+" is the biggest number");} 
	}
}