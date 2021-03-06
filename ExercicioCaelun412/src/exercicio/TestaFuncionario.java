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

        f1.setNome("Hugo");
        f1.setSalario(100);
        f1.recebeAumento(50);
        f1.setDataEntrada(data);

        f1.demite();
        System.out.println("===Dados funcionario 1====");
        f1.mostra();
        System.out.println("===Fim Dados funcionario 1====");
        
        Funcionario f2 = new Funcionario();
        f2.setNome("Danilo");
        f2.setSalario(100);
        f2.setDataEntrada(data);
        System.out.println("===Dados funcionario 2====");
        f2.mostra();
        System.out.println("===Fim Dados funcionario 2====");

        Funcionario f3 = new Funcionario();
        f3.setNome("Danilo");
        f3.setSalario(100);
        f3.setDataEntrada(data);
        System.out.println("===Dados funcionario 3====");
        f3.mostra();
        System.out.println("===Fim Dados funcionario 3====");
        
        
        System.out.println("====Comparando funcionario 2 com 3====");
        if (f2 == f3) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }
    }
}
