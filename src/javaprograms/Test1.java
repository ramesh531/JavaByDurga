package javaprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Test1 {
	
	/*
	 Create a Car class that contains company, model and year of manufacturing. 
Create a getTotalCarsByCompany() method that takes list as a parameter. 
The method should return Map<String,Integer> whereby the key is the company and the value is the total number of cars per company
	 */

	public static void main(String[] args) throws Exception {
	
		
		Car c1 = new Car("BMW",2020,"20Jun2021");
		Car c2 = new Car("Audi",2021,"20Jun2020");
		Car c3 = new Car("Toyoto",2015,"30Nov1999");
		Car c4 = new Car("Honda",2010,"20Jun2011");
		
		List<Car> carList = new ArrayList<Car> ();
		
		carList.add(c1);
		carList.add(c2);
		carList.add(c3);
		carList.add(c4);
		
		System.out.println("Car List : "+carList);
			
		Map<String,Integer> map1 = new HashMap<String,Integer>();
		
		map1 = Car.getTotalCarsByCompany(carList);
		
		System.out.println(map1);
			
	
}

}
class Car
{

	String name;
	int model;
	String yearOfMan;
	
	static int bmwCount=0;
	static int audiCount=0;
	
	static Map<String,Integer> m1 = new HashMap<String,Integer>();
	
	Car(String name,int model, String yearOfMan)
	{
		
		this.name = name;
		this.model= model;
		this.yearOfMan = yearOfMan;
	}
	
	public static Map<String,Integer> getTotalCarsByCompany(List<Car> al)
	{
		
		if(al.contains("BMW"))
			try {
				m1.put("BMW",bmwCount++);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		else if(al.contains("Audi"))
			m1.put("Audi",audiCount++);
		
		return m1;
	}
	
	public String toString()

	 {

	  return name + " : " + model + ":" + yearOfMan;

	 }

}

