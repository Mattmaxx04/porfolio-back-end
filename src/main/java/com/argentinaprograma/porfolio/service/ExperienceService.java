package com.argentinaprograma.porfolio.service;

import com.argentinaprograma.porfolio.entities.Experience;
import com.argentinaprograma.porfolio.exception.UserNotFoundException;
import com.argentinaprograma.porfolio.repository.ExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
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

    public List<Experience> findAllExperience() {
        return experienceRepository.findAll();
    }

    public Experience findExperience(Long xid){
        return experienceRepository.findExperienceByXid(xid)
                .orElseThrow(() -> new UserNotFoundException("La experiencia laboral de id" + xid + "no fue encontrada"));
    }

    public Experience updateExperience(Experience experience){
        return experienceRepository.save(experience);
    }

    public void deleteExperience(Long xid){
        experienceRepository.deleteExperienceByXid(xid);
    }
}
