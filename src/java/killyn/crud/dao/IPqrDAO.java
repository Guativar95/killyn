/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package killyn.crud.dao;

import java.util.List;
import javax.ejb.Local;
import killyn.crud.entitis.Pqr;

/**
 *
 * @author daniel
 */
@Local
public interface IPqrDAO {

    void create(Pqr pqr);

    void edit(Pqr pqr);

    void remove(Pqr pqr);

    Pqr find(Object id);

    List<Pqr> findAll();

    List<Pqr> findRange(int[] range);

    int count();
    
}
