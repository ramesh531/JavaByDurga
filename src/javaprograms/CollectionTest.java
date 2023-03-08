package javaprograms;

public class CollectionTest {
	
	
	/*
	Limitation of Array 
	1. Arrays are fixed in Size 
	Student s[] = new Student[1000];
	2. Arrays can hold only homogeneous data ex: int , float, Student . You can resolve this by using Object class
	Object []obj = new Object[100];
	obj[0] = new Student();
	obj[1]= new Customer();
	
	3. Arrays not implemented by underlying standard data structure.Readymade support is not there. insert,search,delete etc.
	
	Collection
	1)Growable in nature. Based on requriement we can increase or decrease the size
	2)It can hold both homogenous and hetrogenous elements
	3)Every collection class is implemented based on some standard data structure. Hencr readymade support is available for every requirement
	
	Arrays
	1)Fixed in Size
	2)W.r.t Memory not recommended.
	3)W.r.t Performance wise good
	4)Only homogenous
	5)REadymade support not available (insert,search)
	6)Can hold both Primitives and object types
	
	
	Collections
	1)Growable in nature
	2)W.r.t Memory  recommended.
	3)W.r.t Performance wise is not good
	4)Both homogenous & hetrogenous
	5)implemented on Standard DS
	6)Only can hold objects and not primitives
	
	
	Collection is a group of individual objects as a single entity then you go for collection
	
	Collection Framework defines group of classes and interfaces 
	
	Collection Framework there are 9 key interfaces 
	
	1. Collection 
	a.interface defines the most common methods which are applicable for any collection object
	b.. It's considered as root interface
	
	Diff b/w Collection and Collections
	Collection is an interface which can be used to represent group of individual objects as single entity
	Collections is an utility class present in java.util package to define serveral utility methods (Sorting,Seraching) for collection objects
	
	2.List (I) - duplicates are allowed and insertion order is preserved. Implemented classes
	
	ArrayList,LinkedList,Vector,Stack
	
	3.Set (I) - duplicates are not allowed and insertion order is not preserved. Implementation Classes
	HashSet -->LinkedHashSet
	
	Diff b/w List and Set
	
	4.SortedSet (I) is child Interface of Set
   Want to represent group of individual objects as single entity where duplicated are not allowed but all objects should be inserted according to some sorting order 
   
   5.NavigableSet (I) is child Interface of SortedSet
   TreeSet is implementation class for NavigaleSet
   
   6. Queue (I) is child interface of Collection
   Implementation classes PriorityQueue,BlockingQueue, LinkedBlockingQueue,PriorityBlockingQueue
	
	If you want to represent a group of individual objects prior to processing then we should go for Queue 
	
	7.Map (I) is not child of Collection(I)
	To represent group of individual objects as Key value pairs and then go for Map.
	Duplicate keys are not allowed but values can be duplicated.
	
	HashMap,LinkedHashMap, WeakHashMap, IdentityHashMap,Hashtable,Properties 
	 
	8.SortedMap(I)  is child interface of SortedMap
	If we want to represent a group of key value pairs according to some sorting order of keys then we should go for SortedMap
	
	9. NavigableMap(I) is child interface of SortedMap(I)
	TreeMap is the implementation class for NavigableMap
	 
	 It defines several utility methods for navigation purpose
	
	
	Comparable(I) default sorting order     public boolean compareTo()
	Comparator(I) Customized sorting order  public int compare(obj1,obj2)
	
	Cursors
	Enumeration(I)
	Iterator(I)
	ListIterator(I) 
	
	Utility Classes
	Collections
	Arrays
	
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
