/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bonificacao;

/**
 *
 * @author andreluizforchesatto
 */
public abstract class Funcionario {
    
    private String nome;
    private Double salario;
    private String cpf;
    
    public abstract Double calculaBonificacao();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}
