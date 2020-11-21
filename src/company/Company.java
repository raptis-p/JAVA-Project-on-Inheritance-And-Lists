package company;



import computers.Computers;
import computers.Mob_Laptops;
import computers.Mob_Tablets;
import computers.Servers;

import employees.Employees;
import employees.Programmer;
import employees.Secretary;












public class Company {
	
	//Variables in Company
	private String CompName;
	private int CompYear;
	private String CompURL;
	
	private EmployeeExtSortedList personnel;
	private ComputersExtSortedList computers;
	
	//Setters-Getters
	public String getCompName() {
		return CompName;
	}
	public void setCompName(String compName) {
		CompName = compName;
	}
	public int getCompYear() {
		return CompYear;
	}
	public void setCompYear(int compYear) {
		CompYear = compYear;
	}
	public String getCompURL() {
		return CompURL;
	}
	public void setCompURL(String compURL) {
		CompURL = compURL;
	}
	
	public EmployeeExtSortedList getPersonnel() {
		return personnel;
	}
	public void setPersonnel(EmployeeExtSortedList personnel) {
		this.personnel = personnel;
	}
	public ComputersExtSortedList getComputers() {
		return computers;
	}
	public void setComputers(ComputersExtSortedList computers) {
		this.computers = computers;
	}
	
	//Constructors
	public Company(String cN , int cY , String cURL)
	{
		CompName = cN ; 
		CompYear = cY ;
		CompURL = cURL ;
		personnel = new EmployeeExtSortedList();
		computers = new ComputersExtSortedList();
		Initialize();
		
	}
	
	
	
	public Company()
	{
		
	}
	
	
	
	
	//Main Methods
	
	
	//find Employee by full name
	public Employees findEmployeeByFullName(String fName)
	{
		EmployeeItem eItem = (EmployeeItem)personnel.searchbykey(fName);
		if (eItem==null){
			return null;
		}else{
			return (Employees)eItem.getData();
		}
	}

	
	
	//find and delete Employee by full name
	public void findAndDeleteEmployeeByFullName(String fName)
	{
		EmployeeItem eItem = (EmployeeItem)personnel.searchbykey(fName);
		if (eItem==null){
			System.out.println("Employee not found.");
		}else{
			personnel.delete(eItem);
			System.out.println("Employee has been successfully deleted...");
		}
	}
	
	
	
	
	
	public Computers findComputerBySerialNumber(String sNumber)
	{
		ComputerItem cItem = (ComputerItem)computers.searchbykey(sNumber);
		if (cItem==null){
			return null;
		}else{
			return (Computers)cItem.getData();
		}
	}
	
	
	
	
	public void findAndDeleteComputerBySerialNumber(String sNumber)
	{
		ComputerItem cItem = (ComputerItem)computers.searchbykey(sNumber);
		if (cItem==null){
			System.out.println("Computer not found.");
		}else{
			computers.delete(cItem);
			System.out.println("Computer successfully deleted...");
		}
	}
	
	
	//Insert Personnel
	public void addPersonnel(Employees em){		
		personnel.insertSorted(new EmployeeItem(em));
	}
		
	public void addComp(Computers c){		
		computers.insertSorted(new ComputerItem(c));
	}
	
		
	
	
	
	
	public void Initialize()
	{
		//Can't Programming managers due to array
			//Programmers
		addPersonnel(new Programmer("Raptis Panos","210509129","Office1",45000.0,"C++","deskt1245125","Proj1.5"));
		addPersonnel(new Programmer("Sfiropoulou Matildi","210218592","Office32",32969.0,"Python","deskt758192","Proj3.4"));
		addPersonnel(new Programmer("Giannekakopoulos Nikodimos","2821509812","Office17",35600.0,"Java","deskt512512","Proj5.7"));
		
		
			//Secretaries
		addPersonnel(new Secretary("Kimotou Vasilis","215908271","Office14",15000.0,"Sales"));
		addPersonnel(new Secretary("Dimopoulou Ioanna","2821056125","Office64",17000.0,"Publicity"));
		
			//Servers
		addComp(new Servers("serv128517","Maker1",1942.67,"MacOS","64bit",8.6,500.0));
		addComp(new Servers("serv619225","Maker7",4900.0,"Windows 10","64bit",16.0,700.0));
		addComp(new Servers("serv918251","Maker5",900.00,"Linux","32bit",4.0,250.0));
		
		
		//Can't desktops due to array
			
		
			//Mobile-Laptops
		addComp(new Mob_Laptops("lapt291592","Maker4",2000.07,"Windows 8.1",12.5,"Port1"));
		addComp(new Mob_Laptops("lapt519285","Maker2",6700.00,"MacOS",10.7,"Port7"));
		addComp(new Mob_Laptops("lapt613653","Maker45",4999.99,"Windows 10",16.0,"Port5"));
		
			//Mobile-Tablets
		addComp(new Mob_Tablets("tabl210485","Maker4",600.99,"Android",7.5,5.2));
		addComp(new Mob_Tablets("tabl512521","Maker6",850.00,"iOS",9.0,7.3));
		addComp(new Mob_Tablets("tabl829858","Maker3",350.00,"Android",13.4,6.2));
		addComp(new Mob_Tablets("tabl920182","Maker9",420.00,"Android",10.1,3.6));
		
		
		
	}
	
	
	
	
	
	
	//Printing company details

	public void printDetailsComp()
	{
		System.out.println("Company Name : " + CompName);
		System.out.println("Year created : " + CompYear);
		System.out.println("Company URL : " + CompURL);
	}
		
}

	

	
	
	
	
	

