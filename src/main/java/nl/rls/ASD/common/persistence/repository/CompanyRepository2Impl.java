package nl.rls.ASD.common.persistence.repository;

import java.util.Optional;

import org.springframework.stereotype.Service;

import nl.rls.ASD.common.domain.Company;
import nl.rls.ASD.common.domain.CompanyId;

@Service("Company Repository")
public class CompanyRepository2Impl implements CompanyRepository2 {

	@Override
	public <S extends Company> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Company> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Company> findById(CompanyId id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(CompanyId id) {
		// TODO Auto-generated method stub
		return false;
	}	

	@Override
	public Iterable<Company> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Company> findAllById(Iterable<CompanyId> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(CompanyId id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Company entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Company> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
 
	/*
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
	}*/
}