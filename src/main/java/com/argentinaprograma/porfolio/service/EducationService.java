package com.argentinaprograma.porfolio.service;

import com.argentinaprograma.porfolio.entities.Education;
import com.argentinaprograma.porfolio.exception.UserNotFoundException;
import com.argentinaprograma.porfolio.repository.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<Education> findAllEducation() {
        return educationRepository.findAll();
    }

    public Education updateEducation(Education education) {
        return educationRepository.save(education);
    }

    public void deleteEducation(Long id) {
        educationRepository.deleteEducationById(id);
    }


    public Education findEducationById(Long id) {
        return educationRepository.findEducationById(id).orElseThrow(() -> new UserNotFoundException("El curso de id" + id + "no fue encontrado"));
    }
}
