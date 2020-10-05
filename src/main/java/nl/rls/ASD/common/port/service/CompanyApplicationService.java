package nl.rls.ASD.common.port.service;

import org.springframework.stereotype.Service;

import nl.rls.ASD.common.domain.CompanyId;
import nl.rls.ASD.common.persistence.repository.CompanyRepository2;

@Service
public class CompanyApplicationService {

	private CompanyRepository2 repo;
	public boolean getCompanyById(CompanyId id) {
		return repo.existsById(id);
	}

}
