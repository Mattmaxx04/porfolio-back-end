package com.argentinaprograma.porfolio.controller;


import com.argentinaprograma.porfolio.entities.Soft;
import com.argentinaprograma.porfolio.service.SoftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
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

    @GetMapping("/find/{fid}")
    public ResponseEntity<Soft> findSoftByFid(@PathVariable("fid") Long fid) {
        Soft soft = softService.findSoftByFid(fid);
        return new ResponseEntity<>(soft, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/add")
    public ResponseEntity<Soft> addSoft (@RequestBody Soft soft) {
        Soft newSoft = softService.addSoft(soft);
        return new ResponseEntity<>(newSoft, HttpStatus.CREATED);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update")
    public ResponseEntity<Soft> updateSoft (@RequestBody Soft soft) {
        Soft updateSoft = softService.updateSoft(soft);
        return new ResponseEntity<>(updateSoft, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{fid}")
    public ResponseEntity<?> deleteSoft (@PathVariable("fid") Long fid) {
        softService.deleteSoft(fid);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
