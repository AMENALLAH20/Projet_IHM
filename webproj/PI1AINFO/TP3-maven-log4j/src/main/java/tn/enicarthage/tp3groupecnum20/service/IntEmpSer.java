package service;

import service.entité.Departement;
import service.entité.Entreprise;

import java.util.List;

public interface IntEmpSer {
    public Entreprise ajouterEntreprise(Entreprise entreprise);
      public void deleteEntrepriseById(Long entrepriseId);
   public Entreprise getEntrepriseById(Long entrepriseId);
    public Departement ajouterDepartement(Departement dep);
    public void affecterDepartementAEntreprise(Long depId, Long entrepriseId);
    public List<String> getAllDepartementsNamesByEntreprise(Long entrepriseId);
     public void deleteDepartementById(Long depId);

}
