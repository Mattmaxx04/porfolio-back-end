package com.argentinaprograma.porfolio.controller;


import com.argentinaprograma.porfolio.entities.Skill;
import com.argentinaprograma.porfolio.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/skill")
public class SkillController {

    @Autowired
    SkillService skillService;

    @GetMapping("/all")
    public ResponseEntity<List<Skill>> findAllSkill() {
        List<Skill> skill = skillService.findAllSkill();
        return new ResponseEntity<>(skill, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Skill> findSkillsById(@PathVariable("id") Long id) {
        Skill skill = skillService.findSkillById(id);
        return new ResponseEntity<>(skill, HttpStatus.OK);
    }

    /* @PreAuthorize("hasRole('ADMIN')")*/
    @PostMapping("/add")
    public ResponseEntity<Skill> addSkill (@RequestBody Skill skill) {
        Skill newSkill = skillService.addSkill(skill);
        return new ResponseEntity<>(newSkill, HttpStatus.CREATED);
    }

    /* @PreAuthorize("hasRole('ADMIN')")*/
    @PutMapping("/update")
    public ResponseEntity<Skill> updateSkill (@RequestBody Skill skill) {
        Skill updateSkill = skillService.updateSkill(skill);
        return new ResponseEntity<>(updateSkill, HttpStatus.OK);
    }

    /* @PreAuthorize("hasRole('ADMIN')")*/
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteSkill (@PathVariable("id") Long id) {
        skillService.deleteSkill(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
