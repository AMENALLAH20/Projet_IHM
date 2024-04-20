package tn.enicarthage.tp3groupecnum20.service.entité;


import jakarta.persistence.Entity;
import lombok.*;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Entity

public class Contrat {

    Long reference ;
    Date dateDebut;
    String typeContrat;
    Float Salaire;
}
