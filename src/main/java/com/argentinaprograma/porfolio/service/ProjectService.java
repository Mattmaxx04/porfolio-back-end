package com.argentinaprograma.porfolio.service;

import com.argentinaprograma.porfolio.entities.Project;
import com.argentinaprograma.porfolio.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;
    @Autowired
    public ProjectService(ProjectRepository projectRepository){
        this.projectRepository = projectRepository;
    }

    public Project addProject(Project project){
        return projectRepository.save(project);
    }
}
