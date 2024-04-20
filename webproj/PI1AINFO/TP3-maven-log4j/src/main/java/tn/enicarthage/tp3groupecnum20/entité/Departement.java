package tn.enicarthage.tp3groupecnum20.service.entité;

import jakarta.persistence.*;
import lombok.*;


@Setter
@Getter
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Entity

public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id ;
    String name;

    @ManyToOne
    private Entreprise entreprise;
}
