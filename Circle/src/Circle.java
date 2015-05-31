
public class Circle {
	public static double area(double radius ){
		double result=Math.PI*radius*radius;
		return result;
	}
	public static void main(String[]args){
			
		
		double radius = 2;		


		System.out.println("The Area of  Circle is:"+area(radius));
		radius=5;


		System.out.println("The Area of  Circle is:"+area(radius));
			
	}

}
