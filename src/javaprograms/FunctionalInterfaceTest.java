package javaprograms;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaceTest {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(15);
		al.add(10);
		al.add(20);
		al.add(25);
		
		System.out.println("ArrayList : "+al);
		
		
	   // Print the  event numbers from the list
		Predicate<Integer> p=i->i%2==0;
		for(Integer i:al)
		{
			
			System.out.println(p.test(i));
		}
		
		//Add 12 to all the list elements
		Function<Integer,Integer> f = i->i+12;
	
		for(Integer i:al)
		{
			
			System.out.println(f.apply(i));
		}
		
		
		//f.apply(null);

	}

}
