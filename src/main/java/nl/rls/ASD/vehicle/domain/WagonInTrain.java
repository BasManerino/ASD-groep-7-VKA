package nl.rls.ASD.vehicle.domain;

import java.util.ArrayList;
import java.util.List;

import nl.rls.ASD.common.domain.DangerGoodsInWagon;
import nl.rls.composer.domain.code.BrakeType;

public class WagonInTrain {
    
    private BrakeType brakeType;
    private int totalLoadWeight;
    private List<DangerGoodsInWagon> dangerGoodsInWagons = new ArrayList<>();
    private WagonCode wagon;
    
	public WagonInTrain(BrakeType brakeType, int totalLoadWeight, List<DangerGoodsInWagon> dangerGoodsInWagons,
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
	public List<DangerGoodsInWagon> getDangerGoodsInWagons() {
		return dangerGoodsInWagons;
	}
	public WagonCode getWagon() {
		return wagon;
	}

}