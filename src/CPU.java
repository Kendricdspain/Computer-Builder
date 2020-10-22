
public class CPU {
	private String NAME;
	private String SOCKET_SIZE;
	private Integer Numb_Of_CPU_Cores;
	private Float CLOCK_SPEED;
	
	public CPU(String NEW_NAME, String NEW_SOCKET_SIZE, Integer NEW_Numb_Of_CPU_Cores, Float NEW_CLOCK_SPEED) {
		NAME = NEW_NAME;
		SOCKET_SIZE = NEW_SOCKET_SIZE;
		Numb_Of_CPU_Cores = NEW_Numb_Of_CPU_Cores;
		CLOCK_SPEED = NEW_CLOCK_SPEED;
	}
	
	String getNAME() {
		return NAME;
	}
	private void setNAME(String NEW_NAME) {
		NAME = NEW_NAME;
	}
	String getSOCKET_SIZE() {
		return SOCKET_SIZE;
	}
	private void setSOCKET_SIZE(String NEW_SOCKET_SIZE) {
		SOCKET_SIZE = NEW_SOCKET_SIZE;
	}
	Integer getNumb_Of_CPU_Cores() {
		return Numb_Of_CPU_Cores;
	}
	private void setNumb_Of_CPU_Cores(Integer NEW_Numb_Of_CPU_Cores) {
		Numb_Of_CPU_Cores = NEW_Numb_Of_CPU_Cores;
	}
	Float getCLOCK_SPEED() {
		return CLOCK_SPEED;
	}
	private void setCLOCK_SPEED(Float NEW_CLOCK_SPEED) {
		CLOCK_SPEED = NEW_CLOCK_SPEED;
	} 
}
