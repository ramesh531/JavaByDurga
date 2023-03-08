package javaprograms;

public class StringBuilderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		 Every menthod present in StringBuffer is synchronized. 
		 Hence Only one thread is able to access at a time.
		 
		 StrinBuffer is thread safe.Threads are required to operate on SBuffer Object hence relatively performance is low.
		 
		 In 1.5 version to overcome this issue StribgBuilder is introducted
		 
		Non Syncronized version of StringBuffer is called StringBuilder. It is not thread safety.
		
		Remove the synchronized keyword for all the methods in StringBuffer 
		
		
		
		String : If the content is fixed and won't change frequently  then go for String object. String is thread safe.All Immuatable objects (STring, Wrapper class) objects are thread safe. 
		
		StringBuffer : If the content is not fixed and keeps on changing then and thread safety is required then go for StringBuffer
		
		StringBuilder : IF the content is not fixed and keeps on changing and thread safety is not required then go for StringBuilder 
		
		Method chaining all methods in String,SBuilder,SBuffer are Same return type hence mehtod chianing is possible. All methods will be executed from left to right.
		
		sb.delete(0,sb.length()) will remove all the contents in the SrtringBuilder object.
		
		It's highly recommened to overide the toString() method in our classes for meaningful representation.
		 */
		
		/*StringBuilder sb  = new StringBuilder();
		
		//sb.append("Ramesh").append("Allamsetti").reverse().insert(2, "xyz").deleteCharAt(3).append(true).delete(3, 6);
		
		System.out.println(sb);
		 
		 */
		
		StringBuilder sb = new StringBuilder(5);
		String s="";
		
		if(sb.equals(s))
		{
			System.out.println("match1");
		}
		
		else if (sb.toString().equals(s.toString()))
		{
			System.out.println("Match2");
		}
		
		else
		{
			System.out.println("No Match");
		}
		

	}

}
