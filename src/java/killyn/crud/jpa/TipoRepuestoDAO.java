/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package killyn.crud.jpa;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import killyn.crud.entitis.TipoRepuesto;
import killyn.crud.dao.ITipoRepuestoDAO;

/**
 *
 * @author daniel
 */
@Stateless
public class TipoRepuestoDAO extends AbstractDAO<TipoRepuesto> implements ITipoRepuestoDAO {

    @PersistenceContext(unitName = "KillynPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoRepuestoDAO() {
        super(TipoRepuesto.class);
    }
    
}
