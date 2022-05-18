package com.argentinaprograma.porfolio.dto;

public class SoftDto {
    private String skill;
    private String porcentaje;

    public SoftDto() {
    }

    public SoftDto(String skill, String porcentaje) {
        this.skill = skill;
        this.porcentaje = porcentaje;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }
}
