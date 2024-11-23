package com.amen.loisir.Repositories;


import com.amen.loisir.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    int countByEmail(String email);

    Optional<User> findByEmail(String username);

    @Query(value = "select password from user where email = :email",nativeQuery = true)
    String getPasswordByEmail(@Param("email") String username);



    boolean existsByUsername(String username);

    boolean existsByEmail(String email);

    Optional<Object> findByUsername(String username);
}
