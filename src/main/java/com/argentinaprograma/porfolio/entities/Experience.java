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
    private String company_job;
    private String company_name;
    private String company_url;
    private String x_start;
    private String x_end;
    @Column(length = 2048)
    private String company_logoUrl;
    @Column(length = 1000)
    private String x_description;

    public Experience() {
    }

    public Experience(String company_name,String company_job, String company_url, String x_start, String x_end, String company_logoUrl, String x_description) {
        this.company_job = company_job;
        this.company_name = company_name;
        this.company_url = company_url;
        this.x_start = x_start;
        this.x_end = x_end;
        this.company_logoUrl = company_logoUrl;
        this.x_description = x_description;
    }

    public Long getXid() {
        return xid;
    }

    public void setXid(Long xid) {
        this.xid = xid;
    }

    public String getCompany_job() {
        return company_job;
    }

    public void setCompany_job(String company_job) {
        this.company_job = company_job;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getCompany_url() {
        return company_url;
    }

    public void setCompany_url(String company_url) {
        this.company_url = company_url;
    }

    public String getDate_start() {
        return x_start;
    }

    public void setDate_start(String x_start) {
        this.x_start = x_start;
    }

    public String getDate_end() {
        return x_end;
    }

    public void setDate_end(String x_end) {
        this.x_end = x_end;
    }

    public String getCompany_logoUrl() {
        return company_logoUrl;
    }

    public void setCompany_logoUrl(String company_logoUrl) {
        this.company_logoUrl = company_logoUrl;
    }

    public String getExperience_description() {
        return x_description;
    }

    public void setExperience_description(String x_description) {
        this.x_description = x_description;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "xid=" + xid +
                ", company_job='" + company_job + '\'' +
                ", company_name='" + company_name + '\'' +
                ", company_url='" + company_url + '\'' +
                ", x_start=" + x_start +
                ", x_end=" + x_end +
                ", company_logoUrl='" + company_logoUrl + '\'' +
                ", x_description='" + x_description + '\'' +
                '}';
    }
}
