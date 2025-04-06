package SingleInheritancesPrograms;
import java.util.Scanner;

class BankAccount{
	int balance=2345000;
	String AccountNumber="ASDFFAS312211410912";
	double interestrate=9.0;
	public void deposit()
	{
		System.out.println("Enter the Bank Account Details:" );
		System.out.println("AccountNumber "+AccountNumber);
		System.out.println("balance "+balance);
		System.out.println("interestrate "+interestrate);
	}
	
}
public class SavingsAccount extends BankAccount{
	int withdraw;
	int minimumbalance;
	public void withdraw()
	{
	Scanner in =new Scanner(System.in);	
	System.out.println("Enter the Withdraw amount");
	withdraw=in.nextInt();
	minimumbalance=super.balance-withdraw;
	System.out.println("Balance Amount in ur Account is "+minimumbalance);
	}
	public static void main(String[] args)
	{
		BankAccount ba=new BankAccount();
		SavingsAccount sa=new SavingsAccount();
		ba.deposit();
		sa.deposit();
		sa.withdraw();
	}
}
