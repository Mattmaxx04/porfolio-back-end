package com.argentinaprograma.porfolio.service;

import com.argentinaprograma.porfolio.entities.Skill;
import com.argentinaprograma.porfolio.exception.UserNotFoundException;
import com.argentinaprograma.porfolio.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SkillService {

    private final SkillRepository skillRepository;
    @Autowired
    public SkillService(SkillRepository skillRepository){
        this.skillRepository = skillRepository;
    }

    public Skill addSkill(Skill skill){
        return skillRepository.save(skill);
    }

    public List<Skill> findAllSkill() {
        return skillRepository.findAll();
    }

    public Skill updateSkill(Skill skill) {
        return skillRepository.save(skill);
    }

    public void deleteSkill(Long sid) {
        skillRepository.deleteSkillBySid(sid);
    }


    public Skill findSkillBySid(Long sid) {
        return skillRepository.findSkillBySid(sid).orElseThrow(() -> new UserNotFoundException("La habilidad de id" + sid + "no fue encontrada"));
    }


}
