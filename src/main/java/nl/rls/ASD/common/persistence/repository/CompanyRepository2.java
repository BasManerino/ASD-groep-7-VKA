package nl.rls.ASD.common.persistence.repository;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import nl.rls.ASD.common.domain.Company;
import nl.rls.ASD.common.domain.CompanyId;

@Service("Company Repository")
public interface CompanyRepository2{
	int nextIdentity() throws SQLException;
	
	Company getCompanyById(CompanyId id);
   
	Company saveCompany(Company gm);
     
    void deleteCompany(Company gm);
}
