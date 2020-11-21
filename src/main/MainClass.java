package main;



import company.Company;
import computers.Computers;
import computers.Desktops;
import computers.Mob_Laptops;
import computers.Mob_Tablets;
import computers.Servers;
import employees.Employees;
import employees.Prog_Manager;
import employees.Programmer;
import employees.Secretary;

import tuc.ece.cs102.util.StandardInputRead;




public class MainClass {
	
	Company comp = new Company("Andrikopoulos" , 1974 , "www.andrikopoulos.co.uk");
	
	
	
	
	
	
	
	
	public static void main(String[] args)  {
		StandardInputRead red = new StandardInputRead();
		
		MainClass obj = new MainClass();
		
		int choice;
		
	
		
		
		
		
				do{
			
			
			//MENU----------------
		System.out.println("----------Software Development Company Database----------------------");
		System.out.println("----------1.Insert personnel in company's database-------------------");
		System.out.println("----------2.Search employees(by full name) and print-----------------");
		System.out.println("----------3.Delete employees(by full name)---------------------------");
		System.out.println("----------4.Insert computers in company's database-------------------");
		System.out.println("----------5.Search for computers(by serial number) and print---------");
		System.out.println("----------6.Delete computers(by serial number)-----------------------");
		System.out.println("----------7.Print company details and number of personnel/computers--");
		System.out.println("----------8.Print all employees(in alphabetical order)---------------");
		System.out.println("----------9.Print computers(in specific category) by serial number---");
		System.out.println("----------10.Exit----------------------------------------------------");
		choice = red.readPositiveInt("Please choose an option : ");
			//END OF MENU----------
		
		
		switch (choice)
		{
			case 1 : //INSERT PERSONNEL
				obj.addNewEmployee();
				red.readString("Press any key to continue...");
				break;
			case 2 : //SEARCH EMPLOYEES BY FULL NAME AND PRINT DETAILS
				obj.findAndPrintEmployee();
				red.readString("Press any key to continue...");
				break;
			case 3 : //DELETE EMPLOYEES BY FULL NAME
				obj.findAndDeleteEmployee();
				red.readString("Press any key to continue...");
				break;
			case 4 : //INSERT COMPUTERS
				obj.addNewComputer();
				red.readString("Press any key to continue...");
				break;
			case 5 : //SEARCH FOR COMPUTERS BY SERIAL NUMBER AND PRINT
				obj.findAndPrintComputer();
				red.readString("Press any key to continue...");
				break;
			case 6 : //DELETE COMPUTERS BY SERIAL NUMBER
				obj.findAndDeleteComputer();
				red.readString("Press any key to continue...");
				break;
			case 7 : //PRINT COMPANY DETAILS AND NUMBER OF EMPLOYEES/COMPUTERS
				obj.printCompanyDetails();
				red.readString("Press any key to continue...");
				break;
			case 8 : //PRINT EMPLOYEES IN A/B ORDER
				obj.printAllEmployees(); 
				red.readString("Press any key to continue...");
				break;
			case 9 : //PRINT COMPUTERS IN ___ CATEGORY BY SERIAL NUMBER ORDER
				String category= red.readString("Computers in which category would you like to see?");
				obj.printComputersInCategory(category);
				red.readString("Press any key to continue...");
				break;
			default : //EXIT
				
				break;
		}
		
		
		
		
		
		}while (choice!=10);
		
		
		
		
		
		System.out.println("\tProgramm terminated!");
		
		
	}
	
	
	
	
	//Methods
	
	
	public  void addNewEmployee(){
		StandardInputRead red = new StandardInputRead();
		int userOption=0;
		while(userOption>4 || userOption<1){
			System.out.println("------Insert New Employee-------");		
			System.out.println("1.---Manager------");
			System.out.println("2.---Programmer---");
			System.out.println("3.---Secretary----");
			System.out.println("4.---Exit---------");
			userOption= red.readPositiveInt("\tChoice : ");
		}
		String name,office;
		String phone;
		float salary;
		switch (userOption){		
		case 1:
			String list[] = new String[5];
			name = red.readString("\nManager's Full Name : ");
			phone = red.readString("\nManager's phone Number : ");
			office = red.readString("\nManager's Office : ");
			salary = red.readPositiveFloat("\nManager's Salary : ");
			System.out.println("\nProgramming languages can be from : ");
			System.out.println("\tPython,Java,C,C++,Pascal,Fortran,Matlab");
			String mL = red.readString("Programming Language used : ");
			String mD = red.readString("\nDesktop used by manager(serial number) : ");
			String mP = red.readString("\nProject manager is currently working on : ");
			String mE = red.readString("\nManager's email : ");
			String mMp = red.readString("\nManager's mobile phone Number : ");
			int proj = red.readPositiveInt("\nHow many projects does " + name + " manage?");
			for (int i=0;i<proj;i++)
				list[i] = red.readString("Name of " + i+1 + " project : ");
			Prog_Manager m = new Prog_Manager(name,phone,office,salary,mL,mD,mP,mE,mMp,list);
			comp.addPersonnel(m);
			System.out.println("Employee Added...");
			break;
		case 2:
			name = red.readString("\nProgrammer's Name : ");
			phone = red.readString("\nProgrammer's phone Number : ");
			office = red.readString("\nProgrammer's office : ");
			salary = red.readPositiveFloat("\nProgrammer's Salary : ");
			System.out.println("\nProgramming languages can be from : ");
			System.out.println("\tPython,Java,C,C++,Pascal,Fortran,Matlab");
			String pL = red.readString("Programming Language used : ");
			String pD = red.readString("\nDesktop used by programmer(serial number) : ");
			String pP = red.readString("\nProject programmer is currently working on : ");
			Programmer p = new Programmer(name, phone ,office, salary ,pL ,pD ,pP);
			comp.addPersonnel(p);
			System.out.println("Employee Added...");
			break;
		case 3:
			name = red.readString("Secretary's Name : ");
			phone = red.readString("Secretary's phone Number : ");
			office = red.readString("Secretary's Office : ");
			salary = red.readPositiveFloat("Secretary's Salary : ");
			System.out.println("Responsibility can be either sales,support,transactions or publicity");
			String resp = red.readString("Secretary's responsibility : ");
			Secretary s = new Secretary(name, phone , office , salary , resp);
			comp.addPersonnel(s);
			System.out.println("Employee Added...");
			break;	
		case 4:
			break;
		}
		
	}
	
	

	
	
	
	
	
	//Printing company details and NUMBER of employees/computers
	public void printCompanyDetails()
	{
		comp.printDetailsComp();
		System.out.println("Number of employees : " + comp.getPersonnel().getLength());
		System.out.println("Number of computers : " + comp.getComputers().getLength());
		
	}
	
	
	
	
	//Printing all employees in A/B order 
	public void printAllEmployees()
	{
			comp.getPersonnel().printList();
			
	}
	
	
	
	
	//print all computers in category cat (mobiles,servers or desktops etc) -->with printItemsInHierarchy
	public void printComputersInCategory(String cat) 
	{
		comp.getComputers().printItemsInHierarchy(cat);
		
	}
	
	
	
	
	//Adding new Computer
	public void addNewComputer()
	{
		StandardInputRead red = new StandardInputRead();
		int userOption=0;
		while(userOption>3 || userOption<1){
			System.out.println("------Insert New Computer-------");		
			System.out.println("1.-------Desktop----------------");
			System.out.println("2.-------Server-----------------");
			System.out.println("3.---Mobile(Laptop or Tablet)---");
			System.out.println("4.-------Exit-------------------");
			userOption= red.readPositiveInt("\tChoice : ");
			//For all computers
			String sN = red.readString("Serial number : ");
			String cM = red.readString("Computer Maker : ");
			float cC = red.readPositiveFloat("Computer's cost : ");
			String cOS = red.readString("Computer's Operating System : ");
			switch (userOption)
			{
				case 1 : //Inserting desktop
					String[] sd= new String[3];
					for (int j =0;j<3;j++)
						sd[j] = null;
					float pS = red.readPositiveFloat("\nProcessor's Speed(in GHz) : ");
					int sdNum=red.readPositiveInt("\nHow many software development enviroments does it use?(1 to 3)");
					for (int k=0;k<sdNum;k++)
						sd[k] = red.readString("\nSoftware development enviroment no" + (k+1));
					Desktops d = new Desktops(sN ,cM ,cC ,cOS ,pS ,sd );
					comp.addComp(d);
					break;
				case 2 : //Inserting Server
					String pT = red.readString("\nProcessor Type(32bit-64bit) : ");
					float sRAM = red.readPositiveFloat("\nRAM (in GBs) : ");
					float dC = red.readPositiveFloat("\nDisk Capacity (in TBs) : ");
					Servers s = new Servers(sN ,cM ,cC ,cOS ,pT ,sRAM ,dC);
					comp.addComp(s);
					break;
				case 3 : 
					int disInch = red.readPositiveInt("\nSize of display(in Inches) : ");
					System.out.println("\nWould you like to insert Laptop(l) or Tablet(t)?");
					String mobil = red.readString("Choose -l- or -t- : ");
					if (mobil.equalsIgnoreCase("l"))
					{
						//Inserting Laptop
						String dport =red.readString("Display port Type : ");
						Mob_Laptops l= new Mob_Laptops(sN ,cM ,cC ,cOS ,disInch ,dport);
						comp.addComp(l);
					}
					else {
						//Insert Tablet
						float bm = red.readPositiveFloat("Battery Power in MAhs : ");
						Mob_Tablets t= new Mob_Tablets(sN ,cM ,cC ,cOS ,disInch ,bm);
						comp.addComp(t);
					}
					break;
				case 4 :
					break;
			}
		}
	}
	
	
	
	
	//Searching for employee by full name
	public void findAndPrintEmployee(){				
		String key;		
		StandardInputRead red = new StandardInputRead();
		key = red.readString("Employee's Full Name : ");					
		Employees em = comp.findEmployeeByFullName(key);
		if (em == null){
			System.out.println("Employee not Found");
		}else{
			em.print();
		}			
	}
	
	
	
	//Searching for employee by full name and deleting
	public void findAndDeleteEmployee(){				
		String key;		
		StandardInputRead red = new StandardInputRead();
		key = red.readString("Employee's Full Name : ");					
		comp.findAndDeleteEmployeeByFullName(key);
	}
	
	
	
	
	
	
	
	
	
	//Searching for computer by serial number
		public void findAndPrintComputer(){				
			String key;		
			StandardInputRead red = new StandardInputRead();
			key = red.readString("Serial number : ");					
			Computers com = comp.findComputerBySerialNumber(key);
			if (com == null){
				System.out.println("Computer not Found");
			}else{
				com.print();
			}			
		}
	
	
	
		//Finding and deleting Computer by serial number
		public void findAndDeleteComputer(){				
			String key;		
			StandardInputRead red = new StandardInputRead();
			key = red.readString("Computer's serial Number : ");					
			comp.findAndDeleteComputerBySerialNumber(key);
		}
		
		
		
		
		
		
		
		
		
	
}
	
	
	
	
	
	

	
	
	
	

