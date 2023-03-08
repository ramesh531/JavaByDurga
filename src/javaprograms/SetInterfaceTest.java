package javaprograms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterfaceTest {

	public static void main(String[] args) {

		/*
		 1.Set is child Interface of Collection
		 2.If we want to represent group of individual objects as a single entity where duplicates are not allowed and insertion order is not preserved then we go for Set.
		 3.Set(I) doesn't contain any new methods. We have to use only Collection Interface mehtods only

		 Collection(I)
		   Set(I)
		HashSet				SortedSet(I)
		 LinkedHashSet 		NavigableSet(I)
		   						TreeSet

		 HashSet (Class) 1.2V
		 1.Underlying DS is Hashtable
		 2.Duplicates are not allowed. If you add duplicates nothing will happen(no compile and run time error). It returns false
		 3.Insertion order is not preserved
		 4.Hetrogenous objects 
		 5.null insertion is possible
		 6.Implements serilizable and clonable interface.
		 7.For Search operations HashSet is best used.

		 Constructors
		 HashSet hs = new HashSet() //creates empty hs with default init capacity 16 and fill ratio (Load factor) of 0.75. After filling 75% then new Hashset is created

		 HashSet hs = new HashSet(int initialCapacity) //Creates Hashset with the initial Capacity and load factor .75

	 HashSet hs = new HashSet (int initCap,float loadFactor)
	 HashSet hs = new HashSet(Collection C)


		 *****
	 LinkedHashSet(class)1.4V is child class of HashSet
	 1.Underlying DS is Hashtable + LinkedList
	 2. duplicates are not allowed but insertion order is preserved.
	 3. LHS is best choice to develop cache based applications where insertion order is preserved and duplicates are not allowed

		 *****
	 SortedSet (I) V1.2
	1.Child Interface of Set
	2.If we want to represent a group of individual objects according to some sorting order and duplicates are not allowed then we should go for Sorted Set

	Methods
	public Object first(); 
	public Object last();
	headSet(Object)
	tailSet(Object)
	subSet(Object,Object)
	comparator() //returns comparator object which defines underlying sorting order . If we use default normal sorting order then it returns null.

		 ***
	 TreeSet(Class) 
	 1.Underlying DS is BalancedTree
	 2.Duplicates are not allowed.
	 3.Insertion order not preserved.
	 4.Sorting order
	 5.Hetrogenous objects are not allowed.If you add hetrogenous elements then  we get runtime expception ClassCastException
	 6.null is allowed but only once. 

	 Constructors
	 TreeSet ts = new TreeSet(); //creates empty ts object elements will be inserted based on default sorting order
	 if it's numbers ascending order
	 if it's String then alphabetical order  

	 TreeSet ts = new TreeSet(Compartor c) //creates empty ts object where elements will be inserted according to customized sorting order

	  TreeSet ts = new TreeSet(Collection c)

	  TreeSet ts = new TreeSet(SortedSet s)

	  null Accetance:
	  For non empty Treeset if we are trying to insert null then we get NullPointerException

	  For empty TreeSet we can insert null . After inserting null if you are trying to insert anything else then you get NullPointerException
		 ***


	  Comparable(I) pressent in java.lang package
	  It has comapreTo() method.
	  obj1.compareTo(obj2)
	  public int compareTo(Object obj)
	  "A".compareTo("Z"))
	  returns -ve if obj1 has to come before obj2   "A".compareTo("Z"))
	  returns +ve if obj1 has to come after obj2
	   "Z".compareTo("B"))
	  returns 0 if obj1 and obj2 are equal
	     "Z".compareTo("Z"))

	        "Z".compareTo("null")) // will get NPE

	   If we depend on default natural sorting order internall JVM will call comapreTo() method while inserting objects to the TreeSet. Hence the objects should be Comparable

		 ***
	   Comparator(I) java.util package
	   1.If we are not satisfied with default sorting order or if the default sorting order is not available(StringBuffer) then we can define our own customized sorting by using Comparator
	   2.Comparable meant for default natural sorting order.
	   Comparator meant for cusotmized sorting order

	   Methods
	   public int compare(Obj1,Obj2) // returns -ve iff obj1 has to come before Obj2
	   // returns +ve iff obj1 has to come after Obj2
	    // returns -ve iff obj1 and Obj2 are equal

	     public boolean equals()

	  Whenever we are implementing Comparator Interface compulsory we should provide implementation for compare() method.
	  Implementing equals() method is optional bcoz it's already available in every java clss from Object class through
	  inheritance

	    1.If we are depending on default natural sorting order then objects should be homogenous and Comparable otherwise we will get runtime exception ClassCastException

	    2.If we are defining our own customized sorting order then objects need not be homogenous and Comparable. We can insert hetrogenous and non comparable objects also.


		 ***
	   1. For predefined Comparable classes like String default natural sorting order already available . If we are not satisfied with that we can define our own sorting by Compartor Object
	   2. For predefined non comparable classes like StringBuffer, default natural sorting order not available. We can define required sorting by implementing Comparator interface.
	   3.For our own classes like Employee,Student etc the person who is writing our own class, he is responsible to define natural sorting order by implementing Comparable interface.
	   The person who is using our class, if he is not satisfed with default natural sorting order, then he can define his own sorting by using Comparator.

	   //
	    Comparable (I)
	    1.default natural sorting order
	    2.present in java.lang package
	    3.compareTo() method
	    4.All wrapper classes and String class implements Comparable

	    Comparator (I)
	   1.Customized sorting order
	   2.present in java.util package
	   3.compare() and equals() method
	   4.Collator and RuleBasedCollator class implements Comparator

	   //Set Implemented Classes

	    HashSet
	    1.Underlying DS is Hashtable
	    2.Insertion order not preseved
	    3.Sorting order not applicable
	    4.Hetrogenous objects are allowed
	    5.Duplicate objects are not allowed
	    6.Null acceptance only once.
	    
	    LinkedHashSet
	      1.Underlying DS is Hashtable + Linked List
	      2.Insertion order preseved
	      3.Sorting order not applicable
	      4.Hetrogenous objects are allowed
	      5.Duplicate objects are not allowed
	      6.Null acceptance only once.

	    TreeSet
	      1.Underlying DS is Balanced Tree
	      2.Insertion order not applicable
	      3.Sorting order is applicable (Natural sorting order
	      4.Hetrogenous objects are not allowed
	      5.Duplicate objects are not allowed
	      6.For empty TreeSet Null acceptance only once at the beginning. In other cases we get NPE 

		 */

		HashSet h = new HashSet();
		h.add("A");
		h.add("B");
		h.add("D");
		h.add("A");
		h.add("C");
		h.add(10);
		h.add(null);
		System.out.println("HashSet : "+h);
		System.out.println(h.add("A"));

		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("A");
		lhs.add("B");
		lhs.add("D");
		lhs.add("A");
		lhs.add("C");
		lhs.add(10);
		lhs.add(null);
		System.out.println("Linked HashSet : "+lhs);
		System.out.println(lhs.add("A"));


		TreeSet ts = new TreeSet();
		ts.add("A");
		ts.add("B");
		ts.add("D");
		ts.add("a");
		ts.add("c");
		//ts.add(10); //java.lang.ClassCastException
		//ts.add(null);
		System.out.println("Tree Set : "+ts);


		//
		TreeSet ts2 = new TreeSet();
		ts2.add(new StringBuffer("A"));
		ts2.add(new StringBuffer("Z"));
		ts2.add(new StringBuffer("B"));
		ts2.add(new StringBuffer("L"));

		System.out.println("TreeSet2 :"+ts2); //If we depend on default naturals sorting order then objects should be homogenous and comparable. Othewise we will get ClassCastException.An object said to be comparable if corresponding class implement Comparable. String class implements Comparable but StringBuffer doesn't implements the Comparable 


		System.out.println("A".compareTo("Z")); //-ve
		System.out.println("Z".compareTo("B")); //+ve
		System.out.println("A".compareTo("A")); //0
		System.out.println("A".compareTo(null)); //Null Pointer Exception

		//
		TreeSet ts3 = new TreeSet();
		ts3.add("B");
		ts3.add("Z"); //"Z".compareTo("B"); +ve
		ts3.add("A"); //"A".compareTo("B"); -ve
		System.out.println(ts3); //[A,B,Z]


		//To insert Integer Objects into TreeSet where sorting order is Descending order  





	}

}
