package com.argentinaprograma.porfolio.repository;


import com.argentinaprograma.porfolio.entities.Education;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EducationRepository extends JpaRepository<Education, Long> {
    void deleteEducationByEid(Long eid);

    Optional<Education> findEducationByEid(Long eid);
}
