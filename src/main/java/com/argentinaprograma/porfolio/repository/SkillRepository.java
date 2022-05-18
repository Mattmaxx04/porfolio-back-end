package com.argentinaprograma.porfolio.repository;

import com.argentinaprograma.porfolio.entities.Skill;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SkillRepository extends JpaRepository<Skill, Long> {
    void deleteSkillById(Long id);

    Optional<Skill> findSkillById(Long id);
}
