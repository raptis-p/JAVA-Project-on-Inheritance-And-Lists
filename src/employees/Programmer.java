package employees;

public class Programmer extends Employees{
	
	//Variables for Programmer
	private String programmingLanguage;
	private String programmerDesktop;
	private String programmerProject;
	
	
	
	
	
	//Setters-Getters
		
		public String getProgrammingLanguage() {
		return programmingLanguage;
	}


	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}


	public String getProgrammerDesktop() {
		return programmerDesktop;
	}


	public void setProgrammerDesktop(String programmerDesktop) {
		this.programmerDesktop = programmerDesktop;
	}


	public String getProgrammerProject() {
		return programmerProject;
	}


	public void setProgrammerProject(String programmerProject) {
		this.programmerProject = programmerProject;
	}


	
	//Constructors
	
	public Programmer()
	{
		
	}
	
	public Programmer(String n,String p , String o , double s , String pl , String pd , String pp)
	{
		super(n,p,o,s);
		programmingLanguage = pl;
		programmerDesktop = pd;
		programmerProject = pp;
	}
	
	
	
	//Methods from Employees that need to be fixed

	
		public  void print() {
			
			System.out.println("Programmer : " + getEmpName());
			System.out.println("\tPhone number : " + getEmpNo());
			System.out.println("\tOffice : " + getEmpOffice());
			System.out.println("\tSalary : " + getEmpSalary());
			System.out.println("\tProgramming Language used : "+programmingLanguage);
			System.out.println("\tDesktop used : "+programmerDesktop);
			System.out.println("\tProject currently working on : "+programmerProject);
			
		}

		
		
}
