package service;


import service.entité.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.enicarthage.tp3groupecnum20.repository.EmployeRepo;

@Service
public class Employeservice {
    @Autowired
    EmployeRepo emplorep;
    public Employe authenticate(String login, String password) {

        Employe employe = emplorep.findByLogin(login);

        if (employe != null) {

            return employe;
        } else {
            return null;
        }
    }

    public void mettreAjourEmailByEmployeId(String email, Long Empid) {

      Employe employe = emplorep.findById(Empid).get();


            employe.setEmail(email);
            emplorep.save(employe);

    }

    public String getEmployePrenomById( Long employeId) {
        Employe employe = emplorep.findById(employeId).get();


            return employe.getPrenom();
        }
    public void deleteEmployeById(Long employeId){

         emplorep.deleteById( employeId);
    }

    public int getNombreEmployeJPQL()
    {
        return emplorep.getNombreEmployeJPQL();
    }



}
