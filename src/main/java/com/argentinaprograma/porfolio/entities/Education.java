package com.argentinaprograma.porfolio.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Education implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long eid;
    private String edu_title;
    private String edu_institution;
    @Temporal(TemporalType.DATE)
    private Date date_start;
    @Temporal(TemporalType.DATE)
    private Date date_end;
    @Column(name = "edu_logoUrl", length = 2048)
    private String edu_logoUrl;


}
