package repository;

import entité.Departement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartementRepo extends JpaRepository<Departement,Long> {
}
