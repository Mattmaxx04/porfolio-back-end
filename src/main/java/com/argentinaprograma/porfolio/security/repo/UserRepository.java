package com.argentinaprograma.porfolio.security.repo;

import com.argentinaprograma.porfolio.security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByNameUser(String nameUser);

    boolean existsByNameUser(String NameUser);
}
