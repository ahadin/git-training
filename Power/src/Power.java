
public class Power
{

public static void main(String args[])
{
	int e;
	int result;
	// why int is included with the for expression?
	for ( int i=0; i<10; i++)
	{
		result = 1;
		e = i;
		 System.out.println("entering while i="+i);
		while (e >0){
			 System.out.println("e="+e);
			 System.out.println("before result ="+result);
			System.out.print(result+"*"+2);
			result *= 2;
			 
			System.out.println("="+result);
			System.out.println("after result ="+result);
			e--;
			System.out.println("e--="+e);
			
		}
		System.out.println("2 to the "+i+ "power is " + result);
				
	}
	e=5;
	while (e >0){
		 System.out.println("e="+e);
		e--;
		
	}
}
}
