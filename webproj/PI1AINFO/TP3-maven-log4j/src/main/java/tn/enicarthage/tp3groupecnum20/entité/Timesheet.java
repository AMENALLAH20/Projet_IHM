package tn.enicarthage.tp3groupecnum20.service.entité;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.Date;
@Setter
@Getter
@NoArgsConstructor
@ToString
@AllArgsConstructor

public class Timesheet {

    Date datedebut;
    Date dateFin ;
    Boolean isValide ;

}
