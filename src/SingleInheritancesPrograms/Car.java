package SingleInheritancesPrograms;

class Vehicle {
	
public void start()
{
	System.out.println("Vehicle started");
}
}
public class Car extends Vehicle
{
	public void start()
	{
		System.out.println("Car Started");
	}

	public static void main(String[] args)
	{
		Vehicle v=new Vehicle();
		Car c=new Car();
		v.start();
		c.start();
	}
}
