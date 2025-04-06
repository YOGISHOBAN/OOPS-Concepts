package SingleInheritancesPrograms;
import java.util.Scanner;
class Inheritances {
	int a,b,c;
	public void  display()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Input1");
		a=in.nextInt();
		System.out.println("Enter the Input2");
		b=in.nextInt();
		c=a+b;
		System.out.println("Sum of c "+c);
	}
}
public class Inheritances1 extends Inheritances
{
public void  displaymethod()
{
	super.display();
	System.out.println("Print");
	
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Inheritances1 inherit2=new Inheritances1();
		inherit2.displaymethod();
	}

}
