package nl.rls.ASD.vehicle.domain;

public class TractionInTrain implements Cloneable {

    private TractionId traction;
    protected Integer driverIndication;
    
	public TractionInTrain(TractionId traction, Integer driverIndication) {
		super();
		this.traction = traction;
		this.driverIndication = driverIndication;
	}
	
	public TractionId getTraction() {
		return traction;
	}
	public Integer getDriverIndication() {
		return driverIndication;
	}
    
}
