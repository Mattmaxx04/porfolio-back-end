package com.argentinaprograma.porfolio.service;

import com.argentinaprograma.porfolio.entities.Experience;
import com.argentinaprograma.porfolio.repository.ExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService {

    private final ExperienceRepository experienceRepository;
    @Autowired
    public ExperienceService(ExperienceRepository experienceRepository){
        this.experienceRepository = experienceRepository;
    }

    public Experience addExperience(Experience experience){
        return experienceRepository.save(experience);
    }
}
