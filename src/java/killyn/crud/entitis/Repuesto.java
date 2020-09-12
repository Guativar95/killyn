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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Table(name = "repuesto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Repuesto.findAll", query = "SELECT r FROM Repuesto r")
    , @NamedQuery(name = "Repuesto.findById", query = "SELECT r FROM Repuesto r WHERE r.id = :id")
    , @NamedQuery(name = "Repuesto.findByFechaRegistroRepuesto", query = "SELECT r FROM Repuesto r WHERE r.fechaRegistroRepuesto = :fechaRegistroRepuesto")
    , @NamedQuery(name = "Repuesto.findByNombre", query = "SELECT r FROM Repuesto r WHERE r.nombre = :nombre")
    , @NamedQuery(name = "Repuesto.findByCantidad", query = "SELECT r FROM Repuesto r WHERE r.cantidad = :cantidad")
    , @NamedQuery(name = "Repuesto.findByMarca", query = "SELECT r FROM Repuesto r WHERE r.marca = :marca")
    , @NamedQuery(name = "Repuesto.findByDescripcion", query = "SELECT r FROM Repuesto r WHERE r.descripcion = :descripcion")
    , @NamedQuery(name = "Repuesto.findByValorCompra", query = "SELECT r FROM Repuesto r WHERE r.valorCompra = :valorCompra")
    , @NamedQuery(name = "Repuesto.findByValorVenta", query = "SELECT r FROM Repuesto r WHERE r.valorVenta = :valorVenta")
    , @NamedQuery(name = "Repuesto.findByEstado", query = "SELECT r FROM Repuesto r WHERE r.estado = :estado")})
public class Repuesto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_Registro_Repuesto")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistroRepuesto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "marca")
    private String marca;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor_Compra")
    private double valorCompra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor_Venta")
    private double valorVenta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private int estado;
    @ManyToMany(mappedBy = "repuestoList", fetch = FetchType.LAZY)
    private List<Despacho> despachoList;
    @ManyToMany(mappedBy = "repuestoList", fetch = FetchType.LAZY)
    private List<Pedido> pedidoList;
    @ManyToMany(mappedBy = "repuestoList", fetch = FetchType.LAZY)
    private List<OrdenCompraRepuesto> ordenCompraRepuestoList;
    @ManyToMany(mappedBy = "repuestoList", fetch = FetchType.LAZY)
    private List<Factura> facturaList;
    @ManyToMany(mappedBy = "repuestoList", fetch = FetchType.LAZY)
    private List<Proveedor> proveedorList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "repuestoId", fetch = FetchType.LAZY)
    private List<SolicitudCompraRepuestos> solicitudCompraRepuestosList;
    @JoinColumn(name = "tipo_Repuesto_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TipoRepuesto tipoRepuestoid;

    public Repuesto() {
    }

    public Repuesto(Integer id) {
        this.id = id;
    }

    public Repuesto(Integer id, Date fechaRegistroRepuesto, String nombre, int cantidad, String marca, String descripcion, double valorCompra, double valorVenta, int estado) {
        this.id = id;
        this.fechaRegistroRepuesto = fechaRegistroRepuesto;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.marca = marca;
        this.descripcion = descripcion;
        this.valorCompra = valorCompra;
        this.valorVenta = valorVenta;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaRegistroRepuesto() {
        return fechaRegistroRepuesto;
    }

    public void setFechaRegistroRepuesto(Date fechaRegistroRepuesto) {
        this.fechaRegistroRepuesto = fechaRegistroRepuesto;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(double valorVenta) {
        this.valorVenta = valorVenta;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<Despacho> getDespachoList() {
        return despachoList;
    }

    public void setDespachoList(List<Despacho> despachoList) {
        this.despachoList = despachoList;
    }

    @XmlTransient
    public List<Pedido> getPedidoList() {
        return pedidoList;
    }

    public void setPedidoList(List<Pedido> pedidoList) {
        this.pedidoList = pedidoList;
    }

    @XmlTransient
    public List<OrdenCompraRepuesto> getOrdenCompraRepuestoList() {
        return ordenCompraRepuestoList;
    }

    public void setOrdenCompraRepuestoList(List<OrdenCompraRepuesto> ordenCompraRepuestoList) {
        this.ordenCompraRepuestoList = ordenCompraRepuestoList;
    }

    @XmlTransient
    public List<Factura> getFacturaList() {
        return facturaList;
    }

    public void setFacturaList(List<Factura> facturaList) {
        this.facturaList = facturaList;
    }

    @XmlTransient
    public List<Proveedor> getProveedorList() {
        return proveedorList;
    }

    public void setProveedorList(List<Proveedor> proveedorList) {
        this.proveedorList = proveedorList;
    }

    @XmlTransient
    public List<SolicitudCompraRepuestos> getSolicitudCompraRepuestosList() {
        return solicitudCompraRepuestosList;
    }

    public void setSolicitudCompraRepuestosList(List<SolicitudCompraRepuestos> solicitudCompraRepuestosList) {
        this.solicitudCompraRepuestosList = solicitudCompraRepuestosList;
    }

    public TipoRepuesto getTipoRepuestoid() {
        return tipoRepuestoid;
    }

    public void setTipoRepuestoid(TipoRepuesto tipoRepuestoid) {
        this.tipoRepuestoid = tipoRepuestoid;
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
        if (!(object instanceof Repuesto)) {
            return false;
        }
        Repuesto other = (Repuesto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "killyn.crud.entitis.Repuesto[ id=" + id + " ]";
    }
    
}
