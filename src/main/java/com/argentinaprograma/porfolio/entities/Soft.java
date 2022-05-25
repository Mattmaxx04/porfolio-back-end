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
    @Column(length = 2048)
    private String sft_logoUrl;

    public Soft() {
    }

    public Soft(String sft_name, String sft_logoUrl) {
        this.sft_name = sft_name;
        this.sft_logoUrl = sft_logoUrl;
    }

    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public String getSft_name() {
        return sft_name;
    }

    public void setSft_name(String sft_name) {
        this.sft_name = sft_name;
    }

    public String getSft_logoUrl() {
        return sft_logoUrl;
    }

    public void setSft_logoUrl(String sft_logoUrl) {
        this.sft_logoUrl = sft_logoUrl;
    }

    @Override
    public String toString() {
        return "Soft{" +
                "fid=" + fid +
                ", sft_name='" + sft_name + '\'' +
                ", sft_logoUrl='" + sft_logoUrl + '\'' +
                '}';
    }
}
