package com.argentinaprograma.porfolio.service;

import com.argentinaprograma.porfolio.entities.Education;
import com.argentinaprograma.porfolio.repository.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationService {

    private final EducationRepository educationRepository;
    @Autowired
    public EducationService(EducationRepository educationRepository){
        this.educationRepository = educationRepository;
    }

    public Education addEducation(Education education){
        return educationRepository.save(education);
    }
}
