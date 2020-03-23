package nl.rls.composer.rest.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nl.rls.composer.rest.dto.hateoas.ResourceSupport;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class WagonInTrainDto extends ResourceSupport {
    private int position;
    private String brakeType;
    @Min(0)
    @Max(999999)
    private int totalLoadWeight;
    @Min(1)
    @Max(99999)
    private int brakeWeight;
    @Min(0)
    @Max(999)
    private int wagonMaxSpeed;
    private WagonDto wagon;
    private List<DangerGoodsInWagonDto> dangerGoods = new ArrayList<>();

}