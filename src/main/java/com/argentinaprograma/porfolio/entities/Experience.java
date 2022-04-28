package com.argentinaprograma.porfolio.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Experience implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long xid;
    private String company_name;
    private String company_url;
    @Temporal(TemporalType.DATE)
    private Date date_start;
    @Temporal(TemporalType.DATE)
    private Date date_end;
    @Column(name = "company_logoUrl", length = 2048)
    private String company_logoUrl;
    @Column(name = "experience_description", length = 1000)
    private String experience_description;

}
