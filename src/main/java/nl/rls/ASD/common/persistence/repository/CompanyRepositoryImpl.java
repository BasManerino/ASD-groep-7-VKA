package nl.rls.ASD.common.persistence.repository;

import java.sql.SQLException;
import java.util.Optional;

import org.springframework.stereotype.Service;

import nl.rls.ASD.common.domain.Company;
import nl.rls.ASD.common.domain.CompanyId;

public class CompanyRepositoryImpl implements CompanyRepository2 {

	@Override
	public int nextIdentity() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Company getCompanyById(CompanyId id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Company saveCompany(Company gm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCompany(Company gm) {
		// TODO Auto-generated method stub
		
	}
}