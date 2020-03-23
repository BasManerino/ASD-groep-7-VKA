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
public class TractionDto extends ResourceSupport {
    private TractionTypeDto tractionType;
    @Min(5)
    @Max(12)
    private String locoTypeNumber;
    @Min(4)
    @Max(12)
    private String locoNumber;
    private TractionModeDto tractionMode;
    private String type;
    @Min(1)
    @Max(999999)
    private int lengthOverBuffers;
    private int numberOfAxles;
    private int weight;
    @Min(1)
    @Max(99999)
    private int brakeWeight;
}