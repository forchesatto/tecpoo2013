/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bonificacao;

/**
 *
 * @author andreluizforchesatto
 */
public class Gerente extends Funcionario implements Autenticavel{

    private String usuario;
    private String senha;
    
    @Override
    public Double calculaBonificacao() {
        return getSalario() * 0.1;
    }
    
    @Override
    public String getUsuario() {
        return usuario;
    }

    @Override
    public String getSenha() {
        return senha;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
