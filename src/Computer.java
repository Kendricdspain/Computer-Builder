

/**Class is the parent class computer and has private variables that are accessed through child classes
 * by making an instance of a the computer class and using the get and set methods.
 * 
 * @author kendricdspain
 *
 */
public class Computer {
	private String Name_Of_Computer;
	private CPU CPU;
	private GPU GraphicsCard;
	private String MotherBoard;
	private String RAM;
	private String RAM_Size;
	private String PowerSupplyUnit;
	private String Case;
	private String SSD_Size;
	private String HDD_Size;

	public Computer(String NewName_Of_Computer, String CPU_NAME, String SOCKET_SIZE,Integer Numb_Of_CPU_Cores,Float CLOCK_SPEED, 
			String GPU_NAME, Float BASE_CLOCK, Float BOOST_CLOCK, Boolean VR_READY, Integer MEMORY_SPEED, String MEMORY_TYPE, Integer MAX_TEMP, Integer POWER_CONSUMPTION,
			String NewMotherBoard,
			String NewRAM, String NewRAM_Size, String NewPowerSupplyUnit, String NewCase, String NewSSD_Size, String NewHDD_Size) {
		
		Name_Of_Computer = NewName_Of_Computer;
		this.CPU = new CPU(CPU_NAME, SOCKET_SIZE, Numb_Of_CPU_Cores, CLOCK_SPEED);
		
		this.GraphicsCard = new GPU(GPU_NAME, BASE_CLOCK, BOOST_CLOCK, VR_READY, MEMORY_SPEED,
			 MEMORY_TYPE,  MAX_TEMP, POWER_CONSUMPTION);
		
		MotherBoard = NewMotherBoard;
		RAM = NewRAM;
		RAM_Size = NewRAM_Size;
		PowerSupplyUnit = NewPowerSupplyUnit;
		Case = NewCase;
		SSD_Size = NewSSD_Size;
		HDD_Size = NewHDD_Size;
		
	}
	
	//Methods return private variables through public getter methods.
	public String getName_Of_Computer() {
		return Name_Of_Computer;
	}
	
	public CPU getCPU() {
		return CPU;
	}
		
	public GPU getGraphicsCard() {
		return GraphicsCard;
	}
	
	public String getMotherBoard() {
		return MotherBoard;
	}
	
	
	public String RAM() {
		return RAM;
	}
	
	public String RAM_Size() {
		return RAM_Size;
	}
	
	public String getPowerSupplyUnit() {
		return PowerSupplyUnit;
	}
	
	public String getCase() {
		return Case;
	}
	
	public String getSSD_Size() {
		return SSD_Size;
	}
	
	public String getHDD_Size() {
		return HDD_Size;
	}
	
	//Methods set the data to specified arguments through public setter methods.
	public void setName_Of_Computer(String NewName_Of_Computer) {
		Name_Of_Computer = NewName_Of_Computer;
	}
	
	public void setCPU(CPU NewCPU) {
		 CPU = NewCPU;
	}
	
	
	public void setGraphicsCard(GPU NewGraphicsCard) {
		GraphicsCard = NewGraphicsCard;
	}
	
	public void setMotherBoard(String NewMotherBoard) {
		MotherBoard = NewMotherBoard;
	}
	
	public void setRAM(String NewRAM) {
		RAM = NewRAM;
	}
	
	public void setRAM_Size(String NewRAM_Size) {
		RAM_Size = NewRAM_Size;
	}
	
	public void setPowerSupplyUnit(String NewPowerSupplyUnit) {
		PowerSupplyUnit = NewPowerSupplyUnit;
	}
	
	public void setCase(String NewCase) {
		Case = NewCase;
	}
	
	public void setSSD_Size(String NewSSD_Size) {
		SSD_Size = NewSSD_Size;
	}
	
	public void setHDD_Size(String NewHDD_Size) {
		HDD_Size = NewHDD_Size;
	}
	
}
