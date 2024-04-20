package tn.enicarthage.tp3groupecnum20.service.entité;


import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Entity

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Mission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id ;
    String description;
}
