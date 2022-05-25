package com.argentinaprograma.porfolio.repository;

import com.argentinaprograma.porfolio.entities.Skill;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SkillRepository extends JpaRepository<Skill, Long> {
    void deleteSkillBySid(Long sid);

    Optional<Skill> findSkillBySid(Long sid);
}
