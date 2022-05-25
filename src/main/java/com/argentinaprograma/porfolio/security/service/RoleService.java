package com.argentinaprograma.porfolio.security.service;

import com.argentinaprograma.porfolio.security.enums.RoleName;
import com.argentinaprograma.porfolio.security.model.Role;
import com.argentinaprograma.porfolio.security.repo.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class RoleService {

    @Autowired
    RoleRepository roleRepository;

    public Optional<Role> getByRoleName(RoleName roleName) {
        return roleRepository.findByRoleName(roleName);
    }

    public void save(Role role) {
        roleRepository.save(role);
    }
}
