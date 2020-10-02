package nl.rls.ASD.vehicle.domain;

public class Wagon {
	
    private String numberFreight;
    private String typeName;
    private WagonCode code;
    private int lengthOverBuffers;
    private int wagonNumberOfAxles;
    private int brakeWeightG;
    private int brakeWeightP;
    private int wagonWeightEmpty;
    private int maxSpeed;
    
	public Wagon(String numberFreight, String typeName, WagonCode code, int lengthOverBuffers, int wagonNumberOfAxles,
			int brakeWeightG, int brakeWeightP, int wagonWeightEmpty, int maxSpeed) {
		this.numberFreight = numberFreight;
		this.typeName = typeName;
		this.code = code;
		this.lengthOverBuffers = lengthOverBuffers;
		this.wagonNumberOfAxles = wagonNumberOfAxles;
		this.brakeWeightG = brakeWeightG;
		this.brakeWeightP = brakeWeightP;
		this.wagonWeightEmpty = wagonWeightEmpty;
		this.maxSpeed = maxSpeed;
	}
	
	public String getNumberFreight() {
		return numberFreight;
	}
	public String getTypeName() {
		return typeName;
	}
	public WagonCode getCode() {
		return code;
	}
	public int getLengthOverBuffers() {
		return lengthOverBuffers;
	}
	public int getWagonNumberOfAxles() {
		return wagonNumberOfAxles;
	}
	public int getBrakeWeightG() {
		return brakeWeightG;
	}
	public int getBrakeWeightP() {
		return brakeWeightP;
	}
	public int getWagonWeightEmpty() {
		return wagonWeightEmpty;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setNumberFreight(String numberFreight) {
		this.numberFreight = numberFreight;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public void setCode(WagonCode code) {
		this.code = code;
	}

	public void setLengthOverBuffers(int lengthOverBuffers) {
		this.lengthOverBuffers = lengthOverBuffers;
	}

	public void setWagonNumberOfAxles(int wagonNumberOfAxles) {
		this.wagonNumberOfAxles = wagonNumberOfAxles;
	}

	public void setBrakeWeightG(int brakeWeightG) {
		this.brakeWeightG = brakeWeightG;
	}

	public void setBrakeWeightP(int brakeWeightP) {
		this.brakeWeightP = brakeWeightP;
	}

	public void setWagonWeightEmpty(int wagonWeightEmpty) {
		this.wagonWeightEmpty = wagonWeightEmpty;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}	
    
}
