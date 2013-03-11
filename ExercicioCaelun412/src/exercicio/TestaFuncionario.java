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
        Data data = new Data();
        data.ano = 2013;
        data.dia = 1;
        data.mes = 2;
        
        Funcionario f1 = new Funcionario();

        f1.nome = "Hugo";
        f1.salario = 100;
        f1.recebeAumento(50);
        f1.dataEntrada = data;

        f1.demite();

        f1.mostra();

        Funcionario f2 = new Funcionario();
        f1.nome = "Danilo";
        f1.salario = 100;
        f1.dataEntrada = data;

        Funcionario f3 = new Funcionario();
        f2.nome = "Danilo";
        f2.salario = 100;
        f2.dataEntrada = data;

        f2.mostra();
        
        if (f2 == f3) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }
    }
}
