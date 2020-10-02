package nl.rls.ASD.vehicle.domain;

public abstract class RollingStock implements Cloneable {
	
    private RollingStockId id;
    private int position;
    private String stockType;
    
	public RollingStock(RollingStockId id, int position, String stockType) {
		this.id = id;
		this.position = position;
		this.stockType = stockType;
	}
	public RollingStockId getId() {
		return id;
	}
	public int getPosition() {
		return position;
	}
	public String getStockType() {
		return stockType;
	}
	public void setId(RollingStockId id) {
		this.id = id;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public void setStockType(String stockType) {
		this.stockType = stockType;
	}
 
}
