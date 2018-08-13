public class EJavaGuru{
	
	
	//public void main (String[] args) - needs to be "static"
	//public void main (String  args[]) -main needs to be "static"
	static public void main (String[] array) //The right choice
	//public static void main (String args) - Returned an error - because String needed brackets []
	//static public main (String args[]) - Returned an error - could not find or load main class EJavaGuru
	{
		System.out.println("EJavaGuru");
	}
}