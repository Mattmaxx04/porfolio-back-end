package com.argentinaprograma.porfolio.controller;



import com.argentinaprograma.porfolio.entities.Project;
import com.argentinaprograma.porfolio.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "https://porfolio-app-48d1e.web.app")
@RestController
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    ProjectService projectService;

    @GetMapping("/all")
    public ResponseEntity <List<Project>> findAllProjects() {
        List<Project> project = projectService.findAllProject();
        return new ResponseEntity<>(project, HttpStatus.OK);
    }

    @GetMapping("/find/{pid}")
    public ResponseEntity<Project> findProject(@PathVariable("pid") Long pid) {
        Project project = projectService.findProject(pid);
        return new ResponseEntity<>(project, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/add")
    public ResponseEntity<Project> addProject (@RequestBody Project project) {
        Project newProject = projectService.addProject(project);
        return new ResponseEntity<>(newProject, HttpStatus.CREATED);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update")
    public ResponseEntity<Project> updateProjects (@RequestBody Project skill) {
        Project updateProject = projectService.updateProject(skill);
        return new ResponseEntity<>(updateProject, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{pid}")
    public ResponseEntity<?> deleteProject (@PathVariable("pid") Long pid) {
        projectService.deleteProject(pid);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
