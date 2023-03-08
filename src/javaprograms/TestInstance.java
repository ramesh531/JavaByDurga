package javaprograms;

public class TestInstance {

	static {
System.out.println("Hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestInstance t1 = new TestInstance();
		t1.m1();

	}
	
	public void m1()
	{
		  final int i = 6;
		// i = i*5;
		 int j = i*2;
		 
		 System.out.println(i +"----"+j);
		 
	}

}
