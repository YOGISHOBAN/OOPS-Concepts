package EnumProgram;
import java.util.Scanner;

public class EnumExample {

	public enum day{Monday,Tuesday,Wednesday,Thrusday,Friday,Saturday,Sunday};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Day");
		String Day=in.next();
		switch(day.valueOf(Day))
		{
		case Sunday:
			System.out.println("Weekend and it is holiday");
		break;
		case Saturday:
		System.out.println("Weekend work might be there");
		break;
		case Friday:
			System.out.println("Friday is Working Day ");
		break;
		case Thrusday:
			System.out.println("Thrusday is Working Day");
			break;
		case Wednesday:
			System.out.println("Wednesday is Working Day");
		break;
		case Tuesday:
			System.out.println("Tuesday is Working Day");
			break;
		case Monday:
			System.out.println("Monday is Working Day");
		break;
		}

	}

}
