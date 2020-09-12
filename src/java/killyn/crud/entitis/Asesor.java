/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package killyn.crud.entitis;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author daniel
 */
@Entity
@Table(name = "asesor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Asesor.findAll", query = "SELECT a FROM Asesor a")
    , @NamedQuery(name = "Asesor.findByEstado", query = "SELECT a FROM Asesor a WHERE a.estado = :estado")
    , @NamedQuery(name = "Asesor.findByUsuarioId", query = "SELECT a FROM Asesor a WHERE a.usuarioId = :usuarioId")})
public class Asesor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private int estado;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "usuario_id")
    private Integer usuarioId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "asesorUsuarioId", fetch = FetchType.LAZY)
    private List<Pqr> pqrList;
    @JoinColumn(name = "usuario_id", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario usuario;

    public Asesor() {
    }

    public Asesor(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Asesor(Integer usuarioId, int estado) {
        this.usuarioId = usuarioId;
        this.estado = estado;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    @XmlTransient
    public List<Pqr> getPqrList() {
        return pqrList;
    }

    public void setPqrList(List<Pqr> pqrList) {
        this.pqrList = pqrList;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usuarioId != null ? usuarioId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Asesor)) {
            return false;
        }
        Asesor other = (Asesor) object;
        if ((this.usuarioId == null && other.usuarioId != null) || (this.usuarioId != null && !this.usuarioId.equals(other.usuarioId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "killyn.crud.entitis.Asesor[ usuarioId=" + usuarioId + " ]";
    }
    
}
