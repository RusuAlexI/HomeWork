public class Odd_Integers {
	public static void main (String args[]){
		int i, product=1, product2, product3=1;
		
		System.out.println("The odd numbers are:");
		for(i=1; i<=15;i++){ //goes through the array of nubers and checks if they are odd or even
			if(i%2!=0) {System.out.print(i+" "); product*=i;} //prints each number and then multiplies it with the rest of the od numbers
	}
	
	System.out.println("\nThe product of odd integers (from  to 15) is "+product);
	
	//Long way:
	product2=1*3*5*7*9*11*13*15;
	System.out.println("The product is "+product);
	
	//looooong way:
	
	if (1%2!=0) product3*=1;
	if (2%2!=0) product3*=2;
	if (3%2!=0) product3*=3;
	if (4%2!=0) product3*=4;
	if (5%2!=0) product3*=5;
	if (6%2!=0) product3*=6;
	if (7%2!=0) product3*=7;
	if (8%2!=0) product3*=8;
	if (9%2!=0) product3*=9;
	if (10%2!=0) product3*=10;
	if (11%2!=0) product3*=11;
	if (12%2!=0) product3*=12;
	if (13%2!=0) product3*=13;
	if (14%2!=0) product3*=14;
	if (15%2!=0) product3*=15;
	System.out.println("The product is "+product3);
}
}