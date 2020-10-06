package nl.rls.ASD.vehicle.domain;

public class TractionInTrain  extends RollingStock implements Cloneable {

    private TractionId traction;
    protected Integer driverIndication;
    
	public TractionInTrain(TractionId traction, Integer driverIndication) {
		super(new RollingStockId(traction.getId()), driverIndication, "Locomotive");
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
