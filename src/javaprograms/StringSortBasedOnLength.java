package javaprograms;

import java.util.Comparator;
import java.util.TreeSet;

public class StringSortBasedOnLength implements Comparator {

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet(new StringSortBasedOnLength());
		ts.add("AAA");
		ts.add("AA");
		ts.add("B");
		ts.add(new StringBuffer("ZZZ"));
		ts.add("XX");
		ts.add(new StringBuffer("A"));
		ts.add("AAA");
		ts.add("AA");
		ts.add("B");
		
		System.out.println("TreeSet after customized sort Order: "+ts);
		
	}
	
	public int compare(Object obj1,Object obj2)
	{
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		
		int l1 = s1.length();
		int l2= s2.length();
		
		if(l1<l2)
			return -1;
		else if(l1<l2)
			return +1;
		else //l1==l2
			return s1.compareTo(s2);
				
	}

}
