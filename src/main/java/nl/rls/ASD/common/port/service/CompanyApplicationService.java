package nl.rls.ASD.common.port.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.rls.ASD.common.domain.Company;
import nl.rls.ASD.common.domain.CompanyId;
import nl.rls.ASD.common.persistence.repository.CompanyRepository;

@Service
public class CompanyApplicationService {

	@Autowired
	private CompanyRepository repo;
	public boolean getCompanyById(CompanyId id) {
		return repo.existsById(id);
	}

}
