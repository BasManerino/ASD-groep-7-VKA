package nl.rls.ASD.vehicle.port.service;

import nl.rls.ASD.vehicle.domain.Wagon;
import nl.rls.ASD.vehicle.domain.WagonCode;
import org.springframework.stereotype.Service;

@Service
public class WagonApplicationService {

    // Hier wordt een Wagon object aangemaakt en opgeslagen in de database - Arjan
    public Wagon addNewWagon(String numberFreight, String typeName, WagonCode code, int lengthOverBuffers, int wagonNumberOfAxles,
                             int brakeWeightG, int brakeWeightP, int wagonWeightEmpty, int maxSpeed) {
        Wagon wagon;

        wagon = new Wagon(numberFreight, typeName, code, lengthOverBuffers, wagonNumberOfAxles,
                brakeWeightG, brakeWeightP, wagonWeightEmpty, maxSpeed);

        return wagon;
    }

}
