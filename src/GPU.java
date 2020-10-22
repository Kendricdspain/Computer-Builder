
class GPU {
	
	private String NAME;			   // GPU Name
	private Float BASE_CLOCK;		   // 1XXX (Mhz)
	private Float BOOST_CLOCK;		   // 1XXX (Mhz)
	private Boolean VR_READY;		   // True or False
	private Integer MEMORY_SPEED;      // 8 Gbps
	private String MEMORY_TYPE;		   // DDR4, GDDR5 etc.
	private Integer MAX_TEMP;		   // In deg C
	private Integer POWER_CONSUMPTION; // Measured in Watts
	
	public GPU(String nAME, Float bASE_CLOCK, Float bOOST_CLOCK, Boolean vR_READY, Integer mEMORY_SPEED,
			String mEMORY_TYPE, Integer mAX_TEMP, Integer pOWER_CONSUMPTION) {
		super();
		NAME = nAME;
		BASE_CLOCK = bASE_CLOCK;
		BOOST_CLOCK = bOOST_CLOCK;
		VR_READY = vR_READY;
		MEMORY_SPEED = mEMORY_SPEED;
		MEMORY_TYPE = mEMORY_TYPE;
		MAX_TEMP = mAX_TEMP;
		POWER_CONSUMPTION = pOWER_CONSUMPTION;
	}

	String getNAME() {
		return NAME;
	}

	private void setNAME(String nAME) {
		NAME = nAME;
	}

	Float getBASE_CLOCK() {
		return BASE_CLOCK;
	}

	private void setBASE_CLOCK(Float bASE_CLOCK) {
		BASE_CLOCK = bASE_CLOCK;
	}

	Float getBOOST_CLOCK() {
		return BOOST_CLOCK;
	}

	private void setBOOST_CLOCK(Float bOOST_CLOCK) {
		BOOST_CLOCK = bOOST_CLOCK;
	}

	Boolean getVR_READY() {
		return VR_READY;
	}

	private void setVR_READY(Boolean vR_READY) {
		VR_READY = vR_READY;
	}

	Integer getMEMORY_SPEED() {
		return MEMORY_SPEED;
	}

	private void setMEMORY_SPEED(Integer mEMORY_SPEED) {
		MEMORY_SPEED = mEMORY_SPEED;
	}

	String getMEMORY_TYPE() {
		return MEMORY_TYPE;
	}

	private void setMEMORY_TYPE(String mEMORY_TYPE) {
		MEMORY_TYPE = mEMORY_TYPE;
	}

	Integer getMAX_TEMP() {
		return MAX_TEMP;
	}

	private void setMAX_TEMP(Integer mAX_TEMP) {
		MAX_TEMP = mAX_TEMP;
	}

	Integer getPOWER_CONSUMPTION() {
		return POWER_CONSUMPTION;
	}

	private void setPOWER_CONSUMPTION(Integer pOWER_CONSUMPTION) {
		POWER_CONSUMPTION = pOWER_CONSUMPTION;
	}
}
