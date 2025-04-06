package MultilevelInheritancesPrograms;

class Person{
	public void display()
	{
		System.out.println("Name: "+"Yogesh");
		System.out.println("Age: "+28);
	}
}
class Employee extends Person
{
	public void display()
	{
		super.display();
		System.out.println("Salary "+65000);
	}
}
public class Manager extends Employee {
public void display()
{
	super.display();
	System.out.println("Department: "+"CSE");
}
public static void main(String[] args)
{
	Person p=new Person();
	Employee e=new Employee();
	Manager m=new Manager();
	p.display();
	e.display();
	m.display();
}
}
