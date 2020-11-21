package employees;

public  class Secretary extends Employees{

	//Extra variables for Secretary
	
	private String SecResponsibility;
	
	
	
	
	
	
	//Setters-Getters
		
		public String getSecResponsibility() {
		return SecResponsibility;
	}


	public void setSecResponsibility(String secResponsibility) {
		SecResponsibility = secResponsibility;
	}

	
	//Constructors
	
	public Secretary(String n , String p , String o , double s , String res)
	{
		super(n,p,o,s);
		SecResponsibility = res;
	}
	
	
	public Secretary()
	{
		
	}
	//Methods from Employees that need to be fixed
	

		
		public void print() {
			System.out.println("Secretary : " + getEmpName());
			System.out.println("\tPhone number : " + getEmpNo());
			System.out.println("\tOffice : " + getEmpOffice());
			System.out.println("\tSalary : " + getEmpSalary());
			System.out.println("\tResponsibility : " + SecResponsibility);
		}
		
		
		
		
}
