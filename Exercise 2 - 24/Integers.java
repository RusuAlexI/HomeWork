import java.util.Scanner;
public class Integers {
	public static void main (String args[]){
	int i;
	Scanner a = new Scanner(System.in);
	System.out.println("Enter the values of the 5 numbers:");
	int array[]=new int[5];
	for (i=0; i<5; i++){
		array[i]=a.nextInt();
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
	
		
	/*if (a>b && a>c && a>d && a>e) {
	System.out.println(a+" is the biggest number");} else
	if (b>a && b>c && b>d && b>e) {
	System.out.println(b+" is the biggest number");} else
	if (c>b && c>b && c>d && c>e) {
	System.out.println(c+" is the biggest number");} else
	if (d>b && d>c && d>b && d>e) {
	System.out.println(a+" is the biggest number");} else
	if (e>b && e>c && e>d && e>a) {
	System.out.println(e+" is the biggest number");} */
	}
}