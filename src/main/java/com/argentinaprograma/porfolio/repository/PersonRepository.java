package com.argentinaprograma.porfolio.repository;

import com.argentinaprograma.porfolio.entities.Person;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Long> {
    void deletePersonById(Long id);

    Optional findPersonById(Long id);
}
