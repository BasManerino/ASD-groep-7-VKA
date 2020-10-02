package nl.rls.ASD.vehicle.domain;

public class TractionType {
    private TractionTypeId id;
    private String code;
	private String description;
	
    public TractionType(TractionTypeId id, String code, String description) {
		this.id = id;
		this.code = code;
		this.description = description;
	}

	public TractionTypeId getId() {
		return id;
	}

	public String getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}    
    
}
