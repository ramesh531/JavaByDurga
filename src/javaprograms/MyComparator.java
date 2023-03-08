package javaprograms;

import java.util.Comparator;
import java.util.TreeSet;

public class MyComparator implements Comparator

{
	 public int compare(Object obj1,Object obj2)
	 {
		 Integer I1 = (Integer)obj1;
		 Integer I2 = (Integer)obj2;
		 if(I1<I2)
			 return +1;
		 else if(I1>I2)
			 return -1;
		 else 
			 return 0;
		 
		 
		 /*
		  return I1.compareTo(I2) // Ascending Order
		  return -I1.compareTo(I2) // Descending Order
		  return I2.compareTo(I1) // Descending order
		  return -I2.compareTo(I1) //Ascending order
		  return +1  // [10,5,20,15,5]Insertion order
		  return -1  // [5,15,20,5,10]Reverse of Insertion order
		  return 0  // [10] //only first element will be inserted all other elements will be considered as duplicates
		  */
					 
	 }
	 
	 public static void main(String[] args)
	 {
		 TreeSet ts = new TreeSet();
		 ts.add(10);
		 ts.add(5);
		 ts.add(20);
		 ts.add(15);
		 ts.add(5);
		 
		 System.out.println("TreeSet in natural sorting order(Ascending) : " + ts);
		 
		 TreeSet ts2 = new TreeSet(new MyComparator());
		 ts2.add(10);
		 ts2.add(5);
		 ts2.add(20);
		 ts2.add(15);
		 
		 System.out.println("TreeSet customized sorting order(Descending) : " + ts2);
		 
		 
	 }
}
