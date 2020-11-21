package computers;

public abstract class Mobiles extends Computers{
	
	
	//Variables for Mobiles
	private double display;

	
	
	
	//Setters-Getters
	public double getDisplay() {
		return display;
	}

	public void setDisplay(double display) {
		this.display = display;
	}
	
	
	//Constructors
	
	public Mobiles()
	{
		
	}
	
	
	
	public Mobiles(String sn ,String cm , double cc , String cos ,double dis)
	{
		super(sn,cm,cc,cos);
		display =dis;
	}
	
	
}
