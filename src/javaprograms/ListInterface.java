package javaprograms;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Stack;
import java.util.Vector;

public class ListInterface {

	/*
	 List(I)Methods -- index plays 

	 void add(int index,Object o)
	 boolean addAll(int index,Collection c)
	 Object get(int index)
	 Object remove(int index)
	 int indexOf(object o)
	 int lastIndexOf(Object o)
	 ListIterator listIterator()
	 set(int index,Object o)


	 ArrayList (class)
	 1)Underlying data structure is Resizable Array or Growable Array
	 2)Duplicates allowed
	 3)insertion order is preserved
	 4)Hetrogenours Object (Except Treeset and TreeMap everywhere it's allowed)
	 5)null insertion is possibel


	 ArrayList constructor
	 1)ArrayList al = new ArrayList(); //default initial capacity is 10

	 New Capacity = (Current Capacity * 3/2) + 1;

	 2)ArrayList al = new ArrayList(int initialcapacity)

	 3)ArrayList al = new ArrayList(Collection c) //To create an equvilent Al object then we use this


	 Every collection class implements Serializable(I) and Clonebale(I)

	 Usually we use Collections to hold and transfer objects from one place
	 to other place , to provide support every collection implements Serializable 
	 and Clonable interfaces.

	 ArrayList and Vector implements RandomAccess(I). We can access any element
	 at the same speed. For retrieval of objects we should use ArrayList

	 RandomAccess(I) present in java.util package
	 It doesn't contain any methods and it's called as Marker Interface

	 ArrayList is best choice if our frequent operations are retreival.
	 ArrayList is worst choice if our frequent operations are either insertion
	 or deletion in the middle(Because several shift operations are required)

	 Difference b/w ArrayList and Vector
	 ArrayList
	 1. All methods are non synchronized
	 2. Not Thread safe
	 3. Performance of the system is relatively high
	 4.Non legacy (1.2 version)

     Vector
	 1.All methods are synchronized
	 2.Thread Safe
	 3. Performance is low
	 4.legacy class (1.0)

	 How to get synchronized version of ArrayList object

	 ArrayList l1 = new ArrayList(); 
	 List l = Collections.synchronizedList(l1)

	 public static List synchronizedList(List l)

	  public static List synchronizedSet(Set s)

	   public static List synchronizedMap(Map m)


	 *****
	   LinkedList (class)
	   1.Underlying data structure is Double LinkedList
	   2. Insertion order is preserved
	   3.Duplicates are allowed
	   4.Hetrogenous objects are allowed
	   5.Null insertion is possible.

	   LL is best choice if frequent operation is insertion or
	   deletion in the middle

	   LL is worst choice if frequent operation is retrieval operation

	   We user LL to implement Stacks and Queues
	    Methods
	    void addFirst(Object o)
	    void addLast(Object o)
	    Object getFirst();
	    Object getLast();
	    Object removeFirst();
	    Object removeLast();

	    Constructos

	    LinkedList l = new LinkedList(); //Creates empty LL
	    LinkedList l = new LinkedList(Collection c) //Creates equivalent LinkedList Object for given Collection


	   Difference b/w ArryaList and LinkedList

	   ArrayList
	   1. Best choice for retreival operation
	   2. Worst choice for insertion and deletion
	   3. Underlying DS is Resizable or growable Array 
	   4. implements RandonAccess


	   LinkedList
	   1.Best choice for insertion and deletion in middle
	   2.Worst choice for Retreival operaton
	   3.Underyling DS is Double Linked List
	   4. doesn't implement RandomAccess interface

	 ****
	   Vector Class
	   1)Underylying DS is Resizable or Growable Array
	   2)Duplicates are allowed
	   3)Insertion order is perserved
	   4)null insertion is allowed
	   5)Hetrogenous objects are allowed
	   6)implements Serializable,Clonable and RandomAccess
	   7)all methods are Synchroinzed. Thread Safe
	   8)Best choice if operations are retreival

	   Methods
	   addElement(Object o)
	   removeElement(Object o)
	   removeElementAt(int index)
	   removeAllElements();
	   Object elementAt(int index);
	   Object firstElement();
	   Object lastElement();
	   Enumeration enumeration();

	   Constructos
	   1)Vector v = new Vector(); //Creates empty Vector with init capacity as 10
	   new Capacity 2* CurrentCapacity 
	   2)Vector v = new Vector(int initalCapacity)
	   3)Vector v = new Vector(int initalCapacity,int incrementalCapacity)
	   4)Vector v = new Vector(Collection c) //Equivalent vector object of given collection

	 ****
	   Stack 
	   1.class child class of Vector
	   2.It's designed for LIFO

	   Constructors
	   Vector v = new Vector();

	   Methods
	  Object push(Object o) // To add an object to last stack
	  Object pop(); ..To remove and returns top element of stack
	  Object peek(); To return the top element of stack without removal of Object
	   empty(); // Is stack is empty or not
	  int search(Object obj)  returns offSet

	 ****
	   Cursors -
	   1) To retrieve objects one by one from Collection
	   Enumeraiton 1.0 version Legacy
	   Iterator
	   ListIterator

	   Enumeration e = v.elements() // V is vector object
	   Methods
	  public boolean hasMoreElements();
	  public Object nextElement();

	  Enumeration is only applicable for Legacy classess hence
	  it's not a universal cursor

	  By using we can get only read operatons and we can't perform
	  remove operations

	   2)Iterator(I)
	   It's applicable for any collection class and it's universal
	   cursor
	   We can perform read and remove operations

	   public Iterator iterator()
	   Iterator itr = c.iterator();

	   Methods
	   public boolean hasNext()
	   public object next()
	   public object remove()

	   Limitations of iterator
	   1) Enumeration and iterators are only forward direction cursors
	   2) Replace is not available (only read and remove operatons)

	 ***
	   3.ListIterator(I)
	   1)It's bidirectional cursor. We can move either forward and backward
	   direction 
	   2)We can perform replace and additons of new objects in addition
	   to read and remove operations


	   public ListIterator listIterator()

	   ListIterator litr = l.listIterator();

	   ListIterator is child interface of Iterator
	   ListIteratior is more powerful cursor but it's only applicable only for List implemented class objects and it's not universal cursor.

	   Methods

	   public boolean hasNext()
	   public object next();
	   public int nextIndex();

	   public boolean hasPrevious();
	   public Object previous();
	   public int previousIndex(); 

	   public void remove()
	   public void set(Object new) //To replace object
	   public void add(Object new) 
	   
	   Comparsion of 3 java cursors
	   
	   Enumeration 
	   applicable only for legacy classes
	   move only forward direction (Single direction)
	   Only read
	   elements() method of Vector class
	   hasMoreElements(), nextElement()
	   Legacy class (1.0V)
	   
	   Iterator
	   applicable for all collection classes
	   move only forward direction (Single direction)
	   read and remove
	   iterator() method of Collection(I)
	   hasNext(),next(),remove()
	   non legacy (1.2V)
	   
	   
	   ListIterator
	   applicable only for List implemented classes
	   both forward and backward directions (Bi directional)
	   read,remove,replace and addition of new objects
	   listIterator() method of List(I)
	   9 methods hasNext(),next(),nextIndex(),hasPrevious(),previous(),previousIndex(),remove(),set(Object ob),add(Object ob)
	   non legacy (1.2V)
	   
	   
	   To get the corresponding class Nam
	   Enumeration e = v.elements()
	   e.getClass().getName() ; //Provides the corresponding class Name Vecotr$1 ($1 annonomous Inner class)

	 */
	public static void main(String[] args)
	{

		ArrayList l1 = new ArrayList();
		LinkedList l2 = new LinkedList();
		System.out.println(l1 instanceof Serializable); //true
		System.out.println(l2 instanceof Serializable); //true
		System.out.println(l2 instanceof Cloneable); //true
		System.out.println(l1 instanceof RandomAccess);//true
		System.out.println(l2 instanceof RandomAccess); //false


		LinkedList ll = new LinkedList();
		ll.add("Ramesh");
		ll.add(30);
		ll.add(null);
		ll.add("Ramesh");

		System.out.println(ll);

		ll.set(0,"Allamsetti");
		ll.remove(2);
		ll.add(0, "Lakshmi");
		ll.addFirst("Sunny");
		ll.getFirst();
		ll.removeLast();

		System.out.println(ll);

		Stack s = new Stack();
		s.add("A");
		s.add("B");
		s.add("C");

		System.out.println(s);

		System.out.println(s.search("A"));
		System.out.println(s.search("D"));



		Vector v = new Vector();
		for(int i=0;i<=10;i++)
		{
			v.addElement(i);
		}
		System.out.println(v);

		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{

			Integer i =(Integer)e.nextElement();
			if(i%2==0)
			{
				System.out.println(i);
			}
		}

		System.out.println(v);

		//Iterator

		ArrayList al = new ArrayList();
		for(int i=0;i<5;i++)
		{
			al.add(i);


		}
		System.out.println(al);

		Iterator itr = al.iterator();

		while(itr.hasNext())
		{
			Integer i = (Integer) itr.next();

			if(i%2==0)
			{
				System.out.println(i);
			}
			else
			{
				itr.remove();
			}

		}

		System.out.println(al);



		//List Iterator

		LinkedList ll1 = new LinkedList();
		ll1.add("Ramesh");
		ll1.add("Lakshmi");
		ll1.add("Sunny");
		ll1.add("Kushaal");
		System.out.println("Linked List : "+ll);
		
		ListIterator ltr = ll1.listIterator();
		while(ltr.hasNext())		
		{
			String s1 = (String) ltr.next();
			if(s1.equals("Ramesh"))
			{
				ltr.remove();
			}
			else if(s1.equals("Lakshmi"))
			{
				ltr.add("Architect");
			}
			else if(s1.equals("Sunny"))
			{
				ltr.set("is Funny");
			}
			
		}
		
		System.out.println("Update Linked List : "+ll1);
		
		
		
		//
		Vector v1 = new Vector();
		Enumeration en = v1.elements();
		
		Iterator itr1 = v1.iterator();
		
		ListIterator ltr1 = v1.listIterator();
		
		System.out.println(en.getClass().getName()); //java.util.Vector$1(1 means Annonynomus Inner class 
		
	   System.out.println(itr1.getClass().getName());
	   //java.util.Vector$Itr  (Itr innerclass present in Vector implements the iterator interface
	   System.out.println(ltr1.getClass().getName());
	   //java.util.Vector$ListItr (ListItr innerclass present in Vector implements the ListIterator interface

	   
	   
		ArrayList al2 = new ArrayList();
		Iterator itr2 = al2.iterator();
		
		LinkedList ll2 = new LinkedList();
		ListIterator ltr2 = ll2.listIterator();
		
	
	   System.out.println(itr2.getClass().getName());
	   //java.util.Vector$Itr  (Itr innerclass present in Vector implements the iterator interface
	   System.out.println(ltr2.getClass().getName());
	   //java.util.Vector$ListItr (ListItr innerclass present in Vector implements the ListIterator interface

	}
	
}
