package com.argentinaprograma.porfolio.repository;

import com.argentinaprograma.porfolio.entities.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ExperienceRepository extends JpaRepository<Experience, Long> {
    void deleteExperienceById(Long id);

    Optional<Experience> findExperienceById(Long id);
}
