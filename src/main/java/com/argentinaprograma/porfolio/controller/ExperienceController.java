package com.argentinaprograma.porfolio.controller;


import com.argentinaprograma.porfolio.entities.Experience;
import com.argentinaprograma.porfolio.service.ExperienceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/experience")
public class ExperienceController {

    @Autowired
    ExperienceService experienceService;

    @GetMapping("/all")
    public ResponseEntity<List<Experience>> getAllExperience() {
        List<Experience> experience = experienceService.findAllExperience();
        return new ResponseEntity<>(experience, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Experience> getExperienceByXid(@PathVariable("xid") Long xid) {
        Experience experience = experienceService.findExperience(xid);
        return new ResponseEntity<>(experience, HttpStatus.OK);
    }

   @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/add")
    public ResponseEntity<Experience> addExperience (@RequestBody Experience experience) {
        Experience newExperience = experienceService.addExperience(experience);
        return new ResponseEntity<>(newExperience, HttpStatus.CREATED);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update")
    public ResponseEntity<Experience> updateExperience (@RequestBody Experience experience) {
        Experience updateExperience = experienceService.updateExperience(experience);
        return new ResponseEntity<>(updateExperience, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{xid}")
    public ResponseEntity<?> deleteExperience (@PathVariable("xid") Long xid) {
        experienceService.deleteExperience(xid);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
