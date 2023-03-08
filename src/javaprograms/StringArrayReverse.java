package javaprograms;

import java.util.TreeSet;

public class StringArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names = {"Ramesh","Lakshmi","Kushaal","Ramesh"};
		
		//Sort the String array
		TreeSet<String> ts = new TreeSet<String>();
		for(int i=0;i<names.length;i++)
		{
			ts.add(names[i]);
		}
		
		System.out.println("TreeSet after Sorted" + ts );
		//Conver the treeset to Object Array
		Object[] sortedNames = ts.toArray();
		for(Object obj:sortedNames)
		{
			System.out.println(obj);
		}
		

	}

}
