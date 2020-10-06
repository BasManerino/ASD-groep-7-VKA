package nl.rls.ASD.vehicle.port.service;

import org.springframework.stereotype.Service;

import nl.rls.ASD.common.persistence.repository.CompanyRepository2;
import nl.rls.ASD.common.persistence.repository.CompanyRepositoryImpl;
import nl.rls.ASD.vehicle.persistence.repository.TrainRepository;
import nl.rls.ASD.vehicle.persistence.repository.TrainRepositoryImpl;

@Service
public class TrainApplicationService {
	public boolean getCompanyById(boolean check) {
		TrainRepository repo = new TrainRepositoryImpl();
		return repo.getTrainById(check);
	}
}
