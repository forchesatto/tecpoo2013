package bonificacao;

/**
 *
 * @author andreluizforchesatto
 */
public class Contador extends Funcionario implements Autenticavel{
    
    private String usuario;
    private String senha;

    public Contador() {
    }
    
    @Override
    public Double calculaBonificacao() {
        return getSalario() * 0.05;
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
