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
    private String edu_start;
    private String edu_end;
    @Column(length = 2048)
    private String edu_logoUrl;

    public Education() {
    }

    public Education(String edu_title, String edu_institution, String edu_start, String edu_end, String edu_logoUrl) {
        this.edu_title = edu_title;
        this.edu_institution = edu_institution;
        this.edu_start = edu_start;
        this.edu_end = edu_end;
        this.edu_logoUrl = edu_logoUrl;
    }

    public Long getEid() {
        return eid;
    }

    public void setEid(Long eid) {
        this.eid = eid;
    }

    public String getEdu_title() {
        return edu_title;
    }

    public void setEdu_title(String edu_title) {
        this.edu_title = edu_title;
    }

    public String getEdu_institution() {
        return edu_institution;
    }

    public void setEdu_institution(String edu_institution) {
        this.edu_institution = edu_institution;
    }

    public String getDate_start() {
        return edu_start;
    }

    public void setDate_start(String edu_start) {
        this.edu_start = edu_start;
    }

    public String getDate_end() {
        return edu_end;
    }

    public void setDate_end(String edu_end) {
        this.edu_end = edu_end;
    }

    public String getEdu_logoUrl() {
        return edu_logoUrl;
    }

    public void setEdu_logoUrl(String edu_logoUrl) {
        this.edu_logoUrl = edu_logoUrl;
    }

    @Override
    public String toString() {
        return "Education{" +
                "eid=" + eid +
                ", edu_title='" + edu_title + '\'' +
                ", edu_institution='" + edu_institution + '\'' +
                ", edu_start=" + edu_start +
                ", edu_end=" + edu_end +
                ", edu_logoUrl='" + edu_logoUrl + '\'' +
                '}';
    }
}
