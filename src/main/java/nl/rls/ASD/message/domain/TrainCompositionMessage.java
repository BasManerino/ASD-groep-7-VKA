package nl.rls.ASD.message.domain;

import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

import nl.rls.ASD.common.domain.CompanyId;
import nl.rls.composer.domain.Company;
import nl.rls.composer.domain.Train;

public class TrainCompositionMessage{
	private TrainCompositionMessageId id;
	private GenericMessageId genericMessageId;
    private String objectType;
    private CompanyId companyId;
    private String core;
    private String variant;
    private int timetableYear;
    private Date startDate;
	private TrainId trainId;
	
    public TrainCompositionMessage(TrainCompositionMessageId id, String objectType, CompanyId companyId, String core,
			String variant, int timetableYear, Date startDate, TrainId trainId) {
		super();
		this.id = id;
		this.objectType = objectType;
		this.companyId = companyId;
		this.core = core;
		this.variant = variant;
		this.timetableYear = timetableYear;
		this.startDate = startDate;
		this.trainId = trainId;
	}

	public TrainCompositionMessageId getId() {
		return id;
	}

	public void setId(TrainCompositionMessageId id) {
		this.id = id;
	}

	public GenericMessageId getGenericMessageId() {
		return genericMessageId;
	}

	public void setGenericMessageId(GenericMessageId genericMessageId) {
		this.genericMessageId = genericMessageId;
	}

	public String getObjectType() {
		return objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public CompanyId getCompanyId() {
		return companyId;
	}

	public void setCompanyId(CompanyId companyId) {
		this.companyId = companyId;
	}

	public String getCore() {
		return core;
	}

	public void setCore(String core) {
		this.core = core;
	}

	public String getVariant() {
		return variant;
	}

	public void setVariant(String variant) {
		this.variant = variant;
	}

	public int getTimetableYear() {
		return timetableYear;
	}

	public void setTimetableYear(int timetableYear) {
		this.timetableYear = timetableYear;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public TrainId getTrainId() {
		return trainId;
	}

	public void setTrainId(TrainId trainId) {
		this.trainId = trainId;
	}
    
    
}
