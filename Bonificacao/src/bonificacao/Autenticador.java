/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bonificacao;

import java.util.List;

/**
 *
 * @author andreluizforchesatto
 */
public class Autenticador {

    private List<Autenticavel> todosAutenticaveis;
    
    public boolean autentica(Autenticavel autenticavel){
        for(Autenticavel aut: todosAutenticaveis){
            if(aut.getSenha().equals(autenticavel.getSenha()) 
                    && aut.getUsuario().equals(autenticavel.getUsuario()) ){
                return true;
            }
        }
        
        return false;
    }

    public void setTodosAutenticaveis(List<Autenticavel> todosAutenticaveis) {
        this.todosAutenticaveis = todosAutenticaveis;
    }
    
}

