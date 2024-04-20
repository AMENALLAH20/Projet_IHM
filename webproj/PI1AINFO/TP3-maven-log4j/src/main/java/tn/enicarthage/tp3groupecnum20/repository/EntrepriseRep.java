package repository;

import entité.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EntrepriseRep extends JpaRepository<Entreprise,Long> {

    @Query("SELECT d.name FROM Entreprise e JOIN e.listdep d WHERE e.id = :entrepriseId")
    public List<String> getAllDepartementsNamesByEntreprise(Long entrepriseId);
}
