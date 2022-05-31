package com.argentinaprograma.porfolio.controller;


import com.argentinaprograma.porfolio.entities.Person;
import com.argentinaprograma.porfolio.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "https://porfolio-app-48d1e.web.app")
@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/all")
    public ResponseEntity<List<Person>> getAllPersons() {
        List<Person> person = personService.findAllPerson();
        return new ResponseEntity<>(person, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Person> getPersonById(@PathVariable("id") Long id) {
        Person person = personService.findPersonById(id);
        return new ResponseEntity<>(person, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/add")
    public ResponseEntity<Person> addPerson (@RequestBody Person person) {
        Person newPerson = personService.addPerson(person);
        return new ResponseEntity<>(newPerson, HttpStatus.CREATED);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update")
    public ResponseEntity<Person> updatePerson (@RequestBody Person person) {
        Person updatePerson = personService.updatePerson(person);
        return new ResponseEntity<>(updatePerson, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePerson (@PathVariable("id") Long id) {
        personService.deletePerson(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
