package com.argentinaprograma.porfolio.repository;

import com.argentinaprograma.porfolio.entities.Project;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    void deleteProjectByPid(Long pid);

    Optional<Project> findProjectByPid(Long pid);
}
