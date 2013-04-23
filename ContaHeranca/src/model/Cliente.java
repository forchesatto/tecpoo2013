package model;



import java.util.ArrayList;
import java.util.List;

/**
 * @author andreforchesatto
 */
public class Cliente {

    private String nome;
    private String cpf;
    
    private List<Conta> contas;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Cliente() {
        
    }
    
    public void addConta(Conta conta){
        if(contas == null){
            contas = new ArrayList();
        }
        contas.add(conta);
    }
    
    public void removeConta(Conta conta){
        if(contas != null){
            contas.remove(conta);
        }
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
    
}
