package com.argentinaprograma.porfolio.security.service;

import com.argentinaprograma.porfolio.security.model.User;
import com.argentinaprograma.porfolio.security.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
@ComponentScan
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Optional<User> getByNameUser(String nameUser) {
        return userRepository.findByNameUser(nameUser);
    }

    public boolean existsByNameUser(String nameUser) {
        return userRepository.existsByNameUser(nameUser);
    }

    public void save(User user) {
        userRepository.save(user);
    }
}
