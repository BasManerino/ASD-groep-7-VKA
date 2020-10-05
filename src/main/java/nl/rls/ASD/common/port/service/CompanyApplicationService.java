package nl.rls.ASD.common.port.service;

import org.springframework.stereotype.Service;

import nl.rls.ASD.common.persistence.repository.CompanyRepository2;
import nl.rls.ASD.common.persistence.repository.CompanyRepositoryImpl;

@Service
public class CompanyApplicationService {
	
	public boolean getCompanyById(boolean check) {
		CompanyRepository2 repo = new CompanyRepositoryImpl();
		return repo.getCompanyById(check);
	}

}
