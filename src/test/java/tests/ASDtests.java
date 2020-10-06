package tests;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.http.MediaType;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.util.NestedServletException;

import nl.rls.Main;
import nl.rls.ci.url.BaseURL;

@AutoConfigureMockMvc
@SpringBootTest(classes = Main.class)
public class ASDtests extends WebSecurityConfigurerAdapter{
    
	@Autowired
	private MockMvc mockMvc;

	
    //================================================================================
    // Tests for createTrainCompositionMessage
    //================================================================================
	
	// Create a Train Composition Message
	@Test
	public void createTrainCompositionMessage() throws Exception {
		//this.mockMvc.perform(get(BaseURL.BASE_PATH + "/passengertransportrestrictions/08 Tank wagon loaded with liquid")).andExpect(status().isOk());
		String tcm = "{\r\n" + 
				"    \"objectType\": \"testObjectType\",\r\n" + 
				"    \"company\": 1,\r\n" + 
				"    \"core\": \"testCore\",\r\n" + 
				"    \"variant\": \"testVariant\",\r\n" + 
				"    \"timetableYear\": 2000,\r\n" + 
				"    \"startDate\": \"2020-03-09T22:18:26.625Z\",\r\n" + 
				"    \"train\": 1,\r\n" + 
				"    \"messageStatus\": 1,\r\n" + 
				"    \"messageType\": 1,\r\n" + 
				"    \"messageTypeVersion\": \"testMessageTypeVersion\",\r\n" + 
				"    \"messageIdentifier\": \"testMessageIdentifier\",\r\n" + 
				"    \"messageDateTime\": \"2020-03-09T22:18:26.625Z\",\r\n" + 
				"    \"senderReference\": \"testSenderReference\",\r\n" + 
				"    \"sender\": 1,\r\n" + 
				"    \"recipient\": 1,\r\n" + 
				"    \"companyCheck\": true,\r\n" + 
				"    \"trainCheck\": true,\r\n" + 
				"    \"senderCheck\": true,\r\n" + 
				"    \"recipientCheck\": true\r\n" + 
				"}";
		
		this.mockMvc.perform(post(BaseURL.BASE_PATH + "/traincompositionmessage/create").contentType(MediaType.APPLICATION_JSON_VALUE).content(tcm)).andExpect(status().isCreated());
	}
}