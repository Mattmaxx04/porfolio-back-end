package com.argentinaprograma.porfolio.repository;


import com.argentinaprograma.porfolio.entities.Soft;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SoftRepository extends JpaRepository<Soft, Long> {
    void deleteSoftByFid(Long fid);

    Optional<Soft> findSoftByFid(Long fid);
}
