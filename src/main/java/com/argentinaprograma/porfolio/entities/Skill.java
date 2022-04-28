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

}
