package nl.rls.ASD.message.port.input;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.rls.ci.url.BaseURL;

@RestController
@RequestMapping(BaseURL.BASE_PATH + "/genericmessage")
public class GenericMessageController implements GenericMessageInputAdapter{
}
