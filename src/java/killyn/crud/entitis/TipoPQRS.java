/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package killyn.crud.entitis;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author daniel
 */
@Entity
@Table(name = "tipo_PQRS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoPQRS.findAll", query = "SELECT t FROM TipoPQRS t")
    , @NamedQuery(name = "TipoPQRS.findById", query = "SELECT t FROM TipoPQRS t WHERE t.id = :id")
    , @NamedQuery(name = "TipoPQRS.findByNombre", query = "SELECT t FROM TipoPQRS t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "TipoPQRS.findByDescripcion", query = "SELECT t FROM TipoPQRS t WHERE t.descripcion = :descripcion")
    , @NamedQuery(name = "TipoPQRS.findByEstado", query = "SELECT t FROM TipoPQRS t WHERE t.estado = :estado")})
public class TipoPQRS implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private int estado;
    @ManyToMany(mappedBy = "tipoPQRSList", fetch = FetchType.LAZY)
    private List<Pqr> pqrList;

    public TipoPQRS() {
    }

    public TipoPQRS(Integer id) {
        this.id = id;
    }

    public TipoPQRS(Integer id, String nombre, String descripcion, int estado) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<Pqr> getPqrList() {
        return pqrList;
    }

    public void setPqrList(List<Pqr> pqrList) {
        this.pqrList = pqrList;
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
        if (!(object instanceof TipoPQRS)) {
            return false;
        }
        TipoPQRS other = (TipoPQRS) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "killyn.crud.entitis.TipoPQRS[ id=" + id + " ]";
    }
    
}
