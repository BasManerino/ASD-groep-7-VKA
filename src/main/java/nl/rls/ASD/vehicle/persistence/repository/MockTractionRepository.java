package nl.rls.ASD.vehicle.persistence.repository;

import java.util.List;
import java.util.Optional;

import nl.rls.ASD.vehicle.domain.*;

public class MockTractionRepository implements TractionRepository{

	@Override
	public Optional<nl.rls.composer.domain.Traction> findByIdAndOwnerId(int id, int ownerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<nl.rls.composer.domain.Traction> findByOwnerId(int ownerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<nl.rls.composer.domain.Traction> findByLocoTypeNumberAndOwnerId(Long locoNumber, int ownerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Traction tractionOfId(TractionId tractionId) {
		if (tractionId.getId() == 1) {
			TractionTypeId tractionTypeId = new TractionTypeId(1);
			Long locotypeNumber = 0L;
			String locoNumber = "00800";
			int lengthOverBuffers = 0;
			int numberOfAxles = 8;
			int weight = 150;
			int brakeWeightG = 2;
			int brakeWeightP = 140000;
			
			
			return new Traction(tractionId,
					tractionTypeId,
					locotypeNumber,
					locoNumber,
					lengthOverBuffers,
					numberOfAxles,
					weight,
					brakeWeightG,
					brakeWeightP);
		}
		else if (tractionId.getId() == 2) {
			TractionTypeId tractionTypeId = new TractionTypeId(2);
			Long locotypeNumber = 1L;
			String locoNumber = "00900";
			int lengthOverBuffers = 30;
			int numberOfAxles = 10;
			int weight = 180;
			int brakeWeightG = 3;
			int brakeWeightP = 190000;
			
			
			return new Traction(tractionId,
					tractionTypeId,
					locotypeNumber,
					locoNumber,
					lengthOverBuffers,
					numberOfAxles,
					weight,
					brakeWeightG,
					brakeWeightP);
		}
		
		
		return null;
	}
	
}
