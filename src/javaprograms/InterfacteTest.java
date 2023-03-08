package javaprograms;


interface A
{
	public  void m1();
	
}

public class InterfacteTest implements A {
	
	public void m1()
	{
		System.out.println("Interface method m1 is implemented in the class  "+this.getClass().getName());
	}
	
	public static void main(String... args)
	{
		A a = new InterfacteTest();
		a.m1();
	}

}
