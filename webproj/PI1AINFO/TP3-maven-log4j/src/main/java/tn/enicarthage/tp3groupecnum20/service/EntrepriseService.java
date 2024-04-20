package service;

import service.entité.Departement;
import service.entité.Entreprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.enicarthage.tp3groupecnum20.repository.DepartementRepo;
import tn.enicarthage.tp3groupecnum20.repository.EntrepriseRep;

import java.util.List;

@Service
public class EntrepriseService  implements IntEmpSer {

    @Autowired
      EntrepriseRep entrerep;
    @Autowired
    DepartementRepo deparep;
    @Override
    public Entreprise ajouterEntreprise(Entreprise entreprise){

        return entrerep.save(entreprise);

    }
    @Override
    public void deleteEntrepriseById(Long entrepriseId){
         entrerep.deleteById(entrepriseId);
    }
    @Override
    public Entreprise getEntrepriseById(Long entrepriseId){
        return entrerep.findById(entrepriseId).get();
    }

    @Override
    public Departement ajouterDepartement(Departement dep){
        return deparep.save(dep);
    }

    @Override
    public void affecterDepartementAEntreprise(Long depId, Long entrepriseId){
        Departement dep =deparep.findById(depId).get();
        Entreprise ent =entrerep.findById(entrepriseId).get();
         Entreprise.setDepartement(dep);
         entrerep.save(ent);
    }

    @Override
    public List<String> getAllDepartementsNamesByEntreprise(Long entrepriseId){


   return  entrerep.getAllDepartementsNamesByEntreprise(entrepriseId);
    }

    @Override
    public void deleteDepartementById(Long depId){
        deparep.deleteById(depId);
    }




}
