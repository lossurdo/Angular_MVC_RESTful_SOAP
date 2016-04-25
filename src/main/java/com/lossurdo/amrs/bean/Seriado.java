package com.lossurdo.amrs.bean;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author lossurdo
 */
public class Seriado implements Serializable {
    private Integer id;
    private String titulo;
    private String sumario;
    private Integer ano;
    private String urlPoster;
    private String urlTrailerYoutube;
    private Double nota;
    private String criadores;
    private String elenco;
    private boolean finalizado;    
    private List<Genero> generos;

    public Seriado() {
    }

    public Seriado(Integer id) {
        this.id = id;
    }

    public Seriado(Integer id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public Seriado(Integer id, String sumario, boolean finalizado) {
        this.id = id;
        this.sumario = sumario;
        this.finalizado = finalizado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSumario() {
        return sumario;
    }

    public void setSumario(String sumario) {
        this.sumario = sumario;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getUrlPoster() {
        return urlPoster;
    }

    public void setUrlPoster(String urlPoster) {
        this.urlPoster = urlPoster;
    }

    public String getUrlTrailerYoutube() {
        return urlTrailerYoutube;
    }

    public void setUrlTrailerYoutube(String urlTrailerYoutube) {
        this.urlTrailerYoutube = urlTrailerYoutube;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getCriadores() {
        return criadores;
    }

    public void setCriadores(String criadores) {
        this.criadores = criadores;
    }

    public String getElenco() {
        return elenco;
    }

    public void setElenco(String elenco) {
        this.elenco = elenco;
    }

    public boolean getFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public List<Genero> getGeneros() {
        return generos;
    }

    public void setGeneros(List<Genero> generos) {
        this.generos = generos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Seriado)) {
            return false;
        }
        Seriado other = (Seriado) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Seriado{" + "id=" + id + ", titulo=" + titulo + ", sumario=" + sumario + ", ano=" + ano + ", urlPoster=" + urlPoster + ", urlTrailerYoutube=" + urlTrailerYoutube + ", nota=" + nota + ", criadores=" + criadores + ", elenco=" + elenco + ", finalizado=" + finalizado + ", generos=" + generos + '}';
    }
    
}
