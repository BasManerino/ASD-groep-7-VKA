package nl.rls.ASD.vehicle.persistence.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import nl.rls.ASD.common.domain.*;
import nl.rls.ASD.message.domain.TrainCompositionMessageId;
import nl.rls.ASD.vehicle.domain.*;


public class MockTrainRepository implements TrainRepository{

	@Override
	public boolean getTrainById(boolean check) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Train getTrainById(int id) {
		if (id == 1) {
			TrainId trainId = new TrainId(id);
			int trainType = 1;
			String operationalTrainNumber = "000002";
			Date scheduledTimeAtHandover = null;
			Date scheduledTimeAtTransfer = null;
			LocationId transferPoint = new LocationId(1);
			CompanyId companyId = new CompanyId(1);
			
			List<JourneySectionId> journeySections = new ArrayList<JourneySectionId>();
			List<TrainCompositionMessageId> trainCompositionMessages = new ArrayList<TrainCompositionMessageId>();
			
			return new Train(trainId,
					trainType,
					operationalTrainNumber,
					scheduledTimeAtHandover,
					scheduledTimeAtTransfer,
					transferPoint,
					companyId,
					journeySections,
					trainCompositionMessages);
		}
		
		if (id == 2) {
			TrainId trainId = new TrainId(id);
			int trainType = 2;
			String operationalTrainNumber = "000001";
			Date scheduledTimeAtHandover = null;
			Date scheduledTimeAtTransfer = null;
			LocationId transferPoint = new LocationId(2);
			CompanyId companyId = new CompanyId(2);
			
			List<JourneySectionId> journeySections = new ArrayList<JourneySectionId>();
			List<TrainCompositionMessageId> trainCompositionMessages = new ArrayList<TrainCompositionMessageId>();
			
			return new Train(trainId,
					trainType,
					operationalTrainNumber,
					scheduledTimeAtHandover,
					scheduledTimeAtTransfer,
					transferPoint,
					companyId,
					journeySections,
					trainCompositionMessages);
		}
		
		return null;
	}
	
}
