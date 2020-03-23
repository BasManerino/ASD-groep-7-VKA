package nl.rls.composer.rest.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nl.rls.composer.rest.dto.hateoas.ResourceSupport;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@NoArgsConstructor
@Getter
@Setter
public class TractionInTrainDto extends ResourceSupport {
    @Min(0)
    @Max(1)
    private int driverIndication;
    private int position;
    private TractionDto traction;
}