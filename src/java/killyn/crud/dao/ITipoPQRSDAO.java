/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package killyn.crud.dao;

import java.util.List;
import javax.ejb.Local;
import killyn.crud.entitis.TipoPQRS;

/**
 *
 * @author daniel
 */
@Local
public interface ITipoPQRSDAO {

    void create(TipoPQRS tipoPQRS);

    void edit(TipoPQRS tipoPQRS);

    void remove(TipoPQRS tipoPQRS);

    TipoPQRS find(Object id);

    List<TipoPQRS> findAll();

    List<TipoPQRS> findRange(int[] range);

    int count();
    
}
