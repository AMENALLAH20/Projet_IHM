package tn.enicarthage.tp3groupecnum20.service.entité;

import jakarta.persistence.Entity;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Entity

public class MissionExterne extends Mission {

    String emailFacturation;
    Float tauxJournalierMoyen;

}
