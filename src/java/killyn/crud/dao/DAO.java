/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package killyn.crud.dao;

import java.util.List;
import javax.ejb.Local;
import killyn.crud.entitis.Usuario;

/**
 *
 * @author daniel
 */
@Local
public interface DAO <E>{

    void create(E usuario);

    void edit(E usuario);

    void remove(E usuario);

   E find(Object id);

    List<E> findAll();

    List<E> findRange(int[] range);

    int count();
    
}
