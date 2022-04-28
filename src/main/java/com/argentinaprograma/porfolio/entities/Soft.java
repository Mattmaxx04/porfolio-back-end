package com.argentinaprograma.porfolio.entities;


import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Soft implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long fid;
    private String sft_name;
    @Column(name = "sft_logoUrl", length = 2048)
    private String sft_logoUrl;
}
