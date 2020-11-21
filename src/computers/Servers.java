package computers;

public class Servers extends Computers{
	
	//Variables for Servers
	private String processorType;
	private double ServerRAM;
	private double diskCapacity;
	
	
	//Setters-Getters
	
	public String getProcessorType() {
		return processorType;
	}


	public void setProcessorType(String processorType) {
		this.processorType = processorType;
	}


	public double getServerRAM() {
		return ServerRAM;
	}


	public void setServerRAM(double serverRAM) {
		ServerRAM = serverRAM;
	}


	public double getDiskCapacity() {
		return diskCapacity;
	}


	public void setDiskCapacity(double diskCapacity) {
		this.diskCapacity = diskCapacity;
	}

	
	//Constructors
	
	public Servers()
	{
		
	}
	
	public Servers(String sn ,String cm , double cc ,String cos ,String pt ,double sram ,double dc)
	{
		super(sn,cm,cc,cos);
		processorType = pt;
		ServerRAM = sram;
		diskCapacity = dc;
	}

	//Methods from Computers that need to be fixed

	
	public void print() {
		
		System.out.println("Server's serial number : " + getCompSerialNo());
		System.out.println("\tServer Maker : " + getCompMaker());
		System.out.println("\tServer Cost : " + getCompCost());
		System.out.println("\tServer OS : " +  getCompOS());
		System.out.println("\tServer Processor Type : " + processorType );
		System.out.println("\tServer RAM  : " +  ServerRAM);
		System.out.println("\tServer disk Capacity : " +  diskCapacity);
		
		
		
	}
	
	
	
	
	
	
	
	

}
