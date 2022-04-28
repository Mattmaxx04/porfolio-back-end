package com.argentinaprograma.porfolio.service;

import com.argentinaprograma.porfolio.entities.Person;
import com.argentinaprograma.porfolio.entities.Soft;
import com.argentinaprograma.porfolio.repository.PersonRepository;
import com.argentinaprograma.porfolio.repository.SoftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
