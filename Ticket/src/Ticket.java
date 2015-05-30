import java.util.Scanner;
import java.io.InputStream;
import java.util.Scanner;
public class Ticket {
	public static void main(String []args)
	{
	int a=2;
	int b=10;
	int c=65;
	int age;
	

	Scanner s=new Scanner(System.in);
	System.out.print("Enter Age:");
	
     age = s.nextInt();
	
	if (age<2)
	
	{
		System.out.println("ticket free");
		}
	else if( (age>=2)&(age<65))
	{ 
		System.out.println("charge full prize");
		}
	else 
	{
		System.out.println("senior Citizen");
		}
	
	
	
	
			
	}
	
}
