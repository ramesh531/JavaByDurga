package javaprograms;

public class MaskCCNumber {

	public static void main(String[] args) {
		
		System.out.println(mask("1234-4444-2342-9878"));
	

	}
	
	public static String mask(String creditCard)
	{
		String x = "XXXX-XXXX-XXXX";
		
		return x+creditCard.substring(15,19);  
	}

}
