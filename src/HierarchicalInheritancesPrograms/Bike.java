package HierarchicalInheritancesPrograms;

class Vehicle {
	public void  display()
	{
		System.out.println("Driving a Vehicle");
	}
}
class Car extends Vehicle{
	public void  display()
	{
		System.out.println("Driving a Car");
	}
}
public class Bike extends Vehicle
{
	public void display()
	{
		System.out.println("Driving a Bike");
	}

	public static void main(String[] args)
	{
		Bike b=new Bike();
		Car c=new Car();
		b.display();
		c.display();
	}

}
