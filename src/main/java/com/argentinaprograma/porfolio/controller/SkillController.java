package com.argentinaprograma.porfolio.controller;


import com.argentinaprograma.porfolio.entities.Skill;
import com.argentinaprograma.porfolio.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
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

    @GetMapping("/find/{sid}")
    public ResponseEntity<Skill> findSkillsBySid(@PathVariable("sid") Long sid) {
        Skill skill = skillService.findSkillBySid(sid);
        return new ResponseEntity<>(skill, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/add")
    public ResponseEntity<Skill> addSkill (@RequestBody Skill skill) {
        Skill newSkill = skillService.addSkill(skill);
        return new ResponseEntity<>(newSkill, HttpStatus.CREATED);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update")
    public ResponseEntity<Skill> updateSkill (@RequestBody Skill skill) {
        Skill updateSkill = skillService.updateSkill(skill);
        return new ResponseEntity<>(updateSkill, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{sid}")
    public ResponseEntity<?> deleteSkill (@PathVariable("sid") Long sid) {
        skillService.deleteSkill(sid);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
