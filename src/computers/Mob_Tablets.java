package computers;

public class Mob_Tablets extends Mobiles {

	//Variables for Tablets
	private double batteryMAh;
	
	
	
	
	
	//Setters-Getters
	
	public double getBatteryMAh() {
		return batteryMAh;
	}


	public void setBatteryMAh(double batteryMAh) {
		this.batteryMAh = batteryMAh;
	}


	
	
	
	//Constructors
	public Mob_Tablets()
	{
		
	}
	
	
	public Mob_Tablets(String sn ,String cm , double cc , String cos ,double dis ,double  bMAh)
	{
		super(sn,cm,cc,cos,dis);
		batteryMAh =bMAh;
	}
	
	
	
	//Methods from Computers that need to be fixed
	
	

	public void print() {
		
		
		System.out.println("Tablet's serial number : " + getCompSerialNo());
		System.out.println("\tTablet Maker : " + getCompMaker());
		System.out.println("\tTablet Cost : " + getCompCost());
		System.out.println("\tTablet OS : " +  getCompOS());
		System.out.println("\tTablet Display(inches) : " +  getDisplay());
		System.out.println("\tTablet Battery Power(in MAh) : " +  batteryMAh);
		
		
	}
	
	
	
	
	
	
	
	
	
}
