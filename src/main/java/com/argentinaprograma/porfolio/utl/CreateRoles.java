/* package com.argentinaprograma.porfolio.utl;



import com.argentinaprograma.porfolio.security.enums.RoleName;
import com.argentinaprograma.porfolio.security.model.Role;
import com.argentinaprograma.porfolio.security.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class CreateRoles implements CommandLineRunner {

    @Autowired
    RoleService roleService;

    @Override
    public void run(String... args) throws Exception {
        Role roleAdmin = new Role(RoleName.ROLE_ADMIN);
        Role roleUser = new Role(RoleName.ROLE_USER);
        roleService.save(roleAdmin);
        roleService.save(roleUser);

    }
}
*/
