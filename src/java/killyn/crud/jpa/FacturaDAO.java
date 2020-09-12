/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package killyn.crud.jpa;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import killyn.crud.entitis.Factura;
import killyn.crud.dao.IFacturaDAO;

/**
 *
 * @author daniel
 */
@Stateless
public class FacturaDAO extends AbstractDAO<Factura> implements IFacturaDAO {

   
    public FacturaDAO() {
        super(Factura.class);
    }
    
}
