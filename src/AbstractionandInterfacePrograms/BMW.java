package AbstractionandInterfacePrograms;

//Mulitple inheritance will support only with the help of interface
public class BMW extends Car implements Interface1,Interface2,Interface3 {

	@Override
	public void cardetails() {
		System.out.println("Car Name is  BMW");
		
	}

	@Override
	public void carprice() {
		// TODO Auto-generated method stub
		System.out.println("Car Price is 1.5 Crore");
		
	}
	

	@Override
	public void CarShowroomDetails() {
		// TODO Auto-generated method stub
		System.out.println("Car ShowRoom Details will be available in Website");
		
	}

	@Override
	public void CarManufacturemainbranch() {
		// TODO Auto-generated method stub
		System.out.println("Car Manufacture Main Branch is  Germany");
		
	}
	public static void main(String[] args)
	{
		Car car=new BMW();
		car.cardetails();
		car.carprice();
		car.carmanfacturedetails();
		BMW b=new BMW();
		b.CarShowroomDetails();
		b.CarManufacturemainbranch();
		
	}

}
