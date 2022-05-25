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
    @Column(length = 2048)
    private String project_imgUrl;
    private String project_url;
    @Column(length = 300)
    private String project_description;

    public Project() {
    }

    public Project(String project_name, String project_imgUrl, String project_url, String project_description) {
        this.project_name = project_name;
        this.project_imgUrl = project_imgUrl;
        this.project_url = project_url;
        this.project_description = project_description;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public String getProject_imgUrl() {
        return project_imgUrl;
    }

    public void setProject_imgUrl(String project_imgUrl) {
        this.project_imgUrl = project_imgUrl;
    }

    public String getProject_url() {
        return project_url;
    }

    public void setProject_url(String project_url) {
        this.project_url = project_url;
    }

    public String getProject_description() {
        return project_description;
    }

    public void setProject_description(String project_description) {
        this.project_description = project_description;
    }

    @Override
    public String toString() {
        return "Project{" +
                "pid=" + pid +
                ", project_name='" + project_name + '\'' +
                ", project_imgUrl='" + project_imgUrl + '\'' +
                ", project_url='" + project_url + '\'' +
                ", project_description='" + project_description + '\'' +
                '}';
    }
}
