/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package killyn.crud.entitis;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author daniel
 */
@Entity
@Table(name = "PQRS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pqr.findAll", query = "SELECT p FROM Pqr p")
    , @NamedQuery(name = "Pqr.findById", query = "SELECT p FROM Pqr p WHERE p.id = :id")
    , @NamedQuery(name = "Pqr.findByFecha", query = "SELECT p FROM Pqr p WHERE p.fecha = :fecha")
    , @NamedQuery(name = "Pqr.findByDescripcion", query = "SELECT p FROM Pqr p WHERE p.descripcion = :descripcion")
    , @NamedQuery(name = "Pqr.findByEstado", query = "SELECT p FROM Pqr p WHERE p.estado = :estado")})
public class Pqr implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private int estado;
    @JoinTable(name = "PQRS_has_tipo_PQRS", joinColumns = {
        @JoinColumn(name = "PQRS_id", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "tipo_PQRS_id", referencedColumnName = "id")})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<TipoPQRS> tipoPQRSList;
    @JoinColumn(name = "asesor_usuario_id", referencedColumnName = "usuario_id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Asesor asesorUsuarioId;
    @JoinColumn(name = "cliente_usuario_id", referencedColumnName = "usuario_id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Cliente clienteUsuarioId;

    public Pqr() {
    }

    public Pqr(Integer id) {
        this.id = id;
    }

    public Pqr(Integer id, Date fecha, String descripcion, int estado) {
        this.id = id;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
    public List<TipoPQRS> getTipoPQRSList() {
        return tipoPQRSList;
    }

    public void setTipoPQRSList(List<TipoPQRS> tipoPQRSList) {
        this.tipoPQRSList = tipoPQRSList;
    }

    public Asesor getAsesorUsuarioId() {
        return asesorUsuarioId;
    }

    public void setAsesorUsuarioId(Asesor asesorUsuarioId) {
        this.asesorUsuarioId = asesorUsuarioId;
    }

    public Cliente getClienteUsuarioId() {
        return clienteUsuarioId;
    }

    public void setClienteUsuarioId(Cliente clienteUsuarioId) {
        this.clienteUsuarioId = clienteUsuarioId;
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
        if (!(object instanceof Pqr)) {
            return false;
        }
        Pqr other = (Pqr) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "killyn.crud.entitis.Pqr[ id=" + id + " ]";
    }
    
}
