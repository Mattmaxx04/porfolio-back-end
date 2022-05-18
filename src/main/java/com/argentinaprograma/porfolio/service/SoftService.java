package com.argentinaprograma.porfolio.service;


import com.argentinaprograma.porfolio.entities.Soft;
import com.argentinaprograma.porfolio.exception.UserNotFoundException;
import com.argentinaprograma.porfolio.repository.SoftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftService {

    private final SoftRepository softRepository;
    @Autowired
    public SoftService(SoftRepository softRepository){
        this.softRepository = softRepository;
    }

    public Soft addSoft(Soft soft){
        return softRepository.save(soft);
    }

    public List<Soft> findAllSoft() {
        return softRepository.findAll();
    }

    public Soft updateSoft(Soft soft) {
        return softRepository.save(soft);
    }

    public void deleteSoft(Long id) {
        softRepository.deleteSoftById(id);
    }


    public Soft findSoftById(Long id) {
        return softRepository.findSoftById(id).orElseThrow(() -> new UserNotFoundException("La habilidad de id" + id + "no fue encontrada"));
    }

}
