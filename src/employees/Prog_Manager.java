package employees;



public class Prog_Manager extends Programmer{
	
	//Variables for Manager Programmer 
	
	String projects[] = new String[5];
	private String ManagerEmail; 
	private String ManagerMobPhone;
	
	
	//Setters-Getters




	public String getManageremail() {
		return ManagerEmail;
	}



	public void setManageremail(String manageremail) {
		ManagerEmail = manageremail;
	}



	public String getManagerMobPhone() {
		return ManagerMobPhone;
	}



	public void setManagerMobPhone(String managerMobPhone) {
		ManagerMobPhone = managerMobPhone;
	}



	public String[] getProjects() {
		return projects;
	}



	public void setProjects(String[] projects) {
		this.projects = projects;
	}



	//Constructor
	public Prog_Manager()
	{
		
	}
	
	//figure out list of projects with vector
	public Prog_Manager(String n ,String p , String o , double s , String pL ,String pD ,String pP ,String me , String mp ,String[] list)
	{
		super(n,p,o,s,pL,pD,pP);
		ManagerEmail = me;
		ManagerMobPhone = mp;
		projects = list;
	}
	
	//Methods from Employees that need to be fixed



	public void print() {
		System.out.println("Programming Manager : " + getEmpName());
		System.out.println("\tPhone number : " + getEmpNo());
		System.out.println("\tOffice : " + getEmpOffice());
		System.out.println("\tSalary : " + getEmpSalary());
		System.out.println("\tProgramming Language used : "+getProgrammingLanguage());
		System.out.println("\tDesktop used : "+getProgrammerDesktop());
		System.out.println("\tProject currently working on : "+getProgrammerProject());
		System.out.println("\t Contact email : " + ManagerEmail);
		System.out.println("\t Contact mobile phone : " + ManagerMobPhone);
		int cnt=1;
		System.out.println("\t Projects Manager "+getEmpName()+" is in charge of : ");
		for (int j=0;j<5;j++)
		{
			if (projects[j]!=null)
			{
				System.out.println("\t  Project no "+cnt+" : " + projects[j]);
				cnt++;
			}
			
		}
	}

	
	


}
