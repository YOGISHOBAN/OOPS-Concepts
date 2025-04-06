package EncapsulationPrograms;

public class EncapsulationExample {
	
	private String empname;
	private String empid;
	private String designation;
	
	public String getEmpname() {
		System.out.println(empname);
		return empname;
	}



	public void setEmpname(String empname) {
		this.empname = empname;
	}



	public String getEmpid() {
		System.out.println(empid);
		return empid;
	}



	public void setEmpid(String empid) {
		this.empid = empid;
	}



	public String getDesignation() {
		System.out.println(designation);
		return designation;
	}



	public void setDesignation(String designation) {
		this.designation = designation;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationExample enceg=new EncapsulationExample();
		enceg.setEmpid("EMP46345");
		enceg.setEmpname("Yogesh");
		enceg.setDesignation("QA Test Lead");
		enceg.getEmpid();
		enceg.getEmpname();
		enceg.getDesignation();

	}

}
