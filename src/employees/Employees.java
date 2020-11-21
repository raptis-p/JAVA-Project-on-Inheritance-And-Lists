package employees;

public abstract class Employees {
	
	//Variables for Employees
	private String empName;
	private String empNo;
	private String empOffice;
	private double empSalary;
	
	
	//Setters-Getters
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String getEmpOffice() {
		return empOffice;
	}
	public void setEmpOffice(String empOffice) {
		this.empOffice = empOffice;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	//Constructors
		public Employees ()
		{
			
		}
	
		
		public Employees (String emNa,String emNo ,String emOf, double emSa)
		{
			empName = emNa; 
			empNo = emNo;
			empOffice = emOf;
			empSalary = emSa;
		}
		
		//Methods
		
		
		
		
		public abstract void print();
}












