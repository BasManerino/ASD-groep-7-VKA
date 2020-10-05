package nl.rls.ASD.common.port.input;

import java.util.Optional;

import nl.rls.ASD.common.domain.Company;
import nl.rls.ASD.common.domain.CompanyId;

public interface CompanyInputAdapter {
	 boolean existsById(CompanyId id);
}
