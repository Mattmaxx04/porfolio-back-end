package com.argentinaprograma.porfolio.controller;


import com.argentinaprograma.porfolio.entities.Education;
import com.argentinaprograma.porfolio.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/education")
public class EducationController {

   @Autowired
   EducationService educationService;

    @GetMapping("/all")
    public ResponseEntity<List<Education>> getAllEducation() {
        List<Education> education = educationService.findAllEducation();
        return new ResponseEntity<>(education, HttpStatus.OK);
    }

    @GetMapping("/find/{eid}")
    public ResponseEntity<Education> getEducationByEid(@PathVariable("eid") Long eid) {
        Education education = educationService.findEducationByEid(eid);
        return new ResponseEntity<>(education, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/add")
    public ResponseEntity<Education> addEducation (@RequestBody Education education) {
        Education newEducation = educationService.addEducation(education);
        return new ResponseEntity<>(newEducation, HttpStatus.CREATED);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update")
    public ResponseEntity<Education> updateEducation (@RequestBody Education education) {
        Education updateEducation = educationService.updateEducation(education);
        return new ResponseEntity<>(updateEducation, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{eid}")
    public ResponseEntity<?> deleteEducation (@PathVariable("eid") Long eid) {
        educationService.deleteEducation(eid);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
