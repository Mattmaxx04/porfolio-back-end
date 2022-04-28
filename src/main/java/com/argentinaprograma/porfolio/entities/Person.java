package com.argentinaprograma.porfolio.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long id;
    private String name;
    private String lastname;
    private Date b_date;
    private String address;
    private String phone;
    private String e_mail;
    @Column(name = "about_me", length = 600)
    private String about_me;
    @Column(name = "img_url", length = 2048)
    private String img_url;

    @OneToMany(targetEntity = Education.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "ed_fk", referencedColumnName = "id")
    private List<Education> educations;

    @OneToMany(targetEntity = Skill.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "sk_fk", referencedColumnName = "id")
    private List<Skill> skillList;

    @OneToMany(targetEntity = Soft.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "sf_fk", referencedColumnName = "id")
    private List<Soft> softList;

    @OneToMany(targetEntity = Experience.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "ex_fk", referencedColumnName = "id")
    private List<Experience> experiences;

    @OneToMany(targetEntity = Project.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "pr_fk", referencedColumnName = "id")
    private List<Project> projects;

    public Person() {
    }

    public Person(String name, String lastname, Date b_date, String address, String phone, String e_mail, String about_me, String img_url, List<Education> educations, List<Skill> skillList, List<Soft> softList, List<Experience> experiences, List<Project> projects) {
        this.name = name;
        this.lastname = lastname;
        this.b_date = b_date;
        this.address = address;
        this.phone = phone;
        this.e_mail = e_mail;
        this.about_me = about_me;
        this.img_url = img_url;
        this.educations = educations;
        this.skillList = skillList;
        this.softList = softList;
        this.experiences = experiences;
        this.projects = projects;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getBirth_date() {
        return b_date;
    }

    public void setBirth_date(Date b_date) {
        this.b_date = b_date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getAbout_me() {
        return about_me;
    }

    public void setAbout_me(String about_me) {
        this.about_me = about_me;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public List<Education> getEducations() {
        return educations;
    }

    public void setEducations(List<Education> educations) {
        this.educations = educations;
    }

    public List<Skill> getSkillList() {
        return skillList;
    }

    public void setSkillList(List<Skill> skillList) {
        this.skillList = skillList;
    }

    public List<Soft> getSoftList() {
        return softList;
    }

    public void setSoftList(List<Soft> softList) {
        this.softList = softList;
    }

    public List<Experience> getExperiences() {
        return experiences;
    }

    public void setExperiences(List<Experience> experiences) {
        this.experiences = experiences;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", b_date=" + b_date +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", e_mail='" + e_mail + '\'' +
                ", about_me='" + about_me + '\'' +
                ", img_url='" + img_url + '\'' +
                ", educations=" + educations +
                ", skillList=" + skillList +
                ", softList=" + softList +
                ", experiences=" + experiences +
                ", projects=" + projects +
                '}';
    }
}
