package nl.rls.ASD.vehicle.domain;

public class Traction {
	
    protected TractionId id;
    private TractionTypeId tractionType;
    protected Long locoTypeNumber;
    protected String locoNumber;
    private int lengthOverBuffers;
    private int numberOfAxles;
    private int weight;
    private int brakeWeightG;
    private int brakeWeightP;
    
	public Traction(TractionId id, TractionTypeId tractionType, Long locoTypeNumber, String locoNumber,
			int lengthOverBuffers, int numberOfAxles, int weight, int brakeWeightG, int brakeWeightP) {
		this.id = id;
		this.tractionType = tractionType;
		this.locoTypeNumber = locoTypeNumber;
		this.locoNumber = locoNumber;
		this.lengthOverBuffers = lengthOverBuffers;
		this.numberOfAxles = numberOfAxles;
		this.weight = weight;
		this.brakeWeightG = brakeWeightG;
		this.brakeWeightP = brakeWeightP;
	}
	
	public TractionId getId() {
		return id;
	}
	public TractionTypeId getTractionType() {
		return tractionType;
	}
	public Long getLocoTypeNumber() {
		return locoTypeNumber;
	}
	public String getLocoNumber() {
		return locoNumber;
	}
	public int getLengthOverBuffers() {
		return lengthOverBuffers;
	}
	public int getNumberOfAxles() {
		return numberOfAxles;
	}
	public int getWeight() {
		return weight;
	}
	public int getBrakeWeightG() {
		return brakeWeightG;
	}
	public int getBrakeWeightP() {
		return brakeWeightP;
	}

	public void setId(TractionId id) {
		this.id = id;
	}

	public void setTractionType(TractionTypeId tractionType) {
		this.tractionType = tractionType;
	}

	public void setLocoTypeNumber(Long locoTypeNumber) {
		this.locoTypeNumber = locoTypeNumber;
	}

	public void setLocoNumber(String locoNumber) {
		this.locoNumber = locoNumber;
	}

	public void setLengthOverBuffers(int lengthOverBuffers) {
		this.lengthOverBuffers = lengthOverBuffers;
	}

	public void setNumberOfAxles(int numberOfAxles) {
		this.numberOfAxles = numberOfAxles;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setBrakeWeightG(int brakeWeightG) {
		this.brakeWeightG = brakeWeightG;
	}

	public void setBrakeWeightP(int brakeWeightP) {
		this.brakeWeightP = brakeWeightP;
	}
	
}
