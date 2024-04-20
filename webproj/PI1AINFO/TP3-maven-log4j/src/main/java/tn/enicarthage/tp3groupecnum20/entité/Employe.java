package tn.enicarthage.tp3groupecnum20.service.entité;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Entity

public class Employe {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id ;
    String prenom ;
    String email ;
    Boolean isActif ;
    Role role ;


}
