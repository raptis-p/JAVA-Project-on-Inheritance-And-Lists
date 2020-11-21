package computers;

public abstract class Computers {
	
	//Variables for Computers
	private String compSerialNo;
	private String compMaker;
	private double compCost;
	private String compOS;
	
	
	//Setters-Getters
	public String getCompSerialNo() {
		return compSerialNo;
	}
	public void setCompSerialNo(String compSerialNo) {
		this.compSerialNo = compSerialNo;
	}
	public String getCompMaker() {
		return compMaker;
	}
	public void setCompMaker(String compMaker) {
		this.compMaker = compMaker;
	}
	public double getCompCost() {
		return compCost;
	}
	public void setCompCost(double compCost) {
		this.compCost = compCost;
	}
	public String getCompOS() {
		return compOS;
	}
	public void setCompOS(String compOS) {
		this.compOS = compOS;
	}
	
	
	//Constructors
	
	public Computers()
	{
		
	}
	
	public Computers(String sN , String cM , double cC , String cOS)
	{
		compSerialNo = sN ;
		compMaker = cM ;
		compCost = cC ;
		compOS = cOS ; 
	}
	

	
	
	public abstract void print();
	
	
}
