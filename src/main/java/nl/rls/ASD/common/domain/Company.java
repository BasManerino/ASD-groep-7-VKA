package nl.rls.ASD.common.domain;

public class Company {
	private CompanyId id;

	public Company(CompanyId id) {
		super();
		this.id = id;
	}

	public CompanyId getId() {
		return id;
	}
}
