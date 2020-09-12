/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package killyn.crud.jpa;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import killyn.crud.entitis.SolicitudCompraRepuestos;
import killyn.crud.dao.ISolicitudCompraRepuestosDAO;

/**
 *
 * @author daniel
 */
@Stateless
public class SolicitudCompraRepuestosDAO extends AbstractDAO<SolicitudCompraRepuestos> implements ISolicitudCompraRepuestosDAO {

   

    public SolicitudCompraRepuestosDAO() {
        super(SolicitudCompraRepuestos.class);
    }
    
}
