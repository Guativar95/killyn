/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package killyn.crud.jpa;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import killyn.crud.entitis.Cliente;
import killyn.crud.dao.IClienteDAO;

/**
 *
 * @author daniel
 */
@Stateless
public class ClienteDAO extends AbstractDAO<Cliente> implements IClienteDAO {

  

    public ClienteDAO() {
        super(Cliente.class);
    }
    
}
