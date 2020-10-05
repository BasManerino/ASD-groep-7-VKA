package nl.rls.ASD.vehicle.port.input;

import nl.rls.ASD.vehicle.domain.Wagon;
import nl.rls.ASD.vehicle.domain.WagonCode;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import nl.rls.ASD.vehicle.port.service.WagonApplicationService;
import nl.rls.ci.url.BaseURL;

//Hier worden de restservices aangemaakt en uitgevoerd voor klasse Wagon - Arjan
@RestController
@RequestMapping(BaseURL.BASE_PATH + "/wagon2")
public class WagonController2 implements WagonInputAdapter {

    //Deze restservice zorgt ervoor dat er een POST request voor een Wagon wordt verstuurd - Arjan
    @PostMapping(value = "/add", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public Wagon addNewWagon(String numberFreight, String typeName, WagonCode code, int lengthOverBuffers, int wagonNumberOfAxles, int brakeWeightG, int brakeWeightP, int wagonWeightEmpty, int maxSpeed) {

        WagonApplicationService service = new WagonApplicationService();

        return service.addNewWagon(numberFreight, typeName, code, lengthOverBuffers, wagonNumberOfAxles, brakeWeightG, brakeWeightP, wagonWeightEmpty, maxSpeed);
    }
}
