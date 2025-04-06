package ConstructorsPrograms;
//Parameterized Constructor
public class EmployeeDetails {
	String employeeID;
	String employeename;
	int employeeExperiences;
	double EmployeeSalary;
	EmployeeDetails(double EmployeeSalary,String employeeID,String employeename,int employeeExperiences)
	{
		this.employeeID=employeeID;
		this.employeename=employeename;
		this.employeeExperiences=employeeExperiences;
		this.EmployeeSalary=EmployeeSalary;
	}
	public void EmployeeDetails()
	{
		System.out.println("Employee ID: "+employeeID);
		System.out.println("Employee Name: "+employeename);
		System.out.println("EmployeeExperiences :"+employeeExperiences);
		System.out.println("EmployeeSalary :"+EmployeeSalary);
	}
public static void main(String[] args)
{
	EmployeeDetails empdetails=new EmployeeDetails(760000,"EMP0001","Suresh",6);
	empdetails.EmployeeDetails();
	
}
}
