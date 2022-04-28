package com.argentinaprograma.porfolio.entities;


import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Project implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long pid;
    private String project_name;
    @Column(name = "project_imgUrl", length = 2048)
    private String project_imgUrl;
    private String project_url;
    @Column(name = "project_description", length = 300)
    private String project_description;
}
