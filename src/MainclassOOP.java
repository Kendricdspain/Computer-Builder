import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.*;

/**
 * This Mainclass adds the scanner obj and a dynamic arraylist to store the address of each computer in memory.
 * The Computer() will instantiate and create all the needed values that are required to be stored in the address for that specific instance
 * of the computer object.
 * @author kendricdspain
 *
 */
public class MainclassOOP {
	


	public static void main(String[] args) {
		Boolean verbose = true;
		Scanner in = new Scanner(System.in);
		int numberOfComputers = 0;
		ArrayList arr = null;
		int comp = 0;
		
		while(verbose)
		{
			System.out.println(" _________________________________\n"
							+  " *|           -Main Menu-         |*\n"
							+  " *|                               |*\n"
							+  " *|   1) Create Computer(s)       |*\n"
							+  " *|                               |*\n"
							+  " *|   2) Delete Computer          |*\n"
							+  " *|                               |*\n"
							+  " *|   3) Display Computer(s)      |*\n"
							+  " *|                               |*\n"
							+  " *|   4) Exit                     |*\n"
							+  " *|_______________________________|*\n");
	
	System.out.println("\n\nChoose an option from Menu: 1, 2, 3 or 4: ");
	
	
	int choice1 = Integer.valueOf(in.nextLine());
	switch (choice1) {
	case 1:
		arr = new ArrayList();
		System.out.println("Enter Number of Computers to store: ");
		numberOfComputers = Integer.valueOf(in.nextLine());
		comp = 0;
		createComputer(arr, in, numberOfComputers, comp);
		break;
	case 2:
		if(arr.isEmpty()) emptyObject();
		System.out.println("Enter Name of Computer to delete: ");
		delete(arr, in);
		break;
	case 3:
		if(arr.isEmpty()) 
			emptyObject();
		else
			display(arr, in, choice1);
			break;
	case 4:
		verbose = false;
		break;
	
					}
	
	
		}	
	}
	/**
	 * Method will return all the attributes and data of that computer object in the 
	 * console.
	 * @param arr arraylist that stores addresses of computer obj in memory.
	 * @param in Scanner used to save users input.
	 * @param index Locates which poistion and obj in the arraylist the user is pointing to.
	 */
	public static void display(ArrayList arr, Scanner in, int index) {
	
		
		System.out.println(" _________________________________\n"
						+  " *|          -Display Menu-       |*\n"
						+  " *|                               |*");
		for(int i=0; i< arr.size(); i++) {
			System.out.println(" *|      "+i + ") "+((Computer) arr.get(i)).getName_Of_Computer()+"            |*");
			System.out.println(" *|                               |*");
	
		}
		System.out.println(" *|_______________________________|*\n");
		
		System.out.println("Enter number to display Computer's properties : ");
		int arrIndex = Integer.valueOf(in.nextLine());
		
		System.out.println(" *|      "+arrIndex + ") "+((Computer) arr.get(arrIndex)).getName_Of_Computer());
		System.out.println(" *|       		 CPU: "+((Computer) arr.get(arrIndex)).getCPU().getNAME());
		System.out.println(" *|       		 CPU Socket Size: "+((Computer) arr.get(arrIndex)).getCPU().getSOCKET_SIZE());
		System.out.println(" *|      		 Number Of CPU Cores: "+((Computer) arr.get(arrIndex)).getCPU().getNumb_Of_CPU_Cores());
		System.out.println(" *|      		 CPU ClockSpeed (Ghz) : "+((Computer) arr.get(arrIndex)).getCPU().getCLOCK_SPEED());
		
		System.out.println(" *|      		 Graphics Card: "+((Computer) arr.get(arrIndex)).getGraphicsCard().getNAME());
		System.out.println(" *|      		 GPU Base Clock (Mhz): "+((Computer) arr.get(arrIndex)).getGraphicsCard().getBASE_CLOCK());
		System.out.println(" *|      		 GPU Boost Clock (Mhz): "+((Computer) arr.get(arrIndex)).getGraphicsCard().getBOOST_CLOCK());
		System.out.println(" *|      		 GPU VR Ready: "+((Computer) arr.get(arrIndex)).getGraphicsCard().getVR_READY());
		System.out.println(" *|      		 GPU Memory Speed (Gbps): "+((Computer) arr.get(arrIndex)).getGraphicsCard().getMEMORY_SPEED());
		System.out.println(" *|      		 GPU Memory Type: "+((Computer) arr.get(arrIndex)).getGraphicsCard().getMEMORY_TYPE());
		System.out.println(" *|      		 GPU Max Temp. (Deg C): "+((Computer) arr.get(arrIndex)).getGraphicsCard().getMAX_TEMP());
		System.out.println(" *|      		 GPU Power Consumption (Watts): "+((Computer) arr.get(arrIndex)).getGraphicsCard().getPOWER_CONSUMPTION());
		
		System.out.println(" *|      		 Motherboard: "+((Computer) arr.get(arrIndex)).getMotherBoard());
		System.out.println(" *|      		 RAM Size: "+((Computer) arr.get(arrIndex)).RAM_Size());
		System.out.println(" *|      		 RAM: "+((Computer) arr.get(arrIndex)).RAM());
		System.out.println(" *|      		 Power Supply Unit: "+((Computer) arr.get(arrIndex)).getPowerSupplyUnit());
		System.out.println(" *|       		 Case: "+((Computer) arr.get(arrIndex)).getCase());
		System.out.println(" *|      		 SSD Size: "+((Computer) arr.get(arrIndex)).getSSD_Size());
		System.out.println(" *|      		 HDD Size: "+((Computer) arr.get(arrIndex)).getHDD_Size());
	}
	
	public static void createComputer(ArrayList arr,Scanner in, int numberOfComputers, int comp) {
		String SystemName, CPU_NAME, SOCKET_SIZE, GPU_NAME, GPU_MEMORY_TYPE, MotherBoard,
		GraphicsCard_VRAMSIZE, RAM_Size, RAM, PowerSupplyUnit, 
		Case, SSD_Size, HDD_Size = null;
		
		Integer Numb_Of_CPU_Cores, GPU_MEMORY_SPEED, GPU_MAX_TEMP, GPU_POWER_CONSUMPTION;
		Float CPU_CLOCK_SPEED, GPU_BASE_CLOCK, GPU_BOOST_CLOCK;
		Boolean GPU_VR_READY;
		
		for(int i=0; i<numberOfComputers; i++) {
			++comp;
			
			System.out.println("Enter Computer Specifications for computer "+comp +" : \n");
			
			System.out.println("Input Computer "+comp+"'s Name: ");
			SystemName = in.nextLine();
			
			//CPU Fields
			System.out.println("Input Computer "+comp+"'s CPU: ");
			CPU_NAME = in.nextLine();
			
			System.out.println("Input Computer "+comp+"'s CPU Socket Size: ");
			SOCKET_SIZE = in.nextLine();
			
			System.out.println("Input Computer "+comp+"'s Number Of CPU Cores: ");
			Numb_Of_CPU_Cores = Integer.parseInt(in.nextLine());
			
			System.out.println("Input Computer "+comp+"'s CPU ClockSpeed: Ex. X.X (Ghz)");
			CPU_CLOCK_SPEED = Float.parseFloat(in.nextLine());
			
			// GPU Fields
			System.out.println("Input Computer "+comp+"'s GraphicsCard: ");
			GPU_NAME = in.nextLine();
			
			System.out.println("Input Computer "+comp+"'s GPU BaseClock (Mhz): ");
			GPU_BASE_CLOCK = Float.parseFloat(in.nextLine());
			
			System.out.println("Input Computer "+comp+"'s GPU BoostClock (Mhz): ");
			GPU_BOOST_CLOCK = Float.parseFloat(in.nextLine());
			
			System.out.println("Input Computer "+comp+"'s GPU VR-Ready (True or False): ");
			GPU_VR_READY = Boolean.parseBoolean(in.nextLine());
			
			System.out.println("Input Computer "+comp+"'s GPU Memory Speed (Gbps): ");
			GPU_MEMORY_SPEED = Integer.parseInt(in.nextLine());
			
			System.out.println("Input Computer "+comp+"'s GPU Memory Type: ");
			GPU_MEMORY_TYPE = in.nextLine();
			
			System.out.println("Input Computer "+comp+"'s GPU Max Temperature (Deg. Celcius): ");
			GPU_MAX_TEMP = Integer.parseInt(in.nextLine());
			
			System.out.println("Input Computer "+comp+"'s GPU Power Used (In Watts): ");
			GPU_POWER_CONSUMPTION = Integer.parseInt(in.nextLine());
			
			// MotherBoard Fields
			System.out.println("Input Computer "+comp+"'s MotherBoard: ");
			MotherBoard = in.nextLine();
			
			System.out.println("Input Computer "+comp+"'s RAM Size: ");
			RAM_Size = in.nextLine();
			
			System.out.println("Input Computer "+comp+"'s RAM: ");
			RAM = in.nextLine();
			
			System.out.println("Input Computer "+comp+"'s Power Supply Unit Specifications: ");
			PowerSupplyUnit = in.nextLine();
			
			System.out.println("Input Computer "+comp+"'s Case Description: ");
			Case = in.nextLine();
			
			System.out.println("Input Computer "+comp+"'s Solid State Drive Size: ");
			SSD_Size = in.nextLine();
			
			System.out.println("Input Computer "+comp+"'s Hard Disk Drive Size: ");
			HDD_Size = in.nextLine();
			
			Computer computer = new Computer(SystemName, CPU_NAME, SOCKET_SIZE, Numb_Of_CPU_Cores, CPU_CLOCK_SPEED,
			GPU_NAME, GPU_BASE_CLOCK, GPU_BOOST_CLOCK, GPU_VR_READY, GPU_MEMORY_SPEED, GPU_MEMORY_TYPE,  GPU_MAX_TEMP, GPU_POWER_CONSUMPTION,
			MotherBoard, RAM_Size, RAM, PowerSupplyUnit, Case, SSD_Size, HDD_Size);
			
			arr.add(computer);
		}
		
	}
	public static void emptyObject() {
		
		try
		{
		System.out.println(" _________________________________\n"
				+  " *|          -Display Menu-       |*\n"
				+  " *|                               |*"
				+  " *|           No computers        |*");
		System.out.println(" *|_______________________________|*\n");
		
		System.out.println("Create a Computer first!");
		}
		
		catch(NullPointerException e) {
			
		}
	}
	
	
	
	
	public static void delete(ArrayList arr, Scanner in) {
		System.out.println(" _________________________________\n"
				+  " *|          -Delete Menu-        |*\n"
				+  " *|                               |*");
		for(int i=0; i< arr.size(); i++) {
			System.out.println(" *|      "+i + ") "+((Computer) arr.get(i)).getName_Of_Computer()+"               |*");
			System.out.println(" *|                               |*");

		}
		System.out.println(" *|_______________________________|*\n");
		
		System.out.println("Enter number to delete a Computer: ");
		int arrIndex = Integer.valueOf(in.nextLine());
		Object deleteComputer = arr.get(arrIndex);
			
		deleteComputer = null;
		System.gc();
	}
}
