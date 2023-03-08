package javaprograms;

import java.util.Comparator;
import java.util.TreeSet;

public class StringObjectsReverseAlphaOrder implements Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> ts = new TreeSet<String>(new StringObjectsReverseAlphaOrder());

		ts.add("Ramesh");
		ts.add("Kushaal");
		ts.add("Lakshmi");
		ts.add("Sunny");
		ts.add("Kushaal");
		
		System.out.println("TreeSet in reverse alphabetical order : "+ts);
	}
	
	public int compare(Object obj1,Object obj2)
	{
		String s1 = (String) obj1;
		String s2 = obj2.toString();
		 return -s1.compareTo(s2);
		// return s1.compareTo(s2);
	
	}
	
	

}
