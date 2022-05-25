package com.argentinaprograma.porfolio.security.repo;

import com.argentinaprograma.porfolio.security.enums.RoleName;
import com.argentinaprograma.porfolio.security.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    Optional<Role> findByRoleName(RoleName roleName);
}
