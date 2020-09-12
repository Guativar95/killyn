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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author daniel
 */
@Entity
@Table(name = "solicitud_Compra_Repuestos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SolicitudCompraRepuestos.findAll", query = "SELECT s FROM SolicitudCompraRepuestos s")
    , @NamedQuery(name = "SolicitudCompraRepuestos.findById", query = "SELECT s FROM SolicitudCompraRepuestos s WHERE s.id = :id")
    , @NamedQuery(name = "SolicitudCompraRepuestos.findByFecha", query = "SELECT s FROM SolicitudCompraRepuestos s WHERE s.fecha = :fecha")
    , @NamedQuery(name = "SolicitudCompraRepuestos.findByCantidad", query = "SELECT s FROM SolicitudCompraRepuestos s WHERE s.cantidad = :cantidad")
    , @NamedQuery(name = "SolicitudCompraRepuestos.findByEstado", query = "SELECT s FROM SolicitudCompraRepuestos s WHERE s.estado = :estado")})
public class SolicitudCompraRepuestos implements Serializable {

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
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private int estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "solicitudCompraRepuestosid", fetch = FetchType.LAZY)
    private List<OrdenCompraRepuesto> ordenCompraRepuestoList;
    @JoinColumn(name = "logistica_usuario_id", referencedColumnName = "usuario_id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Logistica logisticaUsuarioId;
    @JoinColumn(name = "repuesto_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Repuesto repuestoId;

    public SolicitudCompraRepuestos() {
    }

    public SolicitudCompraRepuestos(Integer id) {
        this.id = id;
    }

    public SolicitudCompraRepuestos(Integer id, Date fecha, int cantidad, int estado) {
        this.id = id;
        this.fecha = fecha;
        this.cantidad = cantidad;
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<OrdenCompraRepuesto> getOrdenCompraRepuestoList() {
        return ordenCompraRepuestoList;
    }

    public void setOrdenCompraRepuestoList(List<OrdenCompraRepuesto> ordenCompraRepuestoList) {
        this.ordenCompraRepuestoList = ordenCompraRepuestoList;
    }

    public Logistica getLogisticaUsuarioId() {
        return logisticaUsuarioId;
    }

    public void setLogisticaUsuarioId(Logistica logisticaUsuarioId) {
        this.logisticaUsuarioId = logisticaUsuarioId;
    }

    public Repuesto getRepuestoId() {
        return repuestoId;
    }

    public void setRepuestoId(Repuesto repuestoId) {
        this.repuestoId = repuestoId;
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
        if (!(object instanceof SolicitudCompraRepuestos)) {
            return false;
        }
        SolicitudCompraRepuestos other = (SolicitudCompraRepuestos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "killyn.crud.entitis.SolicitudCompraRepuestos[ id=" + id + " ]";
    }
    
}
