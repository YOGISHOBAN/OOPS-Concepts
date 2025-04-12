package StaticExamples;

class Base{
	static int a;
	public static void method()
	{
		System.out.println(a);
	}
}
public class StaticVariableMethodExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base.a=34;
		Base.method();

	}

}
