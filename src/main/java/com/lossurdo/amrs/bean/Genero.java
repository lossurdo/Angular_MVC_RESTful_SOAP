package com.lossurdo.amrs.bean;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author lossurdo
 */
public class Genero implements Serializable {
    private Integer id;
    private String genero;
    private List<Seriado> seriados;

    public Genero() {
    }

    public Genero(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<Seriado> getSeriados() {
        return seriados;
    }

    public void setSeriados(List<Seriado> seriados) {
        this.seriados = seriados;
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
        if (!(object instanceof Genero)) {
            return false;
        }
        Genero other = (Genero) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Genero{" + "id=" + id + ", genero=" + genero + '}';
    }
    
}
