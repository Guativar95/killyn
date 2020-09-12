/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package killyn.crud.dao;

import java.util.List;
import javax.ejb.Local;
import killyn.crud.entitis.TipoRepuesto;

/**
 *
 * @author daniel
 */
@Local
public interface ITipoRepuestoDAO {

    void create(TipoRepuesto tipoRepuesto);

    void edit(TipoRepuesto tipoRepuesto);

    void remove(TipoRepuesto tipoRepuesto);

    TipoRepuesto find(Object id);

    List<TipoRepuesto> findAll();

    List<TipoRepuesto> findRange(int[] range);

    int count();
    
}
