package tn.enicarthage.tp3groupecnum20.service.entité;

import jakarta.persistence.*;
import lombok.*;


import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Entity

public class Entreprise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String raisonSocial;



    @OneToMany (mappedBy="Entreprise")
   private List<Departement> listdep =new ArrayList<>();


    public static void setDepartement(Departement dep) {

    }
}
