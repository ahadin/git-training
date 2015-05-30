package apple;

public class apple 
{
	public static void main(String[] args)
	throws java.io.IOException
	{
		
	// added for loop
	
	for (int i=0;i<3 ;i++)
	{

		System.out.print("char:");
	char c = (char)System.in.read();
	// to avoid reading enter and next area in line. begin with a second line
	System.in.read();
	System.in.read();
		
	if (c=='a')
	{
		System.out.println("apple");
	}
	else if (c=='b')
	{
	System.out.println("ball");
	}
	else
	{System.out.println("I don't know");
	}

}
}
}




