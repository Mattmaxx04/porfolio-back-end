package com.argentinaprograma.porfolio.service;

import com.argentinaprograma.porfolio.entities.Project;
import com.argentinaprograma.porfolio.exception.UserNotFoundException;
import com.argentinaprograma.porfolio.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<Project> findAllProject() {
        return projectRepository.findAll();
    }

    public Project updateProject(Project proyecto) {
        return projectRepository.save(proyecto);
    }

    public void deleteProyecto(Long id) {
        projectRepository.deleteProjectById(id);
    }


    public Project findProyecto(Long id) {
        return projectRepository.findProjectById(id).orElseThrow(() -> new UserNotFoundException("El proyecto de id" + id + "no fue encontrado"));
    }


}
