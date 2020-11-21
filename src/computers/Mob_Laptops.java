package computers;

public class Mob_Laptops extends Mobiles {
	
	//Variables for Laptops
	private String displayPort;
	
	
	
	
	
	
	
	
	
	
	//Setters-Getters
	
	public String getDisplayPort() {
		return displayPort;
	}


	public void setDisplayPort(String displayPort) {
		this.displayPort = displayPort;
	}


	
	
	//Constructors
	
	public Mob_Laptops()
	{
		
	}
	

	public Mob_Laptops(String sn ,String cm , double cc , String cos ,double dis ,String dp)
	{
		super(sn,cm,cc,cos,dis);
		displayPort = dp;
	}
	
	//Methods from Computers that need to be fixed

	
	public void print() {
		
		System.out.println("Laptop's serial number : " + getCompSerialNo());
		System.out.println("\tLaptop Maker : " + getCompMaker());
		System.out.println("\tLaptop Cost : " + getCompCost());
		System.out.println("\tLaptop OS : " +  getCompOS());
		System.out.println("\tLaptop Display(inches) : " +  getDisplay());
		System.out.println("\tLaptop Display Port : " +  getDisplayPort());
		
	}
	
	
	
	
	
	
	
}
