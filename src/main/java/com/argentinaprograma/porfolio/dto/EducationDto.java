package com.argentinaprograma.porfolio.dto;

public class EducationDto {
    private String tituloEducation;
    private String casaDeEducation;
    private String fechaInicio;
    private String fechaTermino;
    private String urlLogo;

    public EducationDto() {
    }

    public EducationDto(String tituloEducation, String casaDeEducation, String fechaInicio, String fechaTermino, String urlLogo) {
        this.tituloEducation = tituloEducation;
        this.casaDeEducation = casaDeEducation;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
        this.urlLogo = urlLogo;
    }

    public String getTituloEducation() {
        return tituloEducation;
    }

    public void setTituloEducation(String tituloEducation) {
        this.tituloEducation = tituloEducation;
    }

    public String getCasaDeEducation() {
        return casaDeEducation;
    }

    public void setCasaDeEducation(String casaDeEducation) {
        this.casaDeEducation = casaDeEducation;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(String fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    public String getUrlLogo() {
        return urlLogo;
    }

    public void setUrlLogo(String urlLogo) {
        this.urlLogo = urlLogo;
    }
}
