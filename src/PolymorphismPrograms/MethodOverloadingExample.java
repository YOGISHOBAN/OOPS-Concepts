package PolymorphismPrograms;

class Animal 
{
	String animal,Birds;
	public void display(String animal)
	{
		System.out.println(animal+ "is the Dangerous ");
	}
}
class Birds extends Animal{
	public void display(String animal,String Birds)
	{
		System.out.println(animal+"is the Dangerous "+Birds+ " sound is the beautiful to hear " );
	}
}
public class MethodOverloadingExample extends Birds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Birds b=new Birds();
Animal a=new Animal();
b.display("Lion", "Cuckoo");
a.display("Lion");
	}

}
