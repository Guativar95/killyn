/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package killyn.crud.jpa;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import killyn.crud.entitis.Logistica;
import killyn.crud.dao.ILogisticaDAO;

/**
 *
 * @author daniel
 */
@Stateless
public class LogisticaDAO extends AbstractDAO<Logistica> implements ILogisticaDAO {


    public LogisticaDAO() {
        super(Logistica.class);
    }
    
}
