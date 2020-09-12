/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package killyn.crud.jpa;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import killyn.crud.entitis.Vendedor;
import killyn.crud.dao.IVendedorDAO;

/**
 *
 * @author daniel
 */
@Stateless
public class VendedorDAO extends AbstractDAO<Vendedor> implements IVendedorDAO {

   

    public VendedorDAO() {
        super(Vendedor.class);
    }
    
}
