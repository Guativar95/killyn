/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package killyn.crud.jpa;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import killyn.crud.entitis.TipoDocumento;
import killyn.crud.dao.ITipoDocumentoDAO;

/**
 *
 * @author daniel
 */
@Stateless
public class TipoDocumentoDAO extends AbstractDAO<TipoDocumento> implements ITipoDocumentoDAO {

  

    public TipoDocumentoDAO() {
        super(TipoDocumento.class);
    }
    
}
