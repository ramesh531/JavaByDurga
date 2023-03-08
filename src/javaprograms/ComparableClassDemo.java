package javaprograms;

import java.util.TreeSet;

class MyEmployee implements Comparable
{
	String name;
	int eid;
	MyEmployee(String name, int eid)
	{
		this.name = name;
		this.eid = eid;
	}

	public String toString()
	{
		return name +"---"+eid;
	}
	public int compareTo(Object obj)
	{
		int eid1 = this.eid;
		MyEmployee e = (MyEmployee) obj;
		int eid2 = e.eid;
		if(eid1<eid2)
			return -1;
		else if (eid1>eid2)
			return +1;
		else
			return 0;

	}
}


public class ComparableClassDemo {

	public static void main(String[] args) {

		MyEmployee e1= new MyEmployee("Ramesh",1);
		MyEmployee e2= new MyEmployee("Lakshmi",2);
		MyEmployee e3= new MyEmployee("Kushaal",3);
		MyEmployee e4= new MyEmployee("Ramesh",1);
		
			TreeSet ts = new TreeSet();
			ts.add(e1);
			ts.add(e2);
			ts.add(e3);
			ts.add(e4);
			

			System.out.println("TreeSet after eid ascending Order "+ts);
		}
	}


