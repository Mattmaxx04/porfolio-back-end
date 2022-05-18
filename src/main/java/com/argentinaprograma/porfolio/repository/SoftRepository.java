package com.argentinaprograma.porfolio.repository;

import com.argentinaprograma.porfolio.entities.Skill;
import com.argentinaprograma.porfolio.entities.Soft;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SoftRepository extends JpaRepository<Soft, Long> {
    void deleteSoftById(Long id);

    Optional<Soft> findSoftById(Long id);
}
