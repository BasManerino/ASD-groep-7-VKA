package nl.rls.ASD.common.persistence.repository;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Service;

import nl.rls.ASD.common.domain.Company;

@Service("Company Repository")
public class CompanyRepositoryImpl implements CompanyRepository {
 
    private EntityManager em;
     
    public CompanyRepositoryImpl(EntityManager em) {
        this.em = em;
    }

	@Override
	public Company getCompanyById(int id) {
		return em.find(Company.class, id);
	}

	@Override
	public Company saveCompany(Company c) {
        if (c.getId() == null) {
            em.persist(c);
        } else {
            c = em.merge(c);
        }
        return c;
	}

	@Override
	public void deleteCompany(Company c) {
        if (em.contains(c)) {
            em.remove(c);
        } else {
            em.merge(c);
        }
	}
}
