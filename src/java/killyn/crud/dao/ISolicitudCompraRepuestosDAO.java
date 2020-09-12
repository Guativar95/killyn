/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package killyn.crud.dao;

import java.util.List;
import javax.ejb.Local;
import killyn.crud.entitis.SolicitudCompraRepuestos;

/**
 *
 * @author daniel
 */
@Local
public interface ISolicitudCompraRepuestosDAO {

    void create(SolicitudCompraRepuestos solicitudCompraRepuestos);

    void edit(SolicitudCompraRepuestos solicitudCompraRepuestos);

    void remove(SolicitudCompraRepuestos solicitudCompraRepuestos);

    SolicitudCompraRepuestos find(Object id);

    List<SolicitudCompraRepuestos> findAll();

    List<SolicitudCompraRepuestos> findRange(int[] range);

    int count();
    
}
