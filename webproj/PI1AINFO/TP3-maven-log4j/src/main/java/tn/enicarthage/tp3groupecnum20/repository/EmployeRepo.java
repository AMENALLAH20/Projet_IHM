package repository;

import entité.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeRepo extends JpaRepository<Employe,Long> {
    Employe findByLogin(String login);

    @Query("select count(e) from Employe e ")
    public int getNombreEmployeJPQL();

}
