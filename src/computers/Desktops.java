package computers;

public class Desktops extends Computers{

	//Variables for Desktops
	private double DeskProcSpeed;
	private String[] softdev= new String[3];


	
	
	//Setters-Getters
	
		public double getDeskProcSpeed() {
		return DeskProcSpeed;
	}


	public void setDeskProcSpeed(double deskProcSpeed) {
		DeskProcSpeed = deskProcSpeed;
	}


	public String[] getSoftdev() {
		return softdev;
	}


	public void setSoftdev(String[] softdev) {
		this.softdev = softdev;
	}


	
	
	//Constructors
	
	public Desktops()
	{
		
	}
	
	
	public Desktops(String sn ,String cm , double cc ,String cos ,double ps ,String[] sd)
	{
		super(sn,cm,cc,cos);
		DeskProcSpeed = ps;
		softdev = sd;
	}
	
	
	//Methods from Computers that need to be fixed


			
			public void print() {
				
				System.out.println("Desktop serial number : " + getCompSerialNo());
				System.out.println("\tDesktop Maker : " + getCompMaker());
				System.out.println("\tDesktop Cost : " + getCompCost());
				System.out.println("\tDesktop OS : " +  getCompOS());
				System.out.println("\tDesktop's Processor Speed : "+DeskProcSpeed);
				int cnt=1;
				System.out.println("Software Development Enviroments : ");
				for (int j=0;j<3;j++)
				{
					if (softdev[j]!=null)
					{
						System.out.println("["+cnt+"]"+"   "+softdev[j]);
					}
				}
				
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
}
