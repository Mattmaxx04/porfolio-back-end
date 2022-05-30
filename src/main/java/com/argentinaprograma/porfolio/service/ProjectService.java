package com.argentinaprograma.porfolio.service;

import com.argentinaprograma.porfolio.entities.Project;
import com.argentinaprograma.porfolio.exception.UserNotFoundException;
import com.argentinaprograma.porfolio.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
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

    public Project updateProject(Project project) {
        return projectRepository.save(project);
    }

    public void deleteProject(Long pid) {
        projectRepository.deleteProjectByPid(pid);
    }


    public Project findProject(Long pid) {
        return projectRepository.findProjectByPid(pid).orElseThrow(() ->
                new UserNotFoundException("El proyecto de id" + pid + "no fue encontrado"));
    }


}
