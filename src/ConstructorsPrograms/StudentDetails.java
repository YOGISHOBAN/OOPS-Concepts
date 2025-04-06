package ConstructorsPrograms;
//Default Constructor
public class StudentDetails {
	
	String studentname;
	String studentID;
	
public static void main(String[] args)
{

StudentDetails sd=new StudentDetails();
sd.studentID="STUD0001";
sd.studentname="Vignesh";
System.out.println(sd.studentID);
System.out.println(sd.studentname);
}
}