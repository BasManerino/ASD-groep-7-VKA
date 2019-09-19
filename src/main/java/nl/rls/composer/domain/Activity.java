package nl.rls.composer.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import nl.rls.composer.domain.code.TrainActivityType;

@ToString
@Entity
@NoArgsConstructor
@Getter @Setter
public class Activity extends OwnedEntity {
	/**
	 * Indicates certain treatments or operations required for a train.  If national codes are used, the first 2 position will be the ISO country code, followed by 00-99.
	 */
	@ManyToOne
    private TrainActivityType trainActivityType;
    @ManyToOne
    private LocationIdent activityLocationIdent;
}
