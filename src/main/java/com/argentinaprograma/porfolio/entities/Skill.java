package com.argentinaprograma.porfolio.entities;


import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Skill implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long sid;
    private String skill_name;
    private String skill_age;
    @Column(name = "skill_logoUrl", length = 2048)
    private String skill_logoUrl;

    public Skill() {
    }

    public Skill(String skill_name, String skill_age, String skill_logoUrl) {
        this.skill_name = skill_name;
        this.skill_age = skill_age;
        this.skill_logoUrl = skill_logoUrl;
    }

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public String getSkill_name() {
        return skill_name;
    }

    public void setSkill_name(String skill_name) {
        this.skill_name = skill_name;
    }

    public String getSkill_age() {
        return skill_age;
    }

    public void setSkill_age(String skill_age) {
        this.skill_age = skill_age;
    }

    public String getSkill_logoUrl() {
        return skill_logoUrl;
    }

    public void setSkill_logoUrl(String skill_logoUrl) {
        this.skill_logoUrl = skill_logoUrl;
    }
    @Override
    public String toString() {
        return "Skill{" +
                "sid=" + sid +
                ", skill_name='" + skill_name + '\'' +
                ", skill_age='" + skill_age + '\'' +
                ", skill_logoUrl='" + skill_logoUrl + '\'' +
                '}';
    }

}
