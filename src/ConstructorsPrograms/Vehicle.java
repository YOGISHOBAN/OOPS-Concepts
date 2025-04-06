package ConstructorsPrograms;
//No Arg Constructor
public class Vehicle {

	String  Car;
	String Bike;
	Vehicle()
	{
		this.Car=Car;
		this.Bike=Bike;
	}
	public void display()
	{
		System.out.println("Nice Car "+Car);
		System.out.println("Nice Bike "+Bike);
	}
	
	public static void main(String[] args)
	{
		Vehicle vehicle=new Vehicle();
		vehicle.Car="BMW";
		vehicle.Bike="R15";
		vehicle.display();
	}
}
