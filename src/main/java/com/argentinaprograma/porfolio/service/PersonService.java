package com.argentinaprograma.porfolio.service;

import com.argentinaprograma.porfolio.entities.Person;
import com.argentinaprograma.porfolio.exception.UserNotFoundException;
import com.argentinaprograma.porfolio.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Service
public class PersonService {

    private final PersonRepository personRepository;
    @Autowired
    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public Person addPerson(Person person){
        return personRepository.save(person);
    }

    public List<Person> findAllPerson(){
        return personRepository.findAll();
    }

    public Person updatePerson(Person person){
        return personRepository.save(person);
    }

    public Person findPersonById(Long id) {
        return personRepository.findPersonById(id).orElseThrow(() -> new UserNotFoundException("El usuario de id" + id + "no fue encontrado"));
    }

    public void deletePerson(Long id){
        personRepository.deletePersonById(id);
    }
}
