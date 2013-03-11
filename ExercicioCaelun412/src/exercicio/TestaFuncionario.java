/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import exercicio.Funcionario;

/**
 *
 * @author andreforchesatto
 */
public class TestaFuncionario {
     public static void main(String[] args) {
        Funcionario f1 = new Funcionario();

        f1.nome = "Hugo";
        f1.salario = 100;
        f1.recebeAumento(50);

        System.out.println("salario atual:" + f1.salario);
        System.out.println("ganho anual:" + f1.calculaGanhoAnual());
        
        f1.demite();
        
        System.out.println("Funcionario demitido?"+f1.estaNaEmpresa);
   }
}
