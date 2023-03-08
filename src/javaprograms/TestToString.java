package javaprograms;

import java.util.function.Predicate;

public class TestToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> p;

		TestToString t = new TestToString();
		System.out.println(t);// It calls Objects class ToString method
		System.out.println(t.toSring());
		
		System.out.println("Hello" + t);
	}
	
	public String toSring()
	{ 
		return "Test Object";
	}

}
