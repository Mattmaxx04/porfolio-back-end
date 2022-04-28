package com.argentinaprograma.porfolio.repository;

import com.argentinaprograma.porfolio.entities.Project;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
