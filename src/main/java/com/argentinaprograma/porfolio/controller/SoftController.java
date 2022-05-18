package com.argentinaprograma.porfolio.controller;


import com.argentinaprograma.porfolio.entities.Soft;
import com.argentinaprograma.porfolio.service.SoftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/soft")
public class SoftController {

    @Autowired
    SoftService softService;

    @GetMapping("/all")
    public ResponseEntity<List<Soft>> findAllSoft() {
        List<Soft> soft = softService.findAllSoft();
        return new ResponseEntity<>(soft, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Soft> findSoftById(@PathVariable("id") Long id) {
        Soft soft = softService.findSoftById(id);
        return new ResponseEntity<>(soft, HttpStatus.OK);
    }

    /* @PreAuthorize("hasRole('ADMIN')")*/
    @PostMapping("/add")
    public ResponseEntity<Soft> addSoft (@RequestBody Soft soft) {
        Soft newSoft = softService.addSoft(soft);
        return new ResponseEntity<>(newSoft, HttpStatus.CREATED);
    }

    /* @PreAuthorize("hasRole('ADMIN')")*/
    @PutMapping("/update")
    public ResponseEntity<Soft> updateSoft (@RequestBody Soft soft) {
        Soft updateSoft = softService.updateSoft(soft);
        return new ResponseEntity<>(updateSoft, HttpStatus.OK);
    }

    /* @PreAuthorize("hasRole('ADMIN')")*/
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteSoft (@PathVariable("id") Long id) {
        softService.deleteSoft(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
