/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

/**
 *
 * @author andreforchesatto
 */
public class Funcionario {
    
    String nome;
    String departamento;
    double salario;
    String dataEntrada;
    String rg;
    boolean estaNaEmpresa = true;
    
  void recebeAumento(double aumento) {
    salario += aumento;
  }
  
  double calculaGanhoAnual() {
    return salario * 12;
  }
  
  void demite(){
      estaNaEmpresa = false;
  }
  
  void mostra(){
      System.out.println("Nome: "+this.nome);
      System.out.println("Departamento: "+this.departamento);
      System.out.println("RG: "+this.rg);
      System.out.println("Ganho anual: "+this.calculaGanhoAnual());
      System.out.println("Demitido?: "+this.estaNaEmpresa);
  }
  
  
}
