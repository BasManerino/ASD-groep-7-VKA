package nl.rls.ASD.message.port.output;

import nl.rls.ASD.common.domain.CompanyId;

public interface TrainCompositionMessageOutputAdapter {
	boolean getCompanyById(boolean check);
	boolean getTrainById(boolean check);
}
