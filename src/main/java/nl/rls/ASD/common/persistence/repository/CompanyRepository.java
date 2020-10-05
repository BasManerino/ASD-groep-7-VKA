package nl.rls.ASD.common.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import nl.rls.ASD.common.domain.Company;
import nl.rls.ASD.common.domain.CompanyId;
import nl.rls.ASD.message.domain.GenericMessage;

public interface CompanyRepository extends CrudRepository<Company, CompanyId>{

}
