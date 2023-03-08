package javaprograms;

public class InterviewQuestions {
	
	/*
	  1. final, finalize,finally
	  final is modifier applicable for classes,methods and variables. 
	  If a class is declared as final it can't be extended. We can't create a child class for that class
	  If a method is declared as final it can't be overridden in the child class
	  If a variable is declared as final then it will become constant and we can't perform reassignement for that variable.
	  
	  finally is block always associated with try &  catch
	  try{ //risky code }
	  catch(Exception e) {//Handling the risky code}
	  finally {//cleanup code }
	  
	  finalize() method is present java.lang.Object class. This method is invoked by garbage collector just before destroying an object to perform cleanup activities.
	  
	  finally block meant for clean up activities relates to try block. Where as finalize() meant for cleanup activites related to object.
	  
	  
	  
	  2.Diff b/w String and StringBuffer
	  
	  String is immutable. Once we create a String object we can't perform any changes in the existing object. If we are trying to perform any change with those changes a new object will be created. This non changeable nature is nothing but immutability of String object. 
	  String class overrides object class equals() method,hence equals() method is used for content comparison
	  
	  StringBuffer is mutable. Once we create a StringBuffer object we can perform any changes in the existing object. This changable is nothing but mutability  of StringBuffer Object.
	  
	  	  StringBuffer class didn't override object class equals() method . Here equals() method is used for reference comparison.
	  	  
	  	  
	  	3. Diff b/w == operator and .equals() method
	  	
	  	== operator for reference comparison and address comparison
	  	.equals() method meant for content comparison
	  	
	  	4. Various access modifiers in Java
	  	
	  	
	  	Modifers     Classes   Methods	Variables	Blocks	 Interface
	  	
	  	Public       yes		yes		yes						yes
	  	Private		 no			yes		yes
	  	Protected	 no			yes		yes
	  	default      yes		yes		yes						yes
	  	final        yes		yes		yes						no
	  	abstract     yes		yes		no
	  	static		 no			yes		yes			yes
	  	synchronized no			yes		no			yes
	  	native	     no			yes		no
	  	strictfp     yes		yes		no						yes
	  	transient	 no			no		yes
	  	volatile	 no			no		yes
	  	
	  
	  5. Diff b/w StringBuffer(1.0V) and StringBuilder (1.5V)
	  
	  	StringBuffer is exactly same as StringBuilder  (including Methods and Constructors )except the following differences
	  	
	  	StringBuffer
	  	1.All methods are synchronized
	  	2.Thread safe. At a time only one thread is allowed to operate on StringBuffer object
	  	3.Increases waiting time of threads hence Performance is low
	  	4. Introduced in 1.0 version
	  	
	  	StringBuilder
	  	1.All methods are not synchronized
	  	2.Not thread safe. At a time multiple threads is allowed to operate on StringBuilder object
	  	3.Threads are not required to wait hence performance is high
	  	4. Introduced in 1.5 version
	  	
	  	
	  6. When we should go for String , StringBuffer and StringBuilder
	  
	  String: If the content is fixed and won't change frequently then we go for String
	  
	  StringBuffer : If the content is not fixed and keeps changing and thread safety is  required then we go for StringBuffer
	  
	  StringBuilder : If the content is not fixed and keeps changing and thread safety is not required then we should go for StringBuilder
	  
	  7. Interface vs abstract class vs concreted class
	  
	  Interface: If we don't know anything about implementation just we have requirement specification (100% abstraction) then we go for interface
	  Ex: Servlet  (Plan ) - SRS
	  
	  Abstract class : If we talk about implementation but not completely (partial implementation ) then we go for Abstract class 
	  Ex: HTTPServlet,GenericServlet  (Paritally completed building)
	  
	  Concreted Class : If we are talking about implementation completely and ready to provide service then we go for concrete class
	  Ex: MyOwnServlet (fully completed building)
	
	
	8. Diff b/w Access specifiers and Access Modifiers
	 
	 1.In old languages like C++ public,private,protected and default are considered as access specifiers . Except this the remaining(like static) are considered as access modifiers
	 
	 2. But in Java there is no terminology like specifiers. all are by default considered as modifiers only . 12 modifiers
	 public,private,protected,default,static,final,abstract,native,synchronized,
	 strictfp,transient,volatile
	 
	 
	9. Diff b/w interface and abstract class
	
	Interface
	1.If we don't know anything about implementation
	2.Every method is always public and abstract whether we declare or not.It's also considered as 100% pure abstract class
	3.We can't declared interface methods with below modifiers
	public -->private,protected
	abstract -->final,static,synchronized,strictfp,native
	4.Every variable present in interface is always public,static and final whether we are declaring it or not
	5.We can't declare interface variables with below modifiers
	private,protected,transient,volatile
	6.For interface variables compulsory we should perform initialisation at the time of declaration otherwise we will get compile time error.
	7.Inside interface we can't declare instance and static blocks. We get compile time errors.
	8.Constructor concept is not applicable
	
	
	Abstract class
	1.If we know about implementation but not completely
	2.Every method present in abstract class need not be public and abstract.In addition we can have concreted methods also. 
	3.There is no restriction on abstract class methods. all modifiers can be used.
	4.The variables present in abstract class needn't be public,static and final
	5.There are no restrictions on abstract class variables.
	6.For abstract class variables it's not required to perform initialisation at the time of declaration.
	7.Insider abstract class we can declare instance and static blocks
	8.To perform initialization of instance variable we can declare constructor
	 
	 
	 10.Explain System.out.println() method
	 
	 class Test
		{
			static String s3="java";
			
			Test.s3.length();
		}
		
		Test is a class name
		s3 is a static variable present in Test class of type String
		lenght() is method present in String class
	 
	 class System
		{
		 static PrintStream out ;
		 
		}
	 
	  System is the class name present in java.lang package
	  out is a static variable present in the System class of type PrintStream
	  println() is a method present in PrintStream class
	 
	 
	 11. Explain public static void main() method
	  
	  1.Whether class contains main() method or not and main() method is declared according to the requirement or not , these things won't be checked by compiler. At runtime, JVM is responsible to check these thigns.
	  
	  At runtime in JVM is unable to find the required main() method then we will get runtime exception NoSuchMethodError:main
	  class Test
	  {
	  }
	  javac Test.java
	  java Test
	  RuntimeException:NoSuchMethodError:main
	  
	  
	  2.
	  public --To Call by JVM from any where
	  Static --without existing object also JVM has to call this method & main method no way related to any object
	  void  -- main() method won't return anything to JVM
	  main  -- This is the name configured inside JVM
	  String[] args -- command line arguments
	  
	  3. The above syntax is very strict if we perform any change we will get runtime excepiton saying NoSuchMethodError:main
	  
	  4. The following changes are acceptable to main() method
	     a. order of modifiers in not important. (static public) is accepted
	     b. We can declare String[] in any acceptable form
	     main(String[] args)
	     main(String args[])
	     main(String []args)
	     c. instead of args we can take any valid identifier ex: a,b,c12 etc
	     d.We can replace String[] with var arg parameter (1.4 V)
	     main(String[] args) --> main(String... args)
	     e.We can declare main() method with the following modifiers also
	     final,synchronized,strictfp
	     
	     class Test
	     {
	     final static synchronized strictfp public void main(String... ar)
	     {
	     syso("valid main");
	     }
	     
	     public static void Main(String[] args)  -- not valid
	    public static int main(String[] args)  -- not valid
	 public static void main(String args)  -- not valid
	 public final synchronized void Main(String[] args)   - not valid
	 
	 We won't get comile time error we will get runtime error
	 
	  5. Overloading of the main method is possible but JVM will always call String[] argument main method only
	  The other overloaded method we have to call explicity then only it will be executed as a normal method call
	  
	  class Test
	  {
	   p s v main(String[] args)
	   {
	   sop("String method");
	   }
	   
	   p s v main(int[] args)
	   {
	   sop("int metod")
	   }
	   
	   Output : String method
	   
	   6. Inheritance concept is applicable for the main method . Hence while executing child class , if child class doesn't contain main method then parent class main method will be executed.
	   class P
	   {
	    p s v main(String[] args)
	    {
	    sop("main method");
	    }
	    
	    class C extends P
	    {
	    }
	    
	    javac P.java --> P.class and C.class
	    java P --> main method
	    java C --> main method
	    
	    
	    7. It seems overriding concept applicable for main method but it not overriding . It's method hiding.
	    
	    class P
	   {
	    p s v main(String[] args)
	    {
	    sop("main method");
	    }
	    
	    class C extends P
	    {
	     p s v main(String[] args)
	    {
	    sop("child method");
	    }
	    }
	    
	    javac P.java --> P.class and C.class
	    java P --> main method
	    java C --> child method
	    
	    For main() method inheritance and overloading concepts are applicable but overriding concept is not applicable instead of overriding 
	    "method hiding" concept  is applicable.
	    
	    8. 1.7 version enhancements for main() method.
	    
	    a.  Until 1.6 version if the class doesn't have main() method then we will get runtime exception NoSuchMethodError. But from 1.7 version onwards we will get more meaningful error
	    Main method not found in class test,  please define main method as
	    public static void main(String[] args)
	    
	    b.
	    class Test
	    {
	    	static
	    	{
	    		syso("static block");
	    	}
	    }
	    
	    Until 1.6 V : java test 
	    Output
	    Static block 
	    RE:NoSuchMethodError: main
	    
	    From 1.7 V
	    Error: main method not found in class test
	    
	     C
	    class Test
	    {
	    	static
	    	{
	    		syso("static block");
	    		System.exit(0); // shutdown the JVM
	    	}
	    }
	    
	    Until 1.6 V : java test 
	    Output
	    Static block 
	    
	    From 1.7 V
	    Error: main method not found in class test
	    
	    d.
	    
	     C
	    class Test
	    {
	    	static
	    	{
	    		syso("static block");
	    	}
	    	
	    	p s v main(String[] args)
	    	{
	    	 sop("main");
	    	 }
	    }
	    
	    Until 1.6 V : java test 
	    Output
	    Static block 
	    main
	    
	    From 1.7 V
	   Output
	    Static block 
	    main
	    
	    
	    e. Can we print something to console without main
	    Yes we can pring by using static block. But this rule is allowed until 1.6 V . From 1.7V onwards main() method is mandatory to print statements to console.
	    
	    
	    9. Diff b/w overloading and overriding
	    
	    Overloading : 2 methods are said to be overloaded if and only if both methods have same name but different argument types.
	    
	    
	    class Test
	    {
	    public void m1(int i)
	    {
	    }
	    public void m1(long l)
	    {
	    }
	    }
	    
	    Overriding : 
	    class P
	    {
	    	public void property()
	    	{
	    		sop("cash,land,gold")
	    	}
	    	public void marry()
	    	{
	    		sop("Lakshmi")
	    	}
	    }
	    class C extends P
	    {
	    	public void marry()
	    	{
	    		sop("Sreya");
	    	}
	    }
	    	
	 */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = new String("Ramesh");
		s.concat("Allamsetti");
		System.out.println("String : "+s);
		
		StringBuffer sb = new StringBuffer("Ramesh");
		sb.append("Allamsetti");
		System.out.println("String Buffer : "+sb);
		
		
		String s1 = new String("Sunny");
		String s2= new String("Sunny");
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1==s2); //false
		
		String s3="abc";
		String s4="abc";
		System.out.println(s3.equals(s4)); //true
		System.out.println(s3==s4);//true
		
		StringBuffer sb1 = new StringBuffer("Sunny");
		StringBuffer sb2 = new StringBuffer("Sunny");
		System.out.println(sb1.equals(sb2)); //false
		System.out.println(sb1==sb2);//false
		

	}
	
}




