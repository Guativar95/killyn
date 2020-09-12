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
@Table(name = "despacho")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Despacho.findAll", query = "SELECT d FROM Despacho d")
    , @NamedQuery(name = "Despacho.findById", query = "SELECT d FROM Despacho d WHERE d.id = :id")
    , @NamedQuery(name = "Despacho.findByFecha", query = "SELECT d FROM Despacho d WHERE d.fecha = :fecha")
    , @NamedQuery(name = "Despacho.findByDireccion", query = "SELECT d FROM Despacho d WHERE d.direccion = :direccion")
    , @NamedQuery(name = "Despacho.findByTelefono", query = "SELECT d FROM Despacho d WHERE d.telefono = :telefono")
    , @NamedQuery(name = "Despacho.findByNombre", query = "SELECT d FROM Despacho d WHERE d.nombre = :nombre")
    , @NamedQuery(name = "Despacho.findByCantidad", query = "SELECT d FROM Despacho d WHERE d.cantidad = :cantidad")
    , @NamedQuery(name = "Despacho.findByDescripcion", query = "SELECT d FROM Despacho d WHERE d.descripcion = :descripcion")
    , @NamedQuery(name = "Despacho.findByDespachocol", query = "SELECT d FROM Despacho d WHERE d.despachocol = :despachocol")})
public class Despacho implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "direccion")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "telefono")
    private int telefono;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 125)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 45)
    @Column(name = "despachocol")
    private String despachocol;
    @JoinTable(name = "repuesto_has_despacho", joinColumns = {
        @JoinColumn(name = "despacho_id", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "repuesto_id", referencedColumnName = "id")})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Repuesto> repuestoList;
    @JoinColumn(name = "cliente_usuario_id", referencedColumnName = "usuario_id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Cliente clienteUsuarioId;
    @JoinColumn(name = "factura_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Factura facturaId;
    @JoinColumn(name = "logistica_usuario_id", referencedColumnName = "usuario_id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Logistica logisticaUsuarioId;

    public Despacho() {
    }

    public Despacho(Integer id) {
        this.id = id;
    }

    public Despacho(Integer id, Date fecha, String direccion, int telefono, String nombre, int cantidad, String descripcion) {
        this.id = id;
        this.fecha = fecha;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDespachocol() {
        return despachocol;
    }

    public void setDespachocol(String despachocol) {
        this.despachocol = despachocol;
    }

    @XmlTransient
    public List<Repuesto> getRepuestoList() {
        return repuestoList;
    }

    public void setRepuestoList(List<Repuesto> repuestoList) {
        this.repuestoList = repuestoList;
    }

    public Cliente getClienteUsuarioId() {
        return clienteUsuarioId;
    }

    public void setClienteUsuarioId(Cliente clienteUsuarioId) {
        this.clienteUsuarioId = clienteUsuarioId;
    }

    public Factura getFacturaId() {
        return facturaId;
    }

    public void setFacturaId(Factura facturaId) {
        this.facturaId = facturaId;
    }

    public Logistica getLogisticaUsuarioId() {
        return logisticaUsuarioId;
    }

    public void setLogisticaUsuarioId(Logistica logisticaUsuarioId) {
        this.logisticaUsuarioId = logisticaUsuarioId;
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
        if (!(object instanceof Despacho)) {
            return false;
        }
        Despacho other = (Despacho) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "killyn.crud.entitis.Despacho[ id=" + id + " ]";
    }
    
}
