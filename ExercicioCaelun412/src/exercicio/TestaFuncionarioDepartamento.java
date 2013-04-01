/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

/**
 *
 * @author andreforchesatto
 */
public class TestaFuncionarioDepartamento {
 
    public static void main(String args[]){
        Departamento dep1 = new Departamento();
        dep1.setNome("Contabilidade");
        
        Departamento dep2 = new Departamento();
        dep2.setNome("TI");
        
        Funcionario fun1 = new Funcionario();
        fun1.setNome("André");
        
        Funcionario fun2 = new Funcionario();
        fun2.setNome("João");
        
        
        dep1.addFuncionario(fun1);
        dep2.addFuncionario(fun2);

        System.out.println("Tamanho da lista: "+dep1.getFuncionarios().size());
        
        dep1.removeFuncionario(fun2);
        
        System.out.println("Tamanho da lista depois de remover: "+dep1.getFuncionarios().size());
    }
}
