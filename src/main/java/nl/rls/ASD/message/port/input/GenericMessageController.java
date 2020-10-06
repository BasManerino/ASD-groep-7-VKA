package nl.rls.ASD.message.port.input;

import java.sql.SQLException;
import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import nl.rls.ASD.common.domain.CompanyId;
import nl.rls.ASD.message.port.service.GenericMessageApplicationService;
import nl.rls.ASD.vehicle.domain.TrainId;
import nl.rls.ci.url.BaseURL;

@RestController
@RequestMapping(BaseURL.BASE_PATH + "/genericmessage")
public class GenericMessageController implements GenericMessageInputAdapter{
}
