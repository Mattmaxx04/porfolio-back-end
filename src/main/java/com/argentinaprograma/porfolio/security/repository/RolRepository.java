package com.argentinaprograma.porfolio.security.repository;

import com.argentinaprograma.porfolio.security.entity.Rol;
import com.argentinaprograma.porfolio.security.enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
