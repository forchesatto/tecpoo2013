/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andreforchesatto
 */
public class Departamento {
    
    private Integer codigo;
    private String nome;
    private Empresa empresa;
    private List<Funcionario> funcionarios; //possui vários funcionários

    /**
     * Adiciona um funcionário novo ao departamento
     * @param funcionario 
     */
    public void addFuncionario(Funcionario funcionario){
       if(funcionarios == null){
           funcionarios = new ArrayList<Funcionario>();
       }
       funcionario.setDepartamento(this);
       funcionarios.add(funcionario);
    }
    /**
     * Remove um funcionário da lista de funcionários do departamento
     * @param funcionario 
     */
    public void removeFuncionario(Funcionario funcionario){
        if(funcionarios != null){
            funcionarios.remove(funcionario);
        }
    }
    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

}
