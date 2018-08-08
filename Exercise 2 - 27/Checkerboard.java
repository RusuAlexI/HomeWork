public class Checkerboard {
	public static void main (String[] args){
	
		System.out.println("* * * * * * * *");
		System.out.println(" * * * * * * * *");
		System.out.println("* * * * * * * *");
		System.out.println(" * * * * * * * *");
		System.out.println("* * * * * * * *");
		System.out.println(" * * * * * * * *");
		System.out.println("* * * * * * * *");
		System.out.println(" * * * * * * * *");
		System.out.println("\n");
		int i=0;
		for(i=0; i<8; i++){
			if (i%2==0)
				System.out.println("* * * * * * * *"); else
				System.out.println(" * * * * * * * *");
		
		}
		
		System.out.println("\n");
		
		for (i=0; i<9; i++){
		if (i==0 || i==8)
			System.out.println("*********"); else
				System.out.println("*       *");
		}
		
	}
}