package nl.rls.composer.rest.dto;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.hateoas.ResourceSupport;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@XmlRootElement
@NoArgsConstructor
@Getter @Setter
public class WagonIdentDto extends ResourceSupport {
	private String wagonNumberFreight;
	private int lengthOverBuffers;
	private int wagonNumberOfAxles;
	private int handBrakeBrakedWeight;
	private int wagonWeightEmpty;
}
