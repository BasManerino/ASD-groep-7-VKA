package nl.rls.ASD.common.persistence.repository;

import java.sql.SQLException;

import nl.rls.ASD.common.domain.Company;

public class CompanyRepositoryImpl implements CompanyRepository2 {

	@Override
	public int nextIdentity() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean getCompanyById(boolean check) {
		return check;
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