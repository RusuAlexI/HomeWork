import java.util.Scanner; //Imported this class to be anle to use System.in command and erad the inputs from the user
public class MinMax {
	public static void main(String[] args) {
		int i,j,k;
		Scanner scan = new Scanner(System.in); //I declared the "scan" variable to be able to register the user input
		
		System.out.print("What is the first number?\n");
		i=scan.nextInt();
		
		System.out.print("What is the first number?\n");
		j=scan.nextInt();
		
		k=i-j; //I assign k the value of the operation,and then I will use it to check if i is bigger or smaller than j
		System.out.println(k);
		
		if(k>0)	System.out.println(i+" is the biggest and "+j+" is smallest"); else 
				System.out.println(i+" is the smallest and "+j+" is the biggest");
		


	}
}