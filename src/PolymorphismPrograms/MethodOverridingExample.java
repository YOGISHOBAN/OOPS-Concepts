package PolymorphismPrograms;

class Addition{
	int a ,b,total;
	public void calculation(int a,int b)
	{
		total=a+b;
		System.out.println("Addition "+total);
	}
}
class Subtraction extends Addition{
	public void calculation(int a,int b)
	{
		total=a-b;
		System.out.println("Subtract "+total);
	}
}
public class MethodOverridingExample extends Subtraction{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Addition a=new Addition();
Subtraction s=new Subtraction();
a.calculation(3, 5);
s.calculation(100, 50);


	}

}
