
public class Binary {
	public static void main(String[] args){
		int number=4;
		String binarynumber="";
		while(number>0){
			int binaryparts= number%2;
			binarynumber+=binaryparts;
			number/=2;
		}
		String reversedbinary= "";
		for(int i=binarynumber.length()-1;i>=0;i--){
			char c = binarynumber.charAt(i);
			reversedbinary+=c;
		}
		System.out.println(reversedbinary);
		System.out.println(binarynumber);

	}
}