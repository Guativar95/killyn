/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.killyn;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import killyn.crud.dao.IUsuarioDAO;
import killyn.crud.entitis.Usuario;


/**
 *
 * @author daniel
 */
@Named(value = "usuarioController")
@RequestScoped
public class UsuarioController implements Serializable {

    @EJB
    private IUsuarioDAO uDAO;
   private List <Usuario> usuario;
    
    public UsuarioController() {
    }
    
   @PostConstruct
   public void init(){
   }

    public List<Usuario> getUsuario() {
        if(usuario == null || usuario.isEmpty() ) {
           usuario = uDAO.findAll();
          
                
           
        }
        return usuario;
        
        
    }
   
}
