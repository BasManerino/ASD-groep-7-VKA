package nl.rls.ASD.common.persistence.repository;

import nl.rls.ASD.common.domain.Company;

public interface CompanyRepository {
	
    Company getCompanyById(int id);
 
    Company saveCompany(Company gm);
     
    void deleteCompany(Company gm);
}
