/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package killyn.crud.jpa;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import killyn.crud.entitis.Proveedor;
import killyn.crud.dao.IProveedorDAO;

/**
 *
 * @author daniel
 */
@Stateless
public class ProveedorDAo extends AbstractDAO<Proveedor> implements IProveedorDAO {

    
    public ProveedorDAo() {
        super(Proveedor.class);
    }
    
}
