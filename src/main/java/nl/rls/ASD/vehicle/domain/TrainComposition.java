package nl.rls.ASD.vehicle.domain;

import nl.rls.ASD.common.domain.JourneySection;

public class TrainComposition implements Cloneable {

	private TrainCompositionId id;
    private String brakeType;
    private int livestockOrPeopleIndicator;
    private JourneySection journeySection;
    
	public TrainComposition(TrainCompositionId id, String brakeType, int livestockOrPeopleIndicator,
			JourneySection journeySection) {
		this.id = id;
		this.brakeType = brakeType;
		this.livestockOrPeopleIndicator = livestockOrPeopleIndicator;
		this.journeySection = journeySection;
	}
	
	public TrainCompositionId getId() {
		return id;
	}
	public String getBrakeType() {
		return brakeType;
	}
	public int getLivestockOrPeopleIndicator() {
		return livestockOrPeopleIndicator;
	}
	public JourneySection getJourneySection() {
		return journeySection;
	}

	public void setId(TrainCompositionId id) {
		this.id = id;
	}

	public void setBrakeType(String brakeType) {
		this.brakeType = brakeType;
	}

	public void setLivestockOrPeopleIndicator(int livestockOrPeopleIndicator) {
		this.livestockOrPeopleIndicator = livestockOrPeopleIndicator;
	}

	public void setJourneySection(JourneySection journeySection) {
		this.journeySection = journeySection;
	}
    
}
