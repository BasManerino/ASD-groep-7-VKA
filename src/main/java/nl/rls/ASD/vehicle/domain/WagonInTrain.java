package nl.rls.ASD.vehicle.domain;

import java.util.ArrayList;
import java.util.List;

import nl.rls.ASD.common.domain.DangerGoodsInWagonId;

public class WagonInTrain {
    
    private BrakeType brakeType;
    private int totalLoadWeight;
    private List<DangerGoodsInWagonId> dangerGoodsInWagons = new ArrayList<>();
    private WagonCode wagon;
    
	public WagonInTrain(BrakeType brakeType, int totalLoadWeight, List<DangerGoodsInWagonId> dangerGoodsInWagons,
			WagonCode wagon) {
		super();
		this.brakeType = brakeType;
		this.totalLoadWeight = totalLoadWeight;
		this.dangerGoodsInWagons = dangerGoodsInWagons;
		this.wagon = wagon;
	}
	
	public BrakeType getBrakeType() {
		return brakeType;
	}
	public int getTotalLoadWeight() {
		return totalLoadWeight;
	}
	public List<DangerGoodsInWagonId> getDangerGoodsInWagons() {
		return dangerGoodsInWagons;
	}
	public WagonCode getWagon() {
		return wagon;
	}

}