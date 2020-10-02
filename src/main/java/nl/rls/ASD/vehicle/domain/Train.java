package nl.rls.ASD.vehicle.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import nl.rls.ASD.common.domain.JourneySectionId;
import nl.rls.ASD.common.domain.LocationId;
import nl.rls.ASD.message.domain.TrainCompositionMessageId;

public class Train {

    private int trainType;
    private String operationalTrainNumber;
    private Date scheduledTimeAtHandover;
    private Date scheduledDateTimeAtTransfer;
    private LocationId transferPoint;
    private CompanyId transfereeIM;
    
    private List<JourneySectionId> journeySections = new ArrayList<JourneySectionId>();
    private List<TrainCompositionMessageId> trainCompositionMessages = new ArrayList<TrainCompositionMessageId>();
    
	public Train(int trainType, String operationalTrainNumber, Date scheduledTimeAtHandover,
			Date scheduledDateTimeAtTransfer, LocationId transferPoint, CompanyId transfereeIM,
			List<JourneySectionId> journeySections, List<TrainCompositionMessageId> trainCompositionMessages) {
		super();
		this.trainType = trainType;
		this.operationalTrainNumber = operationalTrainNumber;
		this.scheduledTimeAtHandover = scheduledTimeAtHandover;
		this.scheduledDateTimeAtTransfer = scheduledDateTimeAtTransfer;
		this.transferPoint = transferPoint;
		this.transfereeIM = transfereeIM;
		this.journeySections = journeySections;
		this.trainCompositionMessages = trainCompositionMessages;
	}
	
	public int getTrainType() {
		return trainType;
	}
	public void setTrainType(int trainType) {
		this.trainType = trainType;
	}
	public String getOperationalTrainNumber() {
		return operationalTrainNumber;
	}
	public void setOperationalTrainNumber(String operationalTrainNumber) {
		this.operationalTrainNumber = operationalTrainNumber;
	}
	public Date getScheduledTimeAtHandover() {
		return scheduledTimeAtHandover;
	}
	public void setScheduledTimeAtHandover(Date scheduledTimeAtHandover) {
		this.scheduledTimeAtHandover = scheduledTimeAtHandover;
	}
	public Date getScheduledDateTimeAtTransfer() {
		return scheduledDateTimeAtTransfer;
	}
	public void setScheduledDateTimeAtTransfer(Date scheduledDateTimeAtTransfer) {
		this.scheduledDateTimeAtTransfer = scheduledDateTimeAtTransfer;
	}
	public LocationId getTransferPoint() {
		return transferPoint;
	}
	public void setTransferPoint(LocationId transferPoint) {
		this.transferPoint = transferPoint;
	}
	public CompanyId getTransfereeIM() {
		return transfereeIM;
	}
	public void setTransfereeIM(CompanyId transfereeIM) {
		this.transfereeIM = transfereeIM;
	}
	public List<JourneySectionId> getJourneySections() {
		return journeySections;
	}
	public void setJourneySections(List<JourneySectionId> journeySections) {
		this.journeySections = journeySections;
	}
	public List<TrainCompositionMessageId> getTrainCompositionMessages() {
		return trainCompositionMessages;
	}
	public void setTrainCompositionMessages(List<TrainCompositionMessageId> trainCompositionMessages) {
		this.trainCompositionMessages = trainCompositionMessages;
	}

}
