package nl.rls.ASD.vehicle.port.input;

import nl.rls.ASD.vehicle.domain.Wagon;
import nl.rls.ASD.vehicle.domain.WagonCode;

public interface WagonInputAdapter {
    boolean addNewWagon(String numberFreight, String typeName, WagonCode code, int lengthOverBuffers, int wagonNumberOfAxles,
                      int brakeWeightG, int brakeWeightP, int wagonWeightEmpty, int maxSpeed);

	Wagon getByCode(WagonCode code, boolean check);
}
